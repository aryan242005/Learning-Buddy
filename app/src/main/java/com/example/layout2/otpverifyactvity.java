package com.example.layout2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;


public class otpverifyactvity extends AppCompatActivity {
    EditText otpgt;
    Button verifybt;
    ProgressBar progbar2;
    TextView resendoptp;
    String phonenum;
     String verificationcode;
    PhoneAuthProvider.ForceResendingToken ResendingToken;
    Long timeout = 60L;
    FirebaseAuth mauth= FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpverifyactvity);
        otpgt = findViewById(R.id.verifyotptext);
        verifybt= findViewById(R.id.verifybutton);
        progbar2 = findViewById(R.id.progbar2);
        resendoptp = findViewById(R.id.resendotptext);

        phonenum=getIntent().getExtras().getString("mobile");


        sendotp(phonenum,false);

        verifybt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String otpverifytext = otpgt.getText().toString();
                PhoneAuthCredential credential= PhoneAuthProvider.getCredential(verificationcode, otpverifytext);
                signact(credential);

            }
        });

        resendoptp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendotp(phonenum,true);
            }
        });

    }

   void sendotp(String phonenm, boolean isresend){
        
        resendtimer();
       progvisble(true);
       PhoneAuthOptions.Builder  builder= PhoneAuthOptions.newBuilder(mauth)

               .setPhoneNumber(phonenm)
               .setTimeout(timeout, TimeUnit.SECONDS)
               .setActivity(this)
               .setCallbacks(new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                   @Override
                   public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                       signact(phoneAuthCredential);
                       progvisble(false);
                   }



                   @Override
                   public void onVerificationFailed(@NonNull FirebaseException e) {
                       Toast.makeText(otpverifyactvity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                       progvisble(false);
                   }

                   @Override
                   public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                       super.onCodeSent(s, forceResendingToken);
                       verificationcode = s;
                       ResendingToken = forceResendingToken;
                       Toast.makeText(otpverifyactvity.this, "OTP Sent Successfully", Toast.LENGTH_SHORT).show();
                       progvisble(false);
                   }
               });
       if(isresend){
           PhoneAuthProvider.verifyPhoneNumber(builder.setForceResendingToken(ResendingToken).build());
       }else {
           PhoneAuthProvider.verifyPhoneNumber(builder.build());
       }
   }



    private void progvisble(boolean progin) {
        if (progin) {
            progbar2.setVisibility(View.VISIBLE);
            verifybt.setVisibility(View.GONE);
        }
        else{
            progbar2.setVisibility(View.GONE);
            verifybt.setVisibility(View.VISIBLE);
        }
    }
    private void signact(PhoneAuthCredential phoneAuthCredential) {

        progvisble(true);
        mauth.signInWithCredential(phoneAuthCredential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    progvisble(false);
                    Intent intent= new Intent(otpverifyactvity.this,MainActivity.class);
                    intent.putExtra("phone",phonenum);
                    startActivity(intent);
                }else {
                    Toast.makeText(otpverifyactvity.this, "OTP verification Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void resendtimer() {

        resendoptp.setEnabled(false);
        Timer timer= new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                    timeout--;
                    resendoptp.setText("Resend you OTP in seconds "+timeout);
                    if (timeout <= 0){
                        timeout=60L;
                        timer.cancel();
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                resendoptp.setEnabled(true);
                            }
                        });
                    }
            }
        },0,1000);
    }
}