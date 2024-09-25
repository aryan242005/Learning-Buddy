package com.example.layout2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Programs extends AppCompatActivity {

    ListView program;
    String[] list1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);

        loadCourse();

        program = findViewById(R.id.programs);
        CustomAdapter adapter = new CustomAdapter();
        program.setAdapter(adapter);
        program.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Programs.this, CodeActivity.class);
                intent.putExtra("program",list1[i]);
                startActivity(intent);
            }
        });
    }

    private void loadCourse()
    {
        String[] course1 = {"Java program to print 'Hello, World!' to the console",
                "Java program to add two numbers and print the result",
                "Java program to calculate the area of a circle based on user input for the radius",
                "Java program to check if a given number is even or odd",
                "Java program to calculate the factorial of a given number",
                "Java program to swap the values of two variables",
                "Java program to calculate simple interest based on user input for principal, rate, and time",
                "Java program to check if a given year is a leap year",
                "Java program to generate the Fibonacci series up to a given number",
                "Java program to find the maximum of three numbers"};

        String[] course2 = {"Python program to print 'Hello, World!' to the console",
                "Python program to add two numbers and print the result",
                "Python program to calculate the area of a circle based on user input for the radius",
                "Python program to check if a given number is even or odd",
                "Python program to calculate the factorial of a given number",
                "Python program to swap the values of two variables",
                "Python program to calculate simple interest based on user input for principal, rate, and time",
                "Python program to check if a given year is a leap year",
                "Python program to generate the Fibonacci series up to a given number",
                "Python program to find the maximum of three numbers"};

        String[] course3 = {"JavaScript program to print 'Hello, World!' to the console",
                "JavaScript program to add two numbers and print the result",
                "JavaScript program to calculate the area of a circle based on user input for the radius",
                "JavaScript program to check if a given number is even or odd",
                "JavaScript program to calculate the factorial of a given number",
                "JavaScript program to swap the values of two variables",
                "JavaScript program to calculate simple interest based on user input for principal, rate, and time",
                "JavaScript program to check if a given year is a leap year",
                "JavaScript program to generate the Fibonacci series up to a given number",
                "JavaScript program to find the maximum of three numbers"};

        String[] course4 = {
                "PHP program to print 'Hello, World!' to the console",
                "PHP program to add two numbers and print the result",
                "PHP program to calculate the area of a circle based on user input for the radius",
                "PHP program to check if a given number is even or odd",
                "PHP program to calculate the factorial of a given number",
                "PHP program to swap the values of two variables",
                "PHP program to calculate simple interest based on user input for principal, rate, and time",
                "PHP program to check if a given year is a leap year",
                "PHP program to generate the Fibonacci series up to a given number",
                "PHP program to find the maximum of three numbers"
        };

        String[] course5 = {
                "C++ program to print 'Hello, World!' to the console",
                "C++ program to add two numbers and print the result",
                "C++ program to calculate the area of a circle based on user input for the radius",
                "C++ program to check if a given number is even or odd",
                "C++ program to calculate the factorial of a given number",
                "C++ program to swap the values of two variables",
                "C++ program to calculate simple interest based on user input for principal, rate, and time",
                "C++ program to check if a given year is a leap year",
                "C++ program to generate the Fibonacci series up to a given number",
                "C++ program to find the maximum of three numbers"
        };



        String course_type = getIntent().getStringExtra("codes");
        switch(course_type)
        {
            case "Course1":
                list1 = course1;
                break;
            case "Course2":
                list1 = course2;
                break;
            case "Course3":
                list1 = course3;
                break;
            case "Course4":
                list1 = course4;
                break;
            case "Course5":
                list1 = course5;
                break;
        }
    }

    class CustomAdapter extends BaseAdapter
    {

        @Override
        public int getCount() {
            return list1.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.code_category,null);

            TextView textView = view.findViewById(R.id.codeTitle);
            textView.setText(list1[i]);
            return view;
        }
    }
}