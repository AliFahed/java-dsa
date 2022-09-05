package com.ali;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        checkEligibility(age);
    }

    static void checkEligibility(int age) {
        int eligibleAge = 18;

        if (age >= eligibleAge) {
            System.out.println("You are Eligible to Vote");
        } else {
            System.out.println("You are not Eligible to Vote");
        }
    }
}
