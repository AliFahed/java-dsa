package com.ali;

import java.util.Scanner;

public class RupeesToUsd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amount in Rupees: ");
        double rupees = input.nextDouble();

        double usdRate = 0.01251801;
        double convertToUsd = rupees * usdRate;

        System.out.println(rupees + " rupees is equal to " + convertToUsd + " USD");
    }
}
