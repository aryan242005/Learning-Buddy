package com.example.layout2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.layout2.chapters.ExpandableHeightGridView;
import com.example.layout2.chapters.TopicAdapter;

public class Videos extends AppCompatActivity {

    Toolbar toolbar;
    ExpandableHeightGridView gridView;
    String topicName[] = {"Video-1","Video-2","Video-3","Video-4","Video-5"};
    ImageView toolbarImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        toolbar = findViewById(R.id.toolbar);
        gridView = findViewById(R.id.topics_name);
        gridView.setExpanded(true);

        if(getSupportActionBar()!=null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbarImg = findViewById(R.id.toolbarImg);

        TopicAdapter adapter = new TopicAdapter(topicName, Videos.this);
        gridView.setAdapter(adapter);

        String course_type = getIntent().getStringExtra("videos");

        if(course_type.equals("Course1"))
        {
            toolbarImg.setImageResource(R.drawable.java);
            toolbar.setTitle("Java");
        }
        else if(course_type.equals("Course2"))
        {
            toolbarImg.setImageResource(R.drawable.python);
            toolbar.setTitle("Python");
        }
        else if(course_type.equals("Course3"))
        {
            toolbarImg.setImageResource(R.drawable.javascript);
            toolbar.setTitle("JavaScript");
        }
        else if(course_type.equals("Course4"))
        {
            toolbarImg.setImageResource(R.drawable.php);
            toolbar.setTitle("PHP");
        }
        else if(course_type.equals("Course5"))
        {
            toolbarImg.setImageResource(R.drawable.cplus);
            toolbar.setTitle("C++");
        }

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                String course_type = getIntent().getStringExtra("videos");
                if (course_type.equals("Course1"))
                {
                    if (topicName[i].equals("Video-1")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FJava%2FJava%201.mp4?alt=media&token=341b9c8c-a274-4d0f-b1bb-92cbcc517e44");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 1 Video 1", Toast.LENGTH_SHORT).show();
                    } else if (topicName[i].equals("Video-2")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FJava%2FJava%202.mp4?alt=media&token=00160c5b-59e2-4340-bf69-789437f3f1af");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 1 Video 2", Toast.LENGTH_SHORT).show();
                    } else if (topicName[i].equals("Video-3")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FJava%2FJava%203.mp4?alt=media&token=14a158c5-b9d3-4fb4-9f10-2df1bf350f37");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 1 Video 3", Toast.LENGTH_SHORT).show();
                    } else if (topicName[i].equals("Video-4")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FJava%2FJava%204.mp4?alt=media&token=fb57c863-3645-4103-9e89-a5ca19a082d3");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 1 Video 4", Toast.LENGTH_SHORT).show();
                    } else if (topicName[i].equals("Video-5")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FJava%2FJava%205.mp4?alt=media&token=8b1bd714-3d92-4398-8bc4-05b30ee2c762");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 1 Video 5", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Videos.this, "Unable to Open", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (course_type.equals("Course2")) {
                    if (topicName[i].equals("Video-1")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FPython%2FPython%201.mp4?alt=media&token=38850028-6bbb-4e79-add8-20d40d267ffc");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 2 Video 1", Toast.LENGTH_SHORT).show();
                    } else if (topicName[i].equals("Video-2")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FPython%2FPython%202.mp4?alt=media&token=ef517c9b-31ba-4371-89f0-dc255edae1d9");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 2 Video 2", Toast.LENGTH_SHORT).show();
                    } else if (topicName[i].equals("Video-3")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FPython%2FPython%203.mp4?alt=media&token=c869bf7f-c443-4b9d-8b18-aececb945de3");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 2 Video 3", Toast.LENGTH_SHORT).show();
                    } else if (topicName[i].equals("Video-4")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FPython%2FPython%204.mp4?alt=media&token=b3eca0dc-9ae7-47e2-ad9e-b701152747f4");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 2 Video 4", Toast.LENGTH_SHORT).show();
                    } else if (topicName[i].equals("Video-5")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FPython%2FPython%205.mp4?alt=media&token=5a632cac-37ad-45e8-bcae-751ac1f21977");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 2 Video 5", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Videos.this, "Unable to Open", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (course_type.equals("Course3"))
                {
                    if (topicName[i].equals("Video-1")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FJavaScript%2FJAVASCRIPT%201.mp4?alt=media&token=4e28d6d6-d04b-4852-80de-1780c591c561");
                        startActivity(intent);
                    } else if (topicName[i].equals("Video-2")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FJavaScript%2FJAVASCRIPT%202.mp4?alt=media&token=033a48b9-1d94-40ad-89be-0cda2f168676");
                        startActivity(intent);
                    } else if (topicName[i].equals("Video-3")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FJavaScript%2FJAVASCRIPT%203.mp4?alt=media&token=318f6e69-bf8a-4762-a6e0-124a3d5c9aa1");
                        startActivity(intent);
                    } else if (topicName[i].equals("Video-4")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FJavaScript%2FJAVASCRIPT%204.mp4?alt=media&token=3da70ee8-cb71-403a-9770-d65143909d8b");
                        startActivity(intent);
                    } else if (topicName[i].equals("Video-5")) {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FJavaScript%2FJAVASCRIPT%205.mp4?alt=media&token=90fa843b-b1b4-4a85-837a-a4a53e2a7227");
                        startActivity(intent);
                    } else {
                        Toast.makeText(Videos.this, "Unable to Open", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (course_type.equals("Course4"))
                {
                    if(topicName[i].equals("Video-1"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FPHP%2FPHP%201.mp4?alt=media&token=f14442f2-6cfb-4816-8073-28bd6a757d3b");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 4 Video 1", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Video-2"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FPHP%2FPHP%202.mp4?alt=media&token=69029bcc-a5ec-467f-ad10-e24df0796817");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 4 Video 2", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Video-3"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FPHP%2FPHP%203.mp4?alt=media&token=22188203-18b5-480d-b9b1-666cfc685a72");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 4 Video 3", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Video-4"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FPHP%2FPHP%204.mp4?alt=media&token=da9d956f-ab1b-4ed5-985e-0d1c2a58f38a");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 4 Video 4", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Video-5"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FPHP%2FPHP%205.mp4?alt=media&token=ab32930a-f7d6-46f6-b68c-ad30bbcf8d3d");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 4 Video 5", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(Videos.this, "Unable to Open", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (course_type.equals("Course5"))
                {
                    if(topicName[i].equals("Video-1"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FC%2B%2B%2FC%2B%2B%201.mp4?alt=media&token=b0fcc705-e949-40e3-bf41-4649790f80c4");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 5 Video 1", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Video-2"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FC%2B%2B%2FC%2B%2B%202.mp4?alt=media&token=51c0f8c8-6337-416d-8a76-37f87553b705");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 5 Video 2", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Video-3"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FC%2B%2B%2FC%2B%2B%203.mp4?alt=media&token=94651e63-376e-4cdc-bb50-03bb72fd8115");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 5 Video 3", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Video-4"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FC%2B%2B%2FC%2B%2B%204.mp4?alt=media&token=202bfcff-4331-4a52-8792-e5b6296358e3");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 5 Video 4", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Video-5"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://firebasestorage.googleapis.com/v0/b/layout-2-cd758.appspot.com/o/Videos%2FC%2B%2B%2FC%2B%2B%205.mp4?alt=media&token=1827a4b3-111c-4186-a1bc-6bfd626273ba");
                        startActivity(intent);
                        Toast.makeText(Videos.this, "Course 5 Video 5", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(Videos.this, "Unable to Open", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(Videos.this, "Error 404", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}