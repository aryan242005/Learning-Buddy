package com.example.layout2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hbb20.CountryCodePicker;


public class signinactivity extends AppCompatActivity {
    EditText namegt,emailgt,phonegt,passgt;



    String gname,gemail,gphone,gpass;
    FirebaseDatabase db;
    DatabaseReference reference;

    FirebaseAuth auth= FirebaseAuth.getInstance();

    Button signbt;
    CountryCodePicker codePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        codePicker = findViewById(R.id.codepicker);
        phonegt= findViewById(R.id.getphonenumbyuser);
        namegt= findViewById(R.id.getnamebyuser);
        passgt= findViewById(R.id.getpasswordbyuser);
        emailgt = findViewById(R.id.getemailbyuser);
        signbt = findViewById(R.id.signbutton);
        codePicker.registerCarrierNumberEditText(phonegt);
        signbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!codePicker.isValidFullNumber()){
                    phonegt.setError("Please Enter Valid Number");
                    return;
                }
                //  Intent intent=new Intent(signinactivity.this,MainActivity.class);
                // intent.putExtra("mobile",codePicker.getFullNumberWithPlus());
                //   startActivity(intent);
                //   finish();

                gname= namegt.getText().toString();
                gemail= emailgt.getText().toString();
                gphone = phonegt.getText().toString();
                gpass = passgt.getText().toString();

                auth.createUserWithEmailAndPassword(emailgt.getText().toString().trim(),passgt.getText().toString().trim()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            if(!gname.isEmpty() && !gemail.isEmpty() && !gphone.isEmpty() && !gpass.isEmpty()){
                                Users users= new Users(gname,gemail,gphone,gpass);
                                FirebaseUser firebaseUser=auth.getCurrentUser();
                                db = FirebaseDatabase.getInstance();
                                reference= db.getReference("uid");
                                reference.child(firebaseUser.getUid()).setValue(users).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        namegt.setText("");
                                        emailgt.setText("");
                                        phonegt.setText("");
                                        passgt.setText("");
                                        auth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                if (task.isSuccessful()){
                                                    Toast.makeText(signinactivity.this, "Please Verify Your Email", Toast.LENGTH_SHORT).show();
                                                    Intent intent= new Intent(signinactivity.this,MainActivity.class);
                                                    startActivity(intent);
                                                    finish();
                                                }
                                                else{
                                                    Toast.makeText(signinactivity.this, "Sing up is Failed not Verify"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                                }
                                            }
                                        });

                                    }
                                });
                            }
                        }
                        else{
                            Toast.makeText(signinactivity.this, "Sing up Failed"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });

            }
        });
    }

}