package com.ali;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = in.nextDouble();

        double ans = calculatePerimeterOfCircle(radius);
        System.out.println(ans);
    }

    static double calculatePerimeterOfCircle(double radius) {
        double pi = 3.14159265359;

        return 2 * pi * radius;
    }
}
