package com.example.layout2.chapters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.layout2.Notes;
import com.example.layout2.PdfViewer;
import com.example.layout2.Programs;
import com.example.layout2.R;
import com.example.layout2.VideoViewer;
import com.example.layout2.Videos;

public class Course1 extends AppCompatActivity {

    Toolbar toolbar;
    ExpandableHeightGridView gridView;
    String language;
    ImageView toolbarImg;
    String topicName[] = {"Notes","Video","Programs"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course1);

        language = getIntent().getStringExtra("language");

        toolbarImg = findViewById(R.id.toolbarImg);
        toolbar = findViewById(R.id.toolbar);
        gridView = findViewById(R.id.topics_name);
        gridView.setExpanded(true);

        if(language.equals("course1"))
        {
            toolbarImg.setImageResource(R.drawable.java);
            toolbar.setTitle("Java");
        }
        else if(language.equals("course2"))
        {
            toolbarImg.setImageResource(R.drawable.python);
            toolbar.setTitle("Python");
        }
        else if(language.equals("course3"))
        {
            toolbarImg.setImageResource(R.drawable.javascript);
            toolbar.setTitle("JavaScript");
        }
        else if(language.equals("course4"))
        {
            toolbarImg.setImageResource(R.drawable.php);
            toolbar.setTitle("PHP");
        }
        else if(language.equals("course5"))
        {
            toolbarImg.setImageResource(R.drawable.cplus);
            toolbar.setTitle("C++");
        }

        if(getSupportActionBar()!=null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TopicAdapter adapter = new TopicAdapter(topicName,Course1.this);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                if(topicName[i].equals("Video"))
                {
                    Intent intent = new Intent(Course1.this, Videos.class);
                    if(language.equals("course1"))
                    {
                        intent.putExtra("videos","Course1");
                    }
                    else if(language.equals("course2"))
                    {
                        intent.putExtra("videos","Course2");
                    }
                    else if(language.equals("course3"))
                    {
                        intent.putExtra("videos","Course3");
                    }
                    else if(language.equals("course4"))
                    {
                        intent.putExtra("videos","Course4");
                    }
                    else if(language.equals("course5"))
                    {
                        intent.putExtra("videos","Course5");
                    }
                    startActivity(intent);
                    Toast.makeText(Course1.this, topicName[i], Toast.LENGTH_SHORT).show();
                }
                else if(topicName[i].equals("Notes"))
                {
                    Intent intent = new Intent(Course1.this, Notes.class);
                    if(language.equals("course1"))
                    {
                        intent.putExtra("notes","Course1");
                    }
                    else if(language.equals("course2"))
                    {
                        intent.putExtra("notes","Course2");
                    }
                    else if(language.equals("course3"))
                    {
                        intent.putExtra("notes","Course3");
                    }
                    else if(language.equals("course4"))
                    {
                        intent.putExtra("notes","Course4");
                    }
                    else if(language.equals("course5"))
                    {
                        intent.putExtra("notes","Course5");
                    }
                    startActivity(intent);
                    Toast.makeText(Course1.this, topicName[i], Toast.LENGTH_SHORT).show();
                }
                else if(topicName[i].equals("Programs"))
                {
                    Intent intent = new Intent(Course1.this, Programs.class);
                    if(language.equals("course1"))
                    {
                        intent.putExtra("codes","Course1");
                    }
                    else if(language.equals("course2"))
                    {
                        intent.putExtra("codes","Course2");
                    }
                    else if(language.equals("course3"))
                    {
                        intent.putExtra("codes","Course3");
                    }
                    else if(language.equals("course4"))
                    {
                        intent.putExtra("codes","Course4");
                    }
                    else if(language.equals("course5"))
                    {
                        intent.putExtra("codes","Course5");
                    }
                    startActivity(intent);
                    Toast.makeText(Course1.this, topicName[i], Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Course1.this, "Unable to Open", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}