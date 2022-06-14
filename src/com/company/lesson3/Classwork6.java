package com.company.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Classwork6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] currentArray = new int[10];
        for (int i = 0; i < currentArray.length; i++) {
            currentArray[i] = ((int) (Math.random() * 10));
        }
        System.out.println("Here's your random array");
        System.out.println(Arrays.toString(currentArray));
        for (int i = 0; i < currentArray.length; i++) {
            if (currentArray[i] % 2 != 0) {
                currentArray[i] = 0;
            }
        }
        System.out.println("Here's your modified array, with odd numbers changed to null");
        System.out.println(Arrays.toString(currentArray));
    }
}
