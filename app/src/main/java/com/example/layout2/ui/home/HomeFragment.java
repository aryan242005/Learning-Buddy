package com.example.layout2.ui.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.layout2.chapters.Course1;
import com.example.layout2.R;
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    CardView course1,course2,course3,course4,course5;
    ImageView img1,img2,img3,img4,img5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        img1 = view.findViewById(R.id.img1);
        img1.setClipToOutline(true);
        img2 = view.findViewById(R.id.img2);
        img2.setClipToOutline(true);
        img3 = view.findViewById(R.id.img3);
        img3.setClipToOutline(true);
        img4 = view.findViewById(R.id.img4);
        img4.setClipToOutline(true);
        img5 = view.findViewById(R.id.img5);
        img5.setClipToOutline(true);

        loadImage();

        course1 = view.findViewById(R.id.course1);
        course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Course1.class);
                intent.putExtra("language","course1");
                startActivity(intent);
            }
        });

        course2 = view.findViewById(R.id.course2);
        course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Course1.class);
                intent.putExtra("language","course2");
                startActivity(intent);
            }
        });

        course3 = view.findViewById(R.id.course3);
        course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Course1.class);
                intent.putExtra("language","course3");
                startActivity(intent);
            }
        });

        course4 = view.findViewById(R.id.course4);
        course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Course1.class);
                intent.putExtra("language","course4");
                startActivity(intent);
            }
        });

        course5 = view.findViewById(R.id.course5);
        course5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), Course1.class);
                intent.putExtra("language","course5");
                startActivity(intent);
            }
        });
        return view;
    }
    public void loadImage()
    {
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/java.png?alt=media&token=3133bc6e-63b0-470c-b9d9-6a2a0875ae9c")
                .into(img1);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/python.png?alt=media&token=0503b232-fc86-4962-891b-bf361de21fad")
                .into(img2);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/javascript.png?alt=media&token=d5b37824-3394-4023-a1ca-23e55855ecd3")
                .into(img3);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/php.png?alt=media&token=c4365598-7c53-49ef-9d72-023a54fb430d")
                .into(img4);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/cplus.png?alt=media&token=82d50a34-caa9-4a2b-b473-83f10c0a01e9")
                .into(img5);
    }
}