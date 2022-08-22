package com.ali;

import java.util.Arrays;
import java.util.Scanner;

public class TwoNumbersAndOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter a Another Number: ");
        int num2 = input.nextInt();

        System.out.print("Enter an Operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Please Enter Valid Numbers and Operator.");
        }
    }
}
