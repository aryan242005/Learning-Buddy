package com.example.layout2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.layout2.chapters.Course1;
import com.example.layout2.chapters.ExpandableHeightGridView;
import com.example.layout2.chapters.TopicAdapter;

public class Notes extends AppCompatActivity {

    Toolbar toolbar;
    ExpandableHeightGridView gridView;
    String topicName[] = {"Unit-1","Unit-2","Unit-3","Unit-4","Unit-5"};
    String topicName1[] = {"Unit-1","Unit-2","Unit-3","Unit-4","Unit-5","Unit-6"};

    ImageView toolbarImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        toolbar = findViewById(R.id.toolbar);
        gridView = findViewById(R.id.topics_name);
        gridView.setExpanded(true);
        toolbarImg = findViewById(R.id.toolbarImg);

        if(getSupportActionBar()!=null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TopicAdapter adapter = new TopicAdapter(topicName, Notes.this);
        gridView.setAdapter(adapter);

        String course_type = getIntent().getStringExtra("notes");
        if(course_type.equals("Course1"))
        {
            toolbarImg.setImageResource(R.drawable.java);
            toolbar.setTitle("Java");
        }
        else if(course_type.equals("Course2"))
        {
            toolbarImg.setImageResource(R.drawable.python);
            TopicAdapter adapter1 = new TopicAdapter(topicName1, Notes.this);
            gridView.setAdapter(adapter1);
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

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String course_type = getIntent().getStringExtra("notes");
                if(course_type.equals("Course1"))
                {
                    if(topicName[i].equals("Unit-1"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1RVl2TwKIa8vnkZKSn2aZk6IW_F-jgHvD/view?usp=sharing");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 1 Unit 1", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Unit-2"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1V4Om2fpasQB2zoY5hbdyjAICC1mm5y_4/view?usp=sharing");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 1 Unit 2", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Unit-3"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1Z8caKbLSfe4-f4XtnpImgRQd9Z928idY/view?usp=sharing");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 1 Unit 3", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Unit-4"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/19XuM0qvXlQ09C2Zg78BSgscVXj-GyNSK/view?usp=sharing");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 1 Unit 4", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Unit-5"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1GlAeHBxtY_a7JGynEuvkczCYvm8xckKo/view?usp=sharing");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 1 Unit 5", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(Notes.this, "Unable to Open", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(course_type.equals("Course2"))
                {
                    if(topicName1[i].equals("Unit-1"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1RTZNG1Kma7niJdvBXR6StpDCzyRu-gKu/view?usp=sharing");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 2 Unit 1", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName1[i].equals("Unit-2"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1_RoMsD0aGrODt-zGVyutyz7mU4GkPvrs/view?usp=sharing");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 2 Unit 2", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName1[i].equals("Unit-3"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1vUR-aDx1TCpfmdMBzX5vdUsGL7bfhsuY/view?usp=sharing");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 2 Unit 3", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName1[i].equals("Unit-4"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/14_ceAv9z_5QK0HEBu9WPpApKJaaxWH2H/view?usp=sharing");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 2 Unit 4", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName1[i].equals("Unit-5"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1Vy-dRGNuOWVqwKXzwIqJAHDGFOfWljM5/view?usp=sharing");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 2 Unit 5", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName1[i].equals("Unit-6"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1u1mAWNSFI-PyGOUxaZUGQ9wxscm3Va8t/view?usp=sharing");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 2 Unit 6", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(Notes.this, "Unable to Open", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(course_type.equals("Course3"))
                {
                    if(topicName[i].equals("Unit-1"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1yaLhduO1hNOXyA250Y3C-tVK_gRs9uBu/view?usp=sharing");
                        startActivity(intent);
                    }
                    else if(topicName[i].equals("Unit-2"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/190bcQKSffmOzeZEfHvgk-wGwv5pVuMfT/view?usp=sharing");
                        startActivity(intent);
                    }
                    else if(topicName[i].equals("Unit-3"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1zzzXk7QoSkGDMqwtzYoNumxxORWlZ3Lg/view?usp=sharing");
                        startActivity(intent);
                    }
                    else if(topicName[i].equals("Unit-4"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1odfmVczQ3rJHwIQg_eqKkbl6_FVn8aaq/view?usp=sharing");
                        startActivity(intent);
                    }
                    else if(topicName[i].equals("Unit-5"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1zYPPWosCYP6gBXF60GNQg_N9GyBYn-rU/view?usp=sharing");
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(Notes.this, "Unable to Open", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (course_type.equals("Course4"))
                {
                    if(topicName[i].equals("Unit-1"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1WsueXNkirF3SrqJZJhX3Z6w7I4E7zwY1/view?usp=drive_link");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 4 Unit 1", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Unit-2"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1RYj7hRiBGDw1If_f7WJT8ItmYRwsB9LQ/view?usp=drive_link");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 4 Unit 2", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Unit-3"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1FSPOhsf8ii2B_QwXeXAmyc2RGmDp3Ybt/view?usp=sharing");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 4 Unit 3", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Unit-4"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/1QKA9bE0IcMQwFjXVfFyceW0SeZl9PARX/view?usp=drive_link");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 4 Unit 4", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Unit-5"))
                    {
                        Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                        intent.putExtra("pdf_url", "https://drive.google.com/file/d/11vquEJJnYPYchCXqBwLUC2OR9I32Fa7v/view?usp=drive_link");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 4 Unit 5", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(Notes.this, "Unable to Open", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (course_type.equals("Course5"))
                {
                    if(topicName[i].equals("Unit-1"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://drive.google.com/file/d/1h1B4rC7BgMUEzR1rQfoMQv9lwtHUXtTh/view?usp=drive_link");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 5 Unit 1", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Unit-2"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://drive.google.com/file/d/150ktL3vWXI5GNVMVCsrbbyMEG2oelt-W/view?usp=drive_link");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 5 Unit 2", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Unit-3"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://drive.google.com/file/d/1zK_FbqXULzr4BogQc3adib7R15q0bzTF/view?usp=drive_link");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 5 Unit 3", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Unit-4"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://drive.google.com/file/d/12oNkCc3MV7aLAgnDtXAYsGYXijrtwLzW/view?usp=drive_link");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 5 Unit 4", Toast.LENGTH_SHORT).show();
                    }
                    else if(topicName[i].equals("Unit-5"))
                    {
                        Intent intent = new Intent(getApplicationContext(), VideoViewer.class);
                        intent.putExtra("Video_url", "https://drive.google.com/file/d/1Q-zqU_g_yL_HL1pyFa2E4heZw3tZtUIs/view?usp=drive_link");
                        startActivity(intent);
                        Toast.makeText(Notes.this, "Course 5 Unit 5", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(Notes.this, "Unable to Open", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(Notes.this, "Error 404", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}