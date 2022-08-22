package com.ali;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an Even Number.");
        } else {
            System.out.println(num + " is an Odd Number");
        }
    }
}
