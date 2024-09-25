package com.example.layout2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {
    EditText usernamegt,passget;

    TextView newusertxt, forgotpastxt;

    public static final String SHARED_PREFS = "sharedPrefs";

    FirebaseAuth auth= FirebaseAuth.getInstance();
    Button logbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        usernamegt= findViewById(R.id.loginuser);
        passget =findViewById(R.id.login_password);
        newusertxt =findViewById(R.id.newusercracctxt);
        forgotpastxt = findViewById(R.id.forgotpasstxt);
        logbt = findViewById(R.id.login_button);

        checkbox();

        logbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailgt= usernamegt.getText().toString();
                String passgt = passget.getText().toString();
                if( !emailgt.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailgt).matches()){
                    if(!passgt.isEmpty()){
                        auth.signInWithEmailAndPassword(emailgt,passgt).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                if(auth.getCurrentUser().isEmailVerified()){
                                    SharedPreferences sharedPreferences= getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                                    SharedPreferences.Editor editor= sharedPreferences.edit();
                                    editor.putString("name","true");
                                    editor.apply();
                                    usernamegt.setError(null);
                                    Intent intent = new Intent(MainActivity.this,HomePage.class);
                                    startActivity(intent);
                                    finish();
                                }
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                            }
                        });


                    }else {
                        usernamegt.setError("Password is Incorrect");
                    }

                } else if (emailgt.isEmpty()) {
                           usernamegt.setError("Email Address is empty");
                } else{
                    usernamegt.setError("Email Address is Invalid");
                }
            }
        });
        newusertxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,signinactivity.class));
                finish();
            }
        });

        forgotpastxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Forgetactivity.class);

                startActivity(intent);

            }
        });
    }

    private void checkbox() {
        SharedPreferences sharedPreferences= getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        String check = sharedPreferences.getString("name", "");
        if (check.equals("true")){
            Toast.makeText(this, "Already User", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,HomePage.class);
            startActivity(intent);
            finish();
        }
    }

    public Boolean validusernm(){
        String Val = usernamegt.getText().toString();
        if(Val.isEmpty()){
            usernamegt.setError("Please Enter username");
            return false;
        }else {
            usernamegt.setError(null);
            return true;
        }
    }
    public Boolean validnumber(){
        String Val = passget.getText().toString();
        if(Val.isEmpty()){
            passget.setError("Please Enter Password");
            return false;
        }else {
            usernamegt.setError(null);
            return true;
        }
    }
   /* public  void checkuser(){
        String username = usernamegt.getText().toString().trim();
        String passwordch = passget.getText().toString().trim();
        DatabaseReference db= FirebaseDatabase.getInstance().getReference("Users");
        Query checkuserid = db.orderByChild("name").equalTo(username);

        checkuserid.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    usernamegt.setError(null);

                    String passwordfromdb = snapshot.child(username).child("password").getValue(String.class);

                    if (Objects.equals(passwordfromdb, passwordch)){
                        SharedPreferences sharedPreferences= getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
                        SharedPreferences.Editor editor= sharedPreferences.edit();
                        editor.putString("name","true");
                        editor.apply();
                        usernamegt.setError(null);
                        Intent intent = new Intent(MainActivity.this,HomePage.class);
                        startActivity(intent);
                        finish();
                    }else{
                        passget.setError("Invalid Password");
                        passget.requestFocus();
                    }
                }else {
                    usernamegt.setError("Invalid Username");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    } */


}