package com.example.layout2.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.layout2.R;

import java.util.ArrayList;
import java.util.List;

public class QuestionActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    TextView lblQuestion;
    RadioButton optionA;
    RadioButton optionB;
    RadioButton optionC;
    RadioButton optionD;
    Button confirm;
    String rightAnswer;
    String Answer;
    List<Question> questions,questions1,questions2,questions3,questions4;
    String course;
    int score;
    public static String q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;
    public static String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        course = getIntent().getStringExtra("quiz");

        confirm = findViewById(R.id.confirm);
        lblQuestion = findViewById(R.id.lblQuestion);
        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);
        score = 0;
        radioGroup = findViewById(R.id.radioGroup);


        questions = new ArrayList<Question>(){
            {
                add(new Question("1. Who invented Java Programming?", "B", " Guido van Rossum", "James Gosling","Dennis Ritchie", "Bjarne Stroustrup"));
                add(new Question("2. Which statement is true about Java?", "D", "Java is a sequence-dependent programming language", "Java is a code dependent programming language","Java is a platform-dependent programming language", "Java is a platform-independent programming language"));
                add(new Question("3. Which component is used to compile, debug and execute the java programs? ", "C", " JRE", " JIT"," JDK", " JVM"));
                add(new Question("4. Which one of the following is not a Java feature?", "B", "Object-oriented", "Use of pointers", "Portable", "Dynamic and Extensible"));
                add(new Question("5. Which of these cannot be used for a variable name in Java?", "C", "identifier & keyword", "identifier", "keyword", " none of the mentioned"));
                add(new Question("6. The first fully 64-bit compatible version of android is :","C", "4.4 Kitkat","4.2 Jellybean", "5.0 Lollipop","8.0 Oreo"));
                add(new Question("7. One of the main reasons for Android requiring more RAM is:","D","High performance","More Apps in the Background","Heavy Apps","Java's Garbage Collector"));
                add(new Question("8. Which data structure implements FIFO(First In First Out) method?","B","Stack","Queue","Graph","Tree"));
                add(new Question("9. What is the right syntax in Java for printing something to the console?","A","System.out.println()","Console.writeline()","printf()","writeToCOnsole()"));
                add(new Question("10. What will be the output of the following Java code?      class increment {\n" +
                        "        public static void main(String args[]) \n" +
                        "        {        \n" +
                        "             int g = 3;\n" +
                        "             System.out.print(++g * 8);\n" +
                        "        } \n" +
                        "    }","D","33","24","Both A and B","34"));
            }
        };

        questions1 = new ArrayList<Question>(){
            {
                add(new Question("1. Who is known as the creator of Python?", "A", "Guido van Rossum", "James Gosling", "Dennis Ritchie", "Bjarne Stroustrup"));
                add(new Question("2. Which of the following is not a Python data type?", "C", "Integer", "String", "Float", "Boolean"));
                add(new Question("3. Which statement is used for conditional execution in Python?", "D", "for", "while", "do-while", "if"));
                add(new Question("4. What is the result of 2 + 3 * 4 in Python?", "B", "20", "14", "16", "5"));
                add(new Question("5. What is the output of the following code? print('Hello, world!')", "A", "Hello, world!", "Error", "Nothing", "None of the above"));
                add(new Question("6. Which of the following is used to define a function in Python?", "C", "define", "function", "def", "function()"));
                add(new Question("7. What is the correct way to comment multiple lines in Python?", "A", "''' ... '''", "// ... //", "/* ... */", "# ... #"));
                add(new Question("8. Which built-in function can be used to find the length of a list in Python?", "D", "length()", "count()", "size()", "len()"));
                add(new Question("9. What is the output of the following code? x = [1, 2, 3]\nprint(x[1])", "B", "2", "1", "3", "Error"));
                add(new Question("10. Which of the following is a valid Python variable name?", "D", "_myVar", "2myVar", "my-Var", "myVar"));
            }
        };

        questions2 = new ArrayList<Question>(){
            {
                add(new Question("1. Who developed JavaScript?", "A", "Brendan Eich", "James Gosling", "Guido van Rossum", "Dennis Ritchie"));
                add(new Question("2. What is the correct way to declare a JavaScript variable?", "B", "var myVar = 10;", "variable myVar = 10;", "myVar = 10;", "int myVar = 10;"));
                add(new Question("3. Which operator is used for equality comparison in JavaScript?", "C", "==", "=", "===", "!"));
                add(new Question("4. What is the result of 5 + '5' in JavaScript?", "D", "Error", "10", "5", "55"));
                add(new Question("5. Which statement is used to execute code based on a condition?", "A", "if", "for", "while", "switch"));
                add(new Question("6. What method is used to add an element to the end of an array in JavaScript?", "B", "push()", "append()", "insert()", "addToEnd()"));
                add(new Question("7. What is the output of the following code? console.log(typeof undefined)", "C", "undefined", "null", "undefined", "object"));
                add(new Question("8. Which function is used to parse a string and return a floating-point number in JavaScript?", "D", "parseInt()", "parseFloat()", "toFixed()", "Number()"));
                add(new Question("9. What does the '===' operator do in JavaScript?", "B", "Checks for strict inequality", "Checks for strict equality", "Assigns a value", "None of the above"));
                add(new Question("10. Which event occurs when the user clicks on an HTML element in JavaScript?", "A", "click", "mouseover", "change", "load"));
            }
        };

        questions3 = new ArrayList<Question>(){
            {
                add(new Question("1. Who is the creator of PHP?", "C", "Rasmus Lerdorf", "Andi Gutmans", "Zeev Suraski", "Larry Wall"));
                add(new Question("2. How do you start a PHP block?", "A", "<?php", "<?=", "<?", "<?ph"));
                add(new Question("3. Which function is used to establish a connection to a MySQL database in PHP?", "B", "mysqli_connect()", "connect_mysql()", "pdo_connect()", "mysql_open()"));
                add(new Question("4. What does 'echo' do in PHP?", "D", "Outputs to a file", "Assigns a value", "Creates an array", "Outputs data"));
                add(new Question("5. Which of the following is used to comment in PHP?", "C", "//", "/* */", "#", "<!--"));
                add(new Question("6. What is the correct way to end a PHP statement?", "B", ";", ":", ",", "."));
                add(new Question("7. Which PHP function is used to remove whitespace or other predefined characters from the beginning and end of a string?", "A", "trim()", "remove_whitespace()", "strip()", "clean()"));
                add(new Question("8. What does the '++' operator do in PHP?", "B", "Decrements by one", "Increments by one", "Assigns a value", "Checks for equality"));
                add(new Question("9. How do you concatenate strings in PHP?", "C", ".", "+", ",", ":"));
                add(new Question("10. Which superglobal variable in PHP is used to access form data after submitting an HTML form with the 'post' method?", "D", "$_POST", "$_GET", "$_REQUEST", "$_SESSION"));
            }
        };

        questions4 = new ArrayList<Question>(){
            {
                add(new Question("1. What is the correct syntax for declaring a pointer in C++?", "B", "int* ptr;", "int ptr;", "ptr int;", "int pointer;"));
                add(new Question("2. Which keyword is used to define a class in C++?", "C", "struct", "classdef", "class", "define"));
                add(new Question("3. What is the output of the following code? \n cout << (5 > 3 ? 10 : 20);", "A", "10", "20", "5", "3"));
                add(new Question("4. What is the purpose of 'new' operator in C++?", "C", "To delete an object", "To declare a variable", "To dynamically allocate memory", "To initialize a variable"));
                add(new Question("5. How do you declare a constant in C++?", "D", "const int x = 10;", "final int x = 10;", "#define x 10", "const int x;"));
                add(new Question("6. What is the correct way to define a destructor in a class?", "B", "~ClassName();", "ClassName();", "destroy();", "delete();"));
                add(new Question("7. Which header file is needed to work with file input/output operations in C++?", "A", "<fstream>", "<iostream>", "<stdio.h>", "<math.h>"));
                add(new Question("8. What is the correct syntax for a switch statement in C++?", "C", "switch(expression) { case 1: break; }", "switch(expression) ( case 1: break; )", "switch(expression) { case 1: break; }", "switch(expression): { case 1: break; }"));
                add(new Question("9. What does the 'endl' keyword do in C++?", "A", "Inserts a newline character and flushes the output buffer", "Ends the program", "Ends the loop", "Inserts a space character"));
                add(new Question("10. How do you access the length of a string in C++?", "B", "str.length()", "str.size()", "str.length", "str.size"));
            }
        };


        if(course.equals("course1"))
        {
            q1 =  questions.get(0).getQuestion();
            q2 =  questions.get(1).getQuestion();
            q3 =  questions.get(2).getQuestion();
            q4 =  questions.get(3).getQuestion();
            q5 =  questions.get(4).getQuestion();
            q6 =  questions.get(5).getQuestion();
            q7 =  questions.get(6).getQuestion();
            q8 =  questions.get(7).getQuestion();
            q9 =  questions.get(8).getQuestion();
            q10 = questions.get(9).getQuestion();
            a1 = questions.get(0).getAns();
            a2 = questions.get(1).getAns();
            a3 = questions.get(2).getAns();
            a4 = questions.get(3).getAns();
            a5 = questions.get(4).getAns();
            a6 = questions.get(5).getAns();
            a7 = questions.get(6).getAns();
            a8 = questions.get(7).getAns();
            a9 = questions.get(8).getAns();
            a10 = questions.get(9).getAns();
            loadQuestion(course);
        }
        else if(course.equals("course2"))
        {
            q1 =  questions1.get(0).getQuestion();
            q2 =  questions1.get(1).getQuestion();
            q3 =  questions1.get(2).getQuestion();
            q4 =  questions1.get(3).getQuestion();
            q5 =  questions1.get(4).getQuestion();
            q6 =  questions1.get(5).getQuestion();
            q7 =  questions1.get(6).getQuestion();
            q8 =  questions1.get(7).getQuestion();
            q9 =  questions1.get(8).getQuestion();
            q10 = questions1.get(9).getQuestion();
            a1 = questions1.get(0).getAns();
            a2 = questions1.get(1).getAns();
            a3 = questions1.get(2).getAns();
            a4 = questions1.get(3).getAns();
            a5 = questions1.get(4).getAns();
            a6 = questions1.get(5).getAns();
            a7 = questions1.get(6).getAns();
            a8 = questions1.get(7).getAns();
            a9 = questions1.get(8).getAns();
            a10 = questions1.get(9).getAns();
            loadQuestion(course);
        }
        else if(course.equals("course3"))
        {
            q1 =  questions2.get(0).getQuestion();
            q2 =  questions2.get(1).getQuestion();
            q3 =  questions2.get(2).getQuestion();
            q4 =  questions2.get(3).getQuestion();
            q5 =  questions2.get(4).getQuestion();
            q6 =  questions2.get(5).getQuestion();
            q7 =  questions2.get(6).getQuestion();
            q8 =  questions2.get(7).getQuestion();
            q9 =  questions2.get(8).getQuestion();
            q10 = questions2.get(9).getQuestion();
            a1 = questions2.get(0).getAns();
            a2 = questions2.get(1).getAns();
            a3 = questions2.get(2).getAns();
            a4 = questions2.get(3).getAns();
            a5 = questions2.get(4).getAns();
            a6 = questions2.get(5).getAns();
            a7 = questions2.get(6).getAns();
            a8 = questions2.get(7).getAns();
            a9 = questions2.get(8).getAns();
            a10 = questions2.get(9).getAns();
            loadQuestion(course);
        }
        else if(course.equals("course4"))
        {
            q1 =  questions3.get(0).getQuestion();
            q2 =  questions3.get(1).getQuestion();
            q3 =  questions3.get(2).getQuestion();
            q4 =  questions3.get(3).getQuestion();
            q5 =  questions3.get(4).getQuestion();
            q6 =  questions3.get(5).getQuestion();
            q7 =  questions3.get(6).getQuestion();
            q8 =  questions3.get(7).getQuestion();
            q9 =  questions3.get(8).getQuestion();
            q10 = questions3.get(9).getQuestion();
            a1 = questions3.get(0).getAns();
            a2 = questions3.get(1).getAns();
            a3 = questions3.get(2).getAns();
            a4 = questions3.get(3).getAns();
            a5 = questions3.get(4).getAns();
            a6 = questions3.get(5).getAns();
            a7 = questions3.get(6).getAns();
            a8 = questions3.get(7).getAns();
            a9 = questions3.get(8).getAns();
            a10 = questions3.get(9).getAns();
            loadQuestion(course);
        }
        else if(course.equals("course5"))
        {
            q1 =  questions4.get(0).getQuestion();
            q2 =  questions4.get(1).getQuestion();
            q3 =  questions4.get(2).getQuestion();
            q4 =  questions4.get(3).getQuestion();
            q5 =  questions4.get(4).getQuestion();
            q6 =  questions4.get(5).getQuestion();
            q7 =  questions4.get(6).getQuestion();
            q8 =  questions4.get(7).getQuestion();
            q9 =  questions4.get(8).getQuestion();
            q10 = questions4.get(9).getQuestion();
            a1 = questions4.get(0).getAns();
            a2 = questions4.get(1).getAns();
            a3 = questions4.get(2).getAns();
            a4 = questions4.get(3).getAns();
            a5 = questions4.get(4).getAns();
            a6 = questions4.get(5).getAns();
            a7 = questions4.get(6).getAns();
            a8 = questions4.get(7).getAns();
            a9 = questions4.get(8).getAns();
            a10 = questions4.get(9).getAns();
            loadQuestion(course);
        }
    }


    @Override
    protected void onRestart(){
        super.onRestart();
        loadQuestion(course);
    }


    private void loadQuestion(String course) {
        if (course.equals("course1"))
        {
            if(questions.size() > 0)
            {
                Question q = questions.remove(0);
                lblQuestion.setText(q.getQuestion());
                List<String> answers = q.getAnswers();

                optionA.setText(answers.get(0));
                optionB.setText(answers.get(1));
                optionC.setText(answers.get(2));
                optionD.setText(answers.get(3));

                rightAnswer = q.getRightAnswer();
            }
            else
            {
                Intent intent = new Intent(this, ShowScoreActivity.class);
                intent.putExtra("score", score);
                startActivity(intent);
                finish();
            }
        }
        else if(course.equals("course2"))
        {
            if(questions1.size() > 0)
            {
                Question q = questions1.remove(0);
                lblQuestion.setText(q.getQuestion());
                List<String> answers = q.getAnswers();

                optionA.setText(answers.get(0));
                optionB.setText(answers.get(1));
                optionC.setText(answers.get(2));
                optionD.setText(answers.get(3));

                rightAnswer = q.getRightAnswer();
            }
            else
            {
                Intent intent = new Intent(this, ShowScoreActivity.class);
                intent.putExtra("score", score);
                startActivity(intent);
                finish();
            }
        }
        else if(course.equals("course3"))
        {
            if(questions2.size() > 0)
            {
                Question q = questions2.remove(0);
                lblQuestion.setText(q.getQuestion());
                List<String> answers = q.getAnswers();

                optionA.setText(answers.get(0));
                optionB.setText(answers.get(1));
                optionC.setText(answers.get(2));
                optionD.setText(answers.get(3));

                rightAnswer = q.getRightAnswer();
            }
            else
            {
                Intent intent = new Intent(this, ShowScoreActivity.class);
                intent.putExtra("score", score);
                startActivity(intent);
                finish();
            }
        }
        else if(course.equals("course4"))
        {
            if(questions3.size() > 0)
            {
                Question q = questions3.remove(0);
                lblQuestion.setText(q.getQuestion());
                List<String> answers = q.getAnswers();

                optionA.setText(answers.get(0));
                optionB.setText(answers.get(1));
                optionC.setText(answers.get(2));
                optionD.setText(answers.get(3));

                rightAnswer = q.getRightAnswer();
            }
            else
            {
                Intent intent = new Intent(this, ShowScoreActivity.class);
                intent.putExtra("score", score);
                startActivity(intent);
                finish();
            }
        }
        else if(course.equals("course5"))
        {
            if(questions4.size() > 0)
            {
                Question q = questions4.remove(0);
                lblQuestion.setText(q.getQuestion());
                List<String> answers = q.getAnswers();

                optionA.setText(answers.get(0));
                optionB.setText(answers.get(1));
                optionC.setText(answers.get(2));
                optionD.setText(answers.get(3));

                rightAnswer = q.getRightAnswer();
            }
            else
            {
                Intent intent = new Intent(this, ShowScoreActivity.class);
                intent.putExtra("score", score);
                startActivity(intent);
                finish();
            }
        }
    }

    public void loadAnswer(View view) {
        int op = radioGroup.getCheckedRadioButtonId();

        switch (op){
            case R.id.optionA:
                Answer="A";
                break;

            case R.id.optionB:
                Answer="B";
                break;

            case R.id.optionC:
                Answer="C";
                break;

            case R.id.optionD:
                Answer="D";
                break;

            default:
                return;

        }

        radioGroup.clearCheck();

        this.startActivity(isRightOrWrong(Answer));

    }

    private Intent isRightOrWrong(String Answer){
        Intent screen;
        if(Answer.equals(rightAnswer)) {
            this.score += 1;
            screen = new Intent(this, RightActivity.class);

        }else {
            screen = new Intent(this, WrongActivity.class);
        }

        return screen;
    }
}
