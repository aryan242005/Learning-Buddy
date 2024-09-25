package com.example.layout2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import thereisnospon.codeview.CodeView;
import thereisnospon.codeview.CodeViewTheme;

public class CodeActivity extends AppCompatActivity {

    CodeView codeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        codeView=findViewById(R.id.code_view);
        codeView.setTheme(CodeViewTheme.ANDROIDSTUDIO);

        loadprogram();

    }

    private void loadprogram() {
        String selectedProgram = getIntent().getStringExtra("program");
        if(selectedProgram.equals("Java program to print 'Hello, World!' to the console"))
        {
            codeView.showCode("" +
                    "class HelloWorld {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        System.out.println(\"Hello, World!\"); \n" +
                    "    }\n" +
                    "}");
        }
        else if(selectedProgram.equals("Java program to add two numbers and print the result"))
        {
            codeView.showCode("" +
                    "import java.util.Scanner;\n" +
                    "\n" +
                    "public class AddTwoNumbers {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        Scanner scanner = new Scanner(System.in);\n" +
                    "        \n" +
                    "        System.out.print(\"Enter the first number: \");\n" +
                    "        int num1 = scanner.nextInt();\n" +
                    "        \n" +
                    "        System.out.print(\"Enter the second number: \");\n" +
                    "        int num2 = scanner.nextInt();\n" +
                    "        \n" +
                    "        int sum = num1 + num2;\n" +
                    "        \n" +
                    "        System.out.println(\"The sum of \" + num1 + \" and \" + num2 + \" is: \" + sum);\n" +
                    "        \n" +
                    "        scanner.close();\n" +
                    "    }\n" +
                    "}\n" +
                    "class HelloWorld {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        System.out.println(\"Hello, World!\"); \n" +
                    "    }\n" +
                    "}");
        }
        else if(selectedProgram.equals("Java program to calculate the area of a circle based on user input for the radius"))
        {
            codeView.showCode("" +
                    "// Calculate Area of a Circle\n" +
                    "import java.util.Scanner;\n" +
                    "\n" +
                    "public class CircleArea {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        Scanner scanner = new Scanner(System.in);\n" +
                    "        System.out.print(\"Enter the radius of the circle: \");\n" +
                    "        double radius = scanner.nextDouble();\n" +
                    "        double area = Math.PI * radius * radius;\n" +
                    "        System.out.println(\"The area of the circle is: \" + area);\n" +
                    "        scanner.close();\n" +
                    "    }\n" +
                    "}\n");

        }
        else if(selectedProgram.equals("Java program to check if a given number is even or odd"))
        {
            codeView.showCode("" +
                    "// Check if a given number is even or odd\n" +
                    "import java.util.Scanner;\n" +
                    "\n" +
                    "public class EvenOdd {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        Scanner scanner = new Scanner(System.in);\n" +
                    "        System.out.print(\"Enter a number: \");\n" +
                    "        int number = scanner.nextInt();\n" +
                    "        if (number % 2 == 0) {\n" +
                    "            System.out.println(number + \" is even\");\n" +
                    "        } else {\n" +
                    "            System.out.println(number + \" is odd\");\n" +
                    "        }\n" +
                    "        scanner.close();\n" +
                    "    }\n" +
                    "}\n");
        }
        else if(selectedProgram.equals("Java program to calculate the factorial of a given number"))
        {
            codeView.showCode("" +
                    "import java.util.Scanner;\n" +
                    "\n" +
                    "public class Factorial {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        Scanner scanner = new Scanner(System.in);\n" +
                    "        System.out.print(\"Enter a number: \");\n" +
                    "        int number = scanner.nextInt();\n" +
                    "        int factorial = 1;\n" +
                    "        for (int i = 1; i <= number; i++) {\n" +
                    "            factorial *= i;\n" +
                    "        }\n" +
                    "        System.out.println(\"The factorial of \" + number + \" is: \" + factorial);\n" +
                    "        scanner.close();\n" +
                    "    }\n" +
                    "}\n");

        }
        else if(selectedProgram.equals("Java program to swap the values of two variables"))
        {
            codeView.showCode("" +
                    "import java.util.Scanner;\n" +
                    "\n" +
                    "public class SwapVariables {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        Scanner scanner = new Scanner(System.in);\n" +
                    "        System.out.print(\"Enter the first number: \");\n" +
                    "        int a = scanner.nextInt();\n" +
                    "        System.out.print(\"Enter the second number: \");\n" +
                    "        int b = scanner.nextInt();\n" +
                    "        System.out.println(\"Before swapping: a = \" + a + \", b = \" + b);\n" +
                    "        int temp = a;\n" +
                    "        a = b;\n" +
                    "        b = temp;\n" +
                    "        System.out.println(\"After swapping: a = \" + a + \", b = \" + b);\n" +
                    "        scanner.close();\n" +
                    "    }\n" +
                    "}\n");
        }
        else if(selectedProgram.equals("Java program to calculate simple interest based on user input for principal, rate, and time")) {
            codeView.showCode("" +
                    "import java.util.Scanner;\n" +
                    "\n" +
                    "public class SimpleInterest {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        Scanner scanner = new Scanner(System.in);\n" +
                    "        System.out.print(\"Enter the principal amount: \");\n" +
                    "        double principal = scanner.nextDouble();\n" +
                    "        System.out.print(\"Enter the rate of interest: \");\n" +
                    "        double rate = scanner.nextDouble();\n" +
                    "        System.out.print(\"Enter the time period (in years): \");\n" +
                    "        double time = scanner.nextDouble();\n" +
                    "        double simpleInterest = (principal * rate * time) / 100;\n" +
                    "        System.out.println(\"The simple interest is: \" + simpleInterest);\n" +
                    "        scanner.close();\n" +
                    "    }\n" +
                    "}\n");
        }
        else if(selectedProgram.equals("Java program to check if a given year is a leap year"))
        {
            codeView.showCode("" +
                    "import java.util.Scanner;\n" +
                    "\n" +
                    "public class LeapYear {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        Scanner scanner = new Scanner(System.in);\n" +
                    "        System.out.print(\"Enter a year: \");\n" +
                    "        int year = scanner.nextInt();\n" +
                    "        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);\n" +
                    "        if (isLeapYear) {\n" +
                    "            System.out.println(year + \" is a leap year\");\n" +
                    "        } else {\n" +
                    "            System.out.println(year + \" is not a leap year\");\n" +
                    "        }\n" +
                    "        scanner.close();\n" +
                    "    }\n" +
                    "}\n");
        }
        else if(selectedProgram.equals("Java program to generate the Fibonacci series up to a given number"))
        {
            codeView.showCode("" +
                    "import java.util.Scanner;\n" +
                    "\n" +
                    "public class Fibonacci {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        Scanner scanner = new Scanner(System.in);\n" +
                    "        System.out.print(\"Enter the number of terms: \");\n" +
                    "        int n = scanner.nextInt();\n" +
                    "        int firstTerm = 0, secondTerm = 1;\n" +
                    "        System.out.print(\"Fibonacci Series up to \" + n + \" terms: \");\n" +
                    "        for (int i = 1; i <= n; ++i) {\n" +
                    "            System.out.print(firstTerm + \", \");\n" +
                    "            int nextTerm = firstTerm + secondTerm;\n" +
                    "            firstTerm = secondTerm;\n" +
                    "            secondTerm = nextTerm;\n" +
                    "        }\n" +
                    "        scanner.close();\n" +
                    "    }\n" +
                    "}\n");
        }
        else if(selectedProgram.equals("Java program to find the maximum of three numbers"))
        {
            codeView.showCode("" +
                    "import java.util.Scanner;\n" +
                    "\n" +
                    "public class MaxOfThree {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        Scanner scanner = new Scanner(System.in);\n" +
                    "        System.out.print(\"Enter three numbers: \");\n" +
                    "        int a = scanner.nextInt();\n" +
                    "        int b = scanner.nextInt();\n" +
                    "        int c = scanner.nextInt();\n" +
                    "        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);\n" +
                    "        System.out.println(\"The maximum of the three numbers is: \" + max);\n" +
                    "        scanner.close();\n" +
                    "    }\n" +
                    "}\n");
        }
        // Python
        else if(selectedProgram.equals("Python program to print 'Hello, World!' to the console"))
        {
            codeView.showCode("" +
                    "print(\"Hello, World!\")\n"
            );
        }
        else if(selectedProgram.equals("Python program to add two numbers and print the result"))
        {
            codeView.showCode("" +
                    "num1 = float(input(\"Enter first number: \"))\n" +
                    "num2 = float(input(\"Enter second number: \"))\n" +
                    "sum = num1 + num2\n" +
                    "print(\"The sum of\", num1, \"and\", num2, \"is:\", sum)\n"
            );
        }
        else if(selectedProgram.equals("Python program to calculate the area of a circle based on user input for the radius"))
        {
            codeView.showCode("" +
                    "import math\n\n" +
                    "radius = float(input(\"Enter the radius of the circle: \"))\n" +
                    "area = math.pi * radius ** 2\n" +
                    "print(\"The area of the circle is:\", area)\n"
            );

        }
        else if(selectedProgram.equals("Python program to check if a given number is even or odd"))
        {
            codeView.showCode("" +
                    "num = int(input(\"Enter a number: \"))\n" +
                    "if num % 2 == 0:\n" +
                    "    print(num, \"is even\")\n" +
                    "else:\n" +
                    "    print(num, \"is odd\")\n"
            );
        }
        else if(selectedProgram.equals("Python program to calculate the factorial of a given number"))
        {
            codeView.showCode("" +
                    "num = int(input(\"Enter a number: \"))\n" +
                    "factorial = 1\n" +
                    "if num < 0:\n" +
                    "    print(\"Factorial does not exist for negative numbers.\")\n" +
                    "elif num == 0:\n" +
                    "    print(\"The factorial of 0 is 1\")\n" +
                    "else:\n" +
                    "    for i in range(1, num + 1):\n" +
                    "        factorial *= i\n" +
                    "    print(\"The factorial of\", num, \"is:\", factorial)\n"
            );
        }
        else if(selectedProgram.equals("Python program to swap the values of two variables"))
        {
            codeView.showCode("" +
                    "x = input(\"Enter value of x: \")\n" +
                    "y = input(\"Enter value of y: \")\n" +
                    "print(\"Before swapping - x:\", x, \", y:\", y)\n" +
                    "temp = x\n" +
                    "x = y\n" +
                    "y = temp\n" +
                    "print(\"After swapping - x:\", x, \", y:\", y)\n"
            );
        }
        else if(selectedProgram.equals("Python program to calculate simple interest based on user input for principal, rate, and time"))
        {
            codeView.showCode("" +
                    "principal = float(input(\"Enter the principal amount: \"))\n" +
                    "rate = float(input(\"Enter the rate of interest: \"))\n" +
                    "time = float(input(\"Enter the time period (in years): \"))\n" +
                    "simple_interest = (principal * rate * time) / 100\n" +
                    "print(\"The simple interest is:\", simple_interest)\n"
            );
        }
        else if(selectedProgram.equals("Python program to check if a given year is a leap year"))
        {
            codeView.showCode("" +
                    "year = int(input(\"Enter a year: \"))\n" +
                    "if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):\n" +
                    "    print(year, \"is a leap year\")\n" +
                    "else:\n" +
                    "    print(year, \"is not a leap year\")\n"
            );
        }
        else if(selectedProgram.equals("Python program to generate the Fibonacci series up to a given number"))
        {
            codeView.showCode("" +
                    "terms = int(input(\"Enter the number of terms: \"))\n" +
                    "first_term, second_term = 0, 1\n" +
                    "fibonacci_series = []\n" +
                    "for i in range(terms):\n" +
                    "    fibonacci_series.append(first_term)\n" +
                    "    next_term = first_term + second_term\n" +
                    "    first_term = second_term\n" +
                    "    second_term = next_term\n" +
                    "print(\"Fibonacci Series up to\", terms, \"terms:\", fibonacci_series)\n"
            );
        }
        else if(selectedProgram.equals("Python program to find the maximum of three numbers"))
        {
            codeView.showCode("" +
                    "num1 = float(input(\"Enter first number: \"))\n" +
                    "num2 = float(input(\"Enter second number: \"))\n" +
                    "num3 = float(input(\"Enter third number: \"))\n" +
                    "if num1 >= num2 and num1 >= num3:\n" +
                    "    largest = num1\n" +
                    "elif num2 >= num1 and num2 >= num3:\n" +
                    "    largest = num2\n" +
                    "else:\n" +
                    "    largest = num3\n" +
                    "print(\"The maximum of the three numbers is:\", largest)\n"
            );
        }
        // JavaScript
        else if(selectedProgram.equals("JavaScript program to print 'Hello, World!' to the console"))
        {
            codeView.showCode("" +
                    "// JavaScript program to print 'Hello, World!' to the console\n" +
                    "console.log('Hello, World!');\n"
            );
        }
        else if(selectedProgram.equals("JavaScript program to add two numbers and print the result"))
        {
            codeView.showCode("" +
                    "// JavaScript program to add two numbers and print the result\n" +
                    "let num1 = parseFloat(prompt('Enter first number: '));\n" +
                    "let num2 = parseFloat(prompt('Enter second number: '));\n" +
                    "let sum = num1 + num2;\n" +
                    "console.log('The sum of', num1, 'and', num2, 'is:', sum);\n"
            );
        }
        else if(selectedProgram.equals("JavaScript program to calculate the area of a circle based on user input for the radius"))
        {
            codeView.showCode("" +
                    "// JavaScript program to calculate the area of a circle based on user input for the radius\n" +
                    "const radius = parseFloat(prompt('Enter the radius of the circle: '));\n" +
                    "const area = Math.PI * radius ** 2;\n" +
                    "console.log('The area of the circle is:', area);\n"
            );

        }
        else if(selectedProgram.equals("JavaScript program to check if a given number is even or odd"))
        {
            codeView.showCode("" +
                    "// JavaScript program to check if a given number is even or odd\n" +
                    "const num = parseInt(prompt('Enter a number: '));\n" +
                    "if (num % 2 === 0) {\n" +
                    "    console.log(num, 'is even');\n" +
                    "} else {\n" +
                    "    console.log(num, 'is odd');\n" +
                    "}\n"
            );
        }
        else if(selectedProgram.equals("JavaScript program to calculate the factorial of a given number"))
        {
            codeView.showCode("" +
                    "// JavaScript program to calculate the factorial of a given number\n" +
                    "const num = parseInt(prompt('Enter a number: '));\n" +
                    "let factorial = 1;\n" +
                    "if (num < 0) {\n" +
                    "    console.log('Factorial does not exist for negative numbers.');\n" +
                    "} else {\n" +
                    "    for (let i = 1; i <= num; i++) {\n" +
                    "        factorial *= i;\n" +
                    "    }\n" +
                    "    console.log('The factorial of', num, 'is:', factorial);\n" +
                    "}\n"
            );
        }
        else if(selectedProgram.equals("JavaScript program to swap the values of two variables"))
        {
            codeView.showCode("" +
                    "// JavaScript program to swap the values of two variables\n" +
                    "let x = prompt('Enter value of x: ');\n" +
                    "let y = prompt('Enter value of y: ');\n" +
                    "console.log('Before swapping - x:', x, ', y:', y);\n" +
                    "let temp = x;\n" +
                    "x = y;\n" +
                    "y = temp;\n" +
                    "console.log('After swapping - x:', x, ', y:', y);\n"
            );
        }
        else if(selectedProgram.equals("JavaScript program to calculate simple interest based on user input for principal, rate, and time"))
        {
            codeView.showCode("" +
                    "// JavaScript program to calculate simple interest based on user input for principal, rate, and time\n" +
                    "const principal = parseFloat(prompt('Enter the principal amount: '));\n" +
                    "const rate = parseFloat(prompt('Enter the rate of interest: '));\n" +
                    "const time = parseFloat(prompt('Enter the time period (in years): '));\n" +
                    "const simpleInterest = (principal * rate * time) / 100;\n" +
                    "console.log('The simple interest is:', simpleInterest);\n"
            );
        }
        else if(selectedProgram.equals("JavaScript program to check if a given year is a leap year"))
        {
            codeView.showCode("" +
                    "// JavaScript program to check if a given year is a leap year\n" +
                    "const year = parseInt(prompt('Enter a year: '));\n" +
                    "if ((year % 4 === 0 && year % 100 !== 0) || year % 400 === 0) {\n" +
                    "    console.log(year, 'is a leap year');\n" +
                    "} else {\n" +
                    "    console.log(year, 'is not a leap year');\n" +
                    "}\n"
            );
        }
        else if(selectedProgram.equals("JavaScript program to generate the Fibonacci series up to a given number"))
        {
            codeView.showCode("" +
                    "// JavaScript program to generate the Fibonacci series up to a given number\n" +
                    "const terms = parseInt(prompt('Enter the number of terms: '));\n" +
                    "let firstTerm = 0;\n" +
                    "let secondTerm = 1;\n" +
                    "const fibonacciSeries = [firstTerm];\n" +
                    "for (let i = 1; i < terms; i++) {\n" +
                    "    fibonacciSeries.push(secondTerm);\n" +
                    "    const nextTerm = firstTerm + secondTerm;\n" +
                    "    firstTerm = secondTerm;\n" +
                    "    secondTerm = nextTerm;\n" +
                    "}\n" +
                    "console.log('Fibonacci Series up to', terms, 'terms:', fibonacciSeries);\n"
            );
        }
        else if(selectedProgram.equals("JavaScript program to find the maximum of three numbers"))
        {
            codeView.showCode("" +
                    "// JavaScript program to find the maximum of three numbers\n" +
                    "const num1 = parseFloat(prompt('Enter first number: '));\n" +
                    "const num2 = parseFloat(prompt('Enter second number: '));\n" +
                    "const num3 = parseFloat(prompt('Enter third number: '));\n" +
                    "let max = num1;\n" +
                    "if (num2 > max) {\n" +
                    "    max = num2;\n" +
                    "}\n" +
                    "if (num3 > max) {\n" +
                    "    max = num3;\n" +
                    "}\n" +
                    "console.log('The maximum of the three numbers is:', max);\n"
            );
        }

        // PHP
        else if(selectedProgram.equals("PHP program to print 'Hello, World!' to the console"))
        {
            codeView.showCode("" +
                    "<?php\n" +
                    "echo 'Hello, World!';\n" +
                    "?>");
        }
        else if(selectedProgram.equals("PHP program to add two numbers and print the result"))
        {
            codeView.showCode("<?php\n" +
                    "$num1 = 10;\n" +
                    "$num2 = 20;\n" +
                    "$sum = $num1 + $num2;\n" +
                    "echo 'The sum of ' . $num1 . ' and ' . $num2 . ' is: ' . $sum;\n" +
                    "?>");

        }
        else if(selectedProgram.equals("PHP program to calculate the area of a circle based on user input for the radius"))
        {
            codeView.showCode("<?php\n" +
                    "$radius = 5;\n" +
                    "$area = pi() * $radius * $radius;\n" +
                    "echo 'The area of the circle is: ' . $area;\n" +
                    "?>");

        }
        else if(selectedProgram.equals("PHP program to check if a given number is even or odd"))
        {
            codeView.showCode("<?php\n" +
                    "$number = 10;\n" +
                    "if ($number % 2 == 0) {\n" +
                    "    echo $number . ' is even';\n" +
                    "} else {\n" +
                    "    echo $number . ' is odd';\n" +
                    "}\n" +
                    "?>");

        }
        else if(selectedProgram.equals("PHP program to calculate the factorial of a given number"))
        {
            codeView.showCode("<?php\n" +
                    "$number = 5;\n" +
                    "$factorial = 1;\n" +
                    "for ($i = 1; $i <= $number; $i++) {\n" +
                    "    $factorial *= $i;\n" +
                    "}\n" +
                    "echo 'The factorial of ' . $number . ' is: ' . $factorial;\n" +
                    "?>");

        }
        else if(selectedProgram.equals("PHP program to swap the values of two variables"))
        {
            codeView.showCode("<?php\n" +
                    "$a = 10;\n" +
                    "$b = 20;\n" +
                    "echo 'Before swapping: a = ' . $a . ', b = ' . $b;\n" +
                    "$temp = $a;\n" +
                    "$a = $b;\n" +
                    "$b = $temp;\n" +
                    "echo 'After swapping: a = ' . $a . ', b = ' . $b;\n" +
                    "?>");

        }
        else if(selectedProgram.equals("PHP program to calculate simple interest based on user input for principal, rate, and time"))
        {
            codeView.showCode("<?php\n" +
                    "$principal = 1000;\n" +
                    "$rate = 5;\n" +
                    "$time = 2;\n" +
                    "$simpleInterest = ($principal * $rate * $time) / 100;\n" +
                    "echo 'The simple interest is: ' . $simpleInterest;\n" +
                    "?>");

        }
        else if(selectedProgram.equals("PHP program to check if a given year is a leap year"))
        {
            codeView.showCode("<?php\n" +
                    "$year = 2024;\n" +
                    "if (($year % 4 == 0 && $year % 100 != 0) || $year % 400 == 0) {\n" +
                    "    echo $year . ' is a leap year';\n" +
                    "} else {\n" +
                    "    echo $year . ' is not a leap year';\n" +
                    "}\n" +
                    "?>");

        }
        else if(selectedProgram.equals("PHP program to generate the Fibonacci series up to a given number"))
        {
            codeView.showCode("<?php\n" +
                    "$terms = 10;\n" +
                    "$firstTerm = 0;\n" +
                    "$secondTerm = 1;\n" +
                    "$fibonacciSeries = array();\n" +
                    "for ($i = 0; $i < $terms; $i++) {\n" +
                    "    array_push($fibonacciSeries, $firstTerm);\n" +
                    "    $nextTerm = $firstTerm + $secondTerm;\n" +
                    "    $firstTerm = $secondTerm;\n" +
                    "    $secondTerm = $nextTerm;\n" +
                    "}\n" +
                    "echo 'Fibonacci Series up to ' . $terms . ' terms: ' . implode(', ', $fibonacciSeries);\n" +
                    "?>");

        }
        else if(selectedProgram.equals("PHP program to find the maximum of three numbers"))
        {
            codeView.showCode("<?php\n" +
                    "$num1 = 10;\n" +
                    "$num2 = 20;\n" +
                    "$num3 = 15;\n" +
                    "$max = ($num1 > $num2) ? (($num1 > $num3) ? $num1 : $num3) : (($num2 > $num3) ? $num2 : $num3);\n" +
                    "echo 'The maximum of the three numbers is: ' . $max;\n" +
                    "?>");
        }

        //C++
        else if(selectedProgram.equals("C++ program to print 'Hello, World!' to the console"))
        {
            codeView.showCode("" +
                    "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main() {\n" +
                    "    cout << \"Hello, World!\" << endl;\n" +
                    "    return 0;\n" +
                    "}");
        }
        else if(selectedProgram.equals("C++ program to add two numbers and print the result"))
        {
            codeView.showCode("" +
                    "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main() {\n" +
                    "    int num1 = 5, num2 = 7;\n" +
                    "    int sum = num1 + num2;\n" +
                    "    cout << \"The sum of \" << num1 << \" and \" << num2 << \" is: \" << sum << endl;\n" +
                    "    return 0;\n" +
                    "}");

        }
        else if(selectedProgram.equals("C++ program to calculate the area of a circle based on user input for the radius"))
        {
            codeView.showCode("" +
                    "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main() {\n" +
                    "    double radius;\n" +
                    "    cout << \"Enter the radius of the circle: \";\n" +
                    "    cin >> radius;\n" +
                    "    double area = 3.14159 * radius * radius;\n" +
                    "    cout << \"The area of the circle is: \" << area << endl;\n" +
                    "    return 0;\n" +
                    "}");
        }
        else if(selectedProgram.equals("C++ program to check if a given number is even or odd"))
        {
            codeView.showCode("" +
                    "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main() {\n" +
                    "    int num;\n" +
                    "    cout << \"Enter a number: \";\n" +
                    "    cin >> num;\n" +
                    "    if (num % 2 == 0) {\n" +
                    "        cout << num << \" is even\";\n" +
                    "    } else {\n" +
                    "        cout << num << \" is odd\";\n" +
                    "    }\n" +
                    "    return 0;\n" +
                    "}");

        }
        else if(selectedProgram.equals("C++ program to calculate the factorial of a given number"))
        {
            codeView.showCode("" +
                    "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main() {\n" +
                    "    int num;\n" +
                    "    int factorial = 1;\n" +
                    "    cout << \"Enter a number: \";\n" +
                    "    cin >> num;\n" +
                    "    for (int i = 1; i <= num; ++i) {\n" +
                    "        factorial *= i;\n" +
                    "    }\n" +
                    "    cout << \"The factorial of \" << num << \" is: \" << factorial << endl;\n" +
                    "    return 0;\n" +
                    "}");

        }
        else if(selectedProgram.equals("C++ program to swap the values of two variables"))
        {
            codeView.showCode("" +
                    "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main() {\n" +
                    "    int a = 5, b = 10;\n" +
                    "    cout << \"Before swapping: a = \" << a << \", b = \" << b << endl;\n" +
                    "    int temp = a;\n" +
                    "    a = b;\n" +
                    "    b = temp;\n" +
                    "    cout << \"After swapping: a = \" << a << \", b = \" << b << endl;\n" +
                    "    return 0;\n" +
                    "}");
        }
        else if(selectedProgram.equals("C++ program to calculate simple interest based on user input for principal, rate, and time"))
        {
            codeView.showCode("" +
                    "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main() {\n" +
                    "    double principal, rate, time;\n" +
                    "    cout << \"Enter the principal amount: \";\n" +
                    "    cin >> principal;\n" +
                    "    cout << \"Enter the rate of interest: \";\n" +
                    "    cin >> rate;\n" +
                    "    cout << \"Enter the time period (in years): \";\n" +
                    "    cin >> time;\n" +
                    "    double simpleInterest = (principal * rate * time) / 100;\n" +
                    "    cout << \"The simple interest is: \" << simpleInterest << endl;\n" +
                    "    return 0;\n" +
                    "}");
        }
        else if(selectedProgram.equals("C++ program to check if a given year is a leap year"))
        {
            codeView.showCode("" +
                    "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "bool isLeapYear(int year) {\n" +
                    "    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {\n" +
                    "        return true;\n" +
                    "    }\n" +
                    "    return false;\n" +
                    "}\n" +
                    "\n" +
                    "int main() {\n" +
                    "    int year;\n" +
                    "    cout << \"Enter the year: \";\n" +
                    "    cin >> year;\n" +
                    "    if (isLeapYear(year)) {\n" +
                    "        cout << year << \" is a leap year\";\n" +
                    "    } else {\n" +
                    "        cout << year << \" is not a leap year\";\n" +
                    "    }\n" +
                    "    return 0;\n" +
                    "}");
        }
        else if(selectedProgram.equals("C++ program to generate the Fibonacci series up to a given number"))
        {
            codeView.showCode("" +
                    "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main() {\n" +
                    "    int n;\n" +
                    "    cout << \"Enter the number of terms: \";\n" +
                    "    cin >> n;\n" +
                    "    int first = 0, second = 1;\n" +
                    "    cout << \"Fibonacci series up to \" << n << \" terms: \";\n" +
                    "    for (int i = 1; i <= n; ++i) {\n" +
                    "        cout << first << \" \";\n" +
                    "        int sum = first + second;\n" +
                    "        first = second;\n" +
                    "        second = sum;\n" +
                    "    }\n" +
                    "    return 0;\n" +
                    "}");
        }
        else if(selectedProgram.equals("C++ program to find the maximum of three numbers"))
        {
            codeView.showCode("" +
                    "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main() {\n" +
                    "    int num1 = 10, num2 = 20, num3 = 15;\n" +
                    "    int max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);\n" +
                    "    cout << \"The maximum of the three numbers is: \" << max;\n" +
                    "    return 0;\n" +
                    "}");

        }
    }
}