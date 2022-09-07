package com.ali;

import java.util.Arrays;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // declare and initialize array
        int[] arr = new int[3];

        // manually input
        arr[0] = 1;
        arr[1]= 2;
        arr[2] = 3;

        // manually output
        System.out.println(arr[0]);

        // for loop input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // for loop output
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        /*
         * the reference value 'num' will be equal to each element in the
         * array, starting from the first to the last element. */
        // enhanced for loop output
        for (int num : arr) {
            System.out.print(num + " ");
        }

        /*
         * Easiest way to output one-dimensional array elements,
         * - How it works:
         *   the function toString() uses a for-loop to output each
         *   element in the array. */
        // toString() method output
        System.out.println(Arrays.toString(arr));
    }
}
