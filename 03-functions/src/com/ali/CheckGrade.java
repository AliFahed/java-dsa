package com.ali;

import java.util.Scanner;

public class CheckGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = in.nextInt();

        displayGrade(marks);
    }

    static void displayGrade(int marks) {
        String grade = "";

        if (marks > 100) {
            grade = "Maximum mark is 100, Please try again.";
        }

        if (marks >= 91 && marks <= 100) {
            grade = "AA";
        }

        if (marks >= 81 && marks <= 90) {
            grade = "AB";
        }

        if (marks >= 71 && marks <= 80) {
            grade = "BB";
        }

        if (marks >= 61 && marks <= 70) {
            grade = "BC";
        }

        if (marks >= 51 && marks <= 60) {
            grade = "CD";
        }

        if (marks >= 41 && marks <= 50) {
            grade = "DD";
        }

        if (marks <= 40) {
            grade = "Fail";
        }

        System.out.println(grade);
    }
}
