package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {

        // Create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Enter your name: ");
        // Read the input provided by the user for name
        String name = scanner.nextLine();
        // Print the user's name
        System.out.println("Your name " + name);

        // Prompt the user to enter their age
        System.out.println("Enter your age: ");
        // Read the integer input provided by the user for age
        int age = scanner.nextInt();
        // Print the user's age
        System.out.println("Your age " + age);

        // Prompt the user to enter their exam score
        System.out.println("Enter your exam score: ");
        // Read the double input provided by the user for score
        Double score = scanner.nextDouble();
        // Print the user's score
        System.out.println("Your exam score " + score);
        
        // Determine the grade
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score <=89) {
            System.out.println("Grade: B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("Grade: C");
            }  else if (score >= 60 && score <= 69) {
                    System.out.println("Grade: D");
            }    else {
                        System.out.println("Grade: F");
            }
        
        // Print the student's details
        

       
    }
}
