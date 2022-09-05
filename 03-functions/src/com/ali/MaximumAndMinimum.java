package com.ali;

import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        maximum(a, b, c);
        minimum(a, b, c);
    }

    static void maximum(int a, int b, int c) {
        int max = a; // suppose maximum is a

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("Maximum number is " + max);
    }

    static void minimum(int a, int b, int c) {
        int min = a; // suppose minimum is a

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        System.out.println("Minimum number is " + min);
    }

}
