package com.example.layout2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class updatepicactivity extends Fragment {


    ImageView profilePic;
    Button updateProfileBtn, updateprofilechangebtn;
    ProgressBar progressBar;
    ActivityResultLauncher<Intent> imagePickLauncher;
    Uri selectedImageUri;

    StorageTask<UploadTask.TaskSnapshot> firebaseStorage;
    FirebaseAuth auth;

    public updatepicactivity() {

    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imagePickLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if(result.getResultCode() == Activity.RESULT_OK){
                        Intent data = result.getData();
                        if(data!=null && data.getData()!=null){
                            Glide.with(this).load(selectedImageUri).apply(RequestOptions.circleCropTransform()).into(profilePic);
                            selectedImageUri = data.getData();
                        }
                    }
                }
        );
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_updatepicactivity, container, false);
        profilePic=view.findViewById(R.id.imageView_profile_dp);
        updateprofilechangebtn=view.findViewById(R.id.upload_pic_choose_button);
        updateProfileBtn=view.findViewById(R.id.upload_pic_button);
        progressBar=view.findViewById(R.id.progressBar);

        updateprofilechangebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pic();
            }
        });

        updateProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth= FirebaseAuth.getInstance();
                FirebaseUser firebaseUser= auth.getCurrentUser();
                String uidch= firebaseUser.getUid();

                if (selectedImageUri != null){
                    firebaseStorage= FirebaseStorage.getInstance().getReference()
                            .child("Uploadpic")
                            .child(uidch)
                            .putFile(selectedImageUri).addOnCompleteListener(new OnCompleteListener<UploadTask.TaskSnapshot>() {
                                @Override
                                public void onComplete(@NonNull Task<UploadTask.TaskSnapshot> task) {
                                    Toast.makeText(getContext(), "photo uploaded successfully", Toast.LENGTH_SHORT).show();
                                }
                            });
                }
            }
        });
        return view;
    }

    private void pic() {
        ImagePicker.with(this).cropSquare().compress(512).maxResultSize(512,512)
                .createIntent(new Function1<Intent, Unit>() {
                    @Override
                    public Unit invoke(Intent intent) {
                        imagePickLauncher.launch(intent);
                        return null;
                    }
                });

    }
}