package com.ali;

import java.util.Scanner;

public class GreetingUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String userName = input.nextLine();

        System.out.println("Hey " + userName);
    }
}
