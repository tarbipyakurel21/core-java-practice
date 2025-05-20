package com.example.array_and_strings;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
            total += scores[i];
        }

        double average = total / 5.0;
        char grade;

        if (average >= 90) grade = 'A';
        else if (average >= 80) grade = 'B';
        else if (average >= 70) grade = 'C';
        else if (average >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("Average: " + average + " -> Grade: " + grade);
    }
}
