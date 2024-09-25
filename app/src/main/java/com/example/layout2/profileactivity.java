package com.example.layout2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;

public class profileactivity extends AppCompatActivity {
    ImageView profilePic;
    EditText usernameInput;
    EditText phoneInput;
    EditText emailInput;
    Button updateProfileBtn;
    ProgressBar progressBar;
    TextView logoutBtn;
    String gname,gemail,gphone, upusename,upusephno;

    Task<Uri> firebaseStorage;
    public static final String SHARED_PREFS = "sharedPrefs";

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileactivity);
        profilePic = findViewById(R.id.profile_image_view);
        usernameInput =findViewById(R.id.profile_username);
        emailInput= findViewById(R.id.profile_Email);
        phoneInput = findViewById(R.id.profile_phone);
        updateProfileBtn = findViewById(R.id.profle_update_btn);
        progressBar = findViewById(R.id.profile_progress_bar);
        auth=FirebaseAuth.getInstance();

        FirebaseUser firebaseUser=auth.getCurrentUser();

        if(firebaseUser == null){
            Toast.makeText(this, "user id is empty!!", Toast.LENGTH_SHORT).show();
        }else {
            progressBar.setVisibility(View.VISIBLE);
            showprofile(firebaseUser);
        }
        updateProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                updateprofile();
            }
        });

    }

    private void showprofile(FirebaseUser firebaseUser) {
        String useruid = firebaseUser.getUid();

        firebaseStorage = FirebaseStorage.getInstance().getReference()
                .child("Uploadpic")
                .child(useruid)
                .getDownloadUrl().addOnCompleteListener(new OnCompleteListener<Uri>() {
                    @Override
                    public void onComplete(@NonNull Task<Uri> task) {
                        if (task.isSuccessful()) {
                            Uri downloadUri = task.getResult();
                            // Load the profile picture into the ImageView using Glide or any other image loading library
                            Glide.with(profileactivity.this).load(downloadUri).apply(RequestOptions.circleCropTransform()).into(profilePic);
                        } else {
                            // Handle the failure to retrieve the download URL
                            Toast.makeText(profileactivity.this, "Failed to retrieve profile picture", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

        DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference("uid");
        databaseReference.child(useruid).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Users users=snapshot.getValue(Users.class);
                if(users != null){
                    gname=users.name;
                    gemail=firebaseUser.getEmail();
                    gphone=users.phonenum;

                    usernameInput.setText(gname);
                    emailInput.setText(gemail);
                    phoneInput.setText(gphone);


                    Uri uri= firebaseUser.getPhotoUrl();

                }else {
                    Toast.makeText(profileactivity.this, "Something Went Wrong!!", Toast.LENGTH_SHORT).show();
                }
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(profileactivity.this, "something went wrong!!!", Toast.LENGTH_SHORT).show();
                progressBar.setVisibility(View.GONE);
            }
        });
    }
    private void updateprofile() {
        progressBar.setVisibility(View.GONE);

        Fragment myfragment= new updatepicactivity();
        FragmentTransaction fragmentTransaction= getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerabc,myfragment,null ).addToBackStack(null).commit();
    }


}