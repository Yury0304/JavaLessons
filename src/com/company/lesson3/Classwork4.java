package com.company.lesson3;

import java.util.Arrays;

public class Classwork4 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int) (Math.random() * 10));
            sum1 = sum1 + array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array2[j] = ((int) (Math.random() * 10));
            sum2 = sum2 + array2[j];
        }
        System.out.println("Here's your first array");
        System.out.println(Arrays.toString(array1));
        System.out.println("Here's your second array");
        System.out.println(Arrays.toString(array2));
        double average1 = sum1 / array1.length;
        double average2 = sum2 / array2.length;
        if (average1 > average2) {
            System.out.println("The average of the first array is greater");
        } else if (average2 > average1) {
            System.out.println("The average of the second array is greater");
        } else {
            System.out.println("Both arrays have the same average number");
        }
    }
}
