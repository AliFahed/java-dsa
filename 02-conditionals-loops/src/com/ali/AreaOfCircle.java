package com.ali;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Circle radius: ");
        double radius = in.nextDouble();

        double ans = calculateAreaOfCircle(radius);
        System.out.println(ans);
    }

    static double calculateAreaOfCircle(double radius) {
        double pi = 3.14159265359;

        return pi * Math.pow(radius, 2);
    }
}
