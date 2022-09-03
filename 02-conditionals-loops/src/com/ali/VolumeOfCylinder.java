package com.ali;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = in.nextDouble();
        System.out.print("Enter a height: ");
        double height = in.nextDouble();

        double ans = calculateVolumeOfCylinder(radius, height);
        System.out.println(ans);
    }

    static double calculateVolumeOfCylinder(double radius, double height) {
        double pi = 3.14159265359;

        return pi * Math.pow(radius, 2) * height;
    }
}
