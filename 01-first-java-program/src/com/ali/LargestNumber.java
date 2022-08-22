package com.ali;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter another Number: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is Greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is Greater than " + num1);
        } else {
            System.out.println(num1 + " and " + num2 + " are Equal");
        }
    }
}
