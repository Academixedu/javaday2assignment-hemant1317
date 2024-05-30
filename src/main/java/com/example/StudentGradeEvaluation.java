package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {

        // Create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        // Read the input provided by the user for name
        String name = scanner.nextLine();
        // Print the user's name
        System.out.println("Name: " + name);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        // Read the integer input provided by the user for age
        int age = scanner.nextInt();
        // Print the user's age
        System.out.println("Age: " + age);

        // Prompt the user to enter their exam score
        System.out.print("Enter your exam score: ");
        // Read the double input provided by the user for score
        int score = scanner.nextInt();
        // Print the user's score
        System.out.println("Score: " + score);
        
        String grade;

        // Determine the grade
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80 && score <=89) {
                grade = "B";
            } else if (score >= 70 && score <= 79) {
                    grade = "C";
            }  else if (score >= 60 && score <= 69) {
                        grade = "D";
            }    else {
                            grade = "F";
            }
        
        // Print the student's details
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);


       
    }
}
