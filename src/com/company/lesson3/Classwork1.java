package com.company.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Classwork1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input random whole number from 1 to 9");
        int randomNumber = s.nextInt();
        System.out.println("All matches will be converted to null");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10));
        }
        System.out.println("Your current array");
        System.out.println(Arrays.toString(array));
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == randomNumber) {
                array[i] = 0;
                counter++;
            }
        }
        System.out.println("Match(es) found: " + counter);
        System.out.println("Your modified array");
        System.out.println(Arrays.toString(array));
    }
}
