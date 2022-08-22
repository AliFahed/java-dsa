package com.ali;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String to check if it's Palindrome: ");
        String str = input.next();

        String reverseStr = "";
        int strLength = str.length();
        for (int i = (strLength - 1); i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is Palindrome String");
        } else {
            System.out.println(str + " is not a Palindrome String");
        }
    }
}
