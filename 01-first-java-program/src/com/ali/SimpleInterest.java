package com.ali;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float principle, time, rate;
        System.out.print("Enter the Principle: ");
        principle = input.nextFloat();

        System.out.print("Enter the Time (Hours): ");
        time = input.nextFloat();

        System.out.print("Enter the Rate: ");
        rate = input.nextFloat();

        float simpleInterest = (principle * time * rate) / 100;
        System.out.println("The Simple Interest is " + simpleInterest);
    }
}
