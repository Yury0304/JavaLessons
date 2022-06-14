package com.company.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Classwork2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input array lenght");
        int arrayLenght = s.nextInt();
        int[] array = new int[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            array[i] = ((int) (Math.random() * 10));
        }
        System.out.println("Here's your array");
        System.out.println(Arrays.toString(array));

        int max = array[0];
        for (int i = 0; i < arrayLenght; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max value of array is " + max);

        int min = array[0];
        for (int i = 0; i < arrayLenght; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min value of array is " + min);

        double sum = 0;
        for (int i = 0; i < arrayLenght; i++) {
            sum = sum + array[i];
        }
        double average = sum / array.length;
        System.out.println("Average value of array is " + average);

    }
}
