package com.ali;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = in.nextInt();

        checkNumber(num);
    }

    static void checkNumber(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even Number.");
        } else {
            System.out.println(num + " is Odd number.");
        }
    }
}
