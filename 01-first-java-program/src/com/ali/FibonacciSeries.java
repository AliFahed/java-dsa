package com.ali;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int num3;

        System.out.print("Enter the length of Fibonacci Series: ");
        int length = input.nextInt();

        System.out.print(num1 + " " + num2);
        for (int i = 2; i < length; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
