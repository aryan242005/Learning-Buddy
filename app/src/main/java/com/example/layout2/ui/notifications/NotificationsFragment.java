package com.example.layout2.ui.notifications;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.layout2.R;
public class NotificationsFragment extends Fragment {

    public NotificationsFragment() {
        // Required empty public constructor
    }

    ImageButton course1,course2,course3,course4,course5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);

        course1 = view.findViewById(R.id.course1);
        course1.setClipToOutline(true);
        course1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), QuestionActivity.class);
                intent.putExtra("quiz","course1");
                startActivity(intent);
            }
        });

        course2 = view.findViewById(R.id.course2);
        course2.setClipToOutline(true);
        course2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), QuestionActivity.class);
                intent.putExtra("quiz","course2");
                startActivity(intent);
            }
        });

        course3 = view.findViewById(R.id.course3);
        course3.setClipToOutline(true);
        course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), QuestionActivity.class);
                intent.putExtra("quiz","course3");
                startActivity(intent);
            }
        });

        course4 = view.findViewById(R.id.course4);
        course4.setClipToOutline(true);
        course4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), QuestionActivity.class);
                intent.putExtra("quiz","course4");
                startActivity(intent);
            }
        });

        course5 = view.findViewById(R.id.course5);
        course5.setClipToOutline(true);
        course5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), QuestionActivity.class);
                intent.putExtra("quiz","course5");
                startActivity(intent);
            }
        });
        return view;
    }
}