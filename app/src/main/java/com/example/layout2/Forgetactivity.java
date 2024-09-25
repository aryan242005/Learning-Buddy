package com.example.layout2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;

//import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class Forgetactivity extends AppCompatActivity {

    EditText foremilgt,passreset;
    Button forgtbt;
    TextView bklgtx;



  FirebaseAuth mauth= FirebaseAuth.getInstance();
    public String strusername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetactivity);

        foremilgt =findViewById(R.id.forgetemail);
       // passreset =findViewById(R.id.forgetpass);
        forgtbt =findViewById(R.id.forget_button);
        bklgtx = findViewById(R.id.baktolotxt);

       
        forgtbt.setOnClickListener(v -> {
            strusername = foremilgt.getText().toString();
            //strpass = passreset.getText().toString();
            if (!strusername.isEmpty()){
                mauth.sendPasswordResetEmail(strusername).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(Forgetactivity.this, "check Your Email", Toast.LENGTH_SHORT).show();
                                Intent intent= new Intent(Forgetactivity.this, MainActivity.class);
                                finish();
                            }
                            else{
                                Toast.makeText(Forgetactivity.this, "Error="+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                    }
                });


            }else{
                forgtbt.setError("please Enter Email ");
                //passreset.setError("Please Enter New Password");
            }
        });


        bklgtx.setOnClickListener(v -> {
            startActivity(new Intent(Forgetactivity.this,MainActivity.class));
            finish();
        });

    }

  /*private void resetpassword() {

        strusername= foremilgt.getText().toString();
        strpass= passreset.getText().toString();
      HashMap<String, Object> chpass= new HashMap<String, Object>();
      chpass.put("password",strpass);
      DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("Users");
      Query checkid = databaseReference.orderByChild("name").equalTo(strusername);
checkid.addListenerForSingleValueEvent(new ValueEventListener() {
    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {
        if (snapshot.exists())
        {
            databaseReference.child(strusername).updateChildren(chpass).addOnCompleteListener((OnCompleteListener<Void>) task -> {
                    if(task.isSuccessful()){
                        foremilgt.setText("");
                        passreset.setText("");
                        Intent intent=new Intent(Forgetactivity.this,MainActivity.class);
                        startActivity(intent);
                        Toast.makeText(Forgetactivity.this, "Password Changed Successfully", Toast.LENGTH_SHORT).show();
                        finish();
                    }
            });
        }else {
            foremilgt.setError("Username Is Not Exist");
        }
    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {

    }
});
    } */
}