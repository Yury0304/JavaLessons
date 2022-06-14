package com.company.lesson3;

import java.util.Arrays;

public class Classwork9 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
        }
        System.out.println("Here's your unsorted array");
        System.out.println(Arrays.toString(array));
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println("Here's your sorted array");
        System.out.println(Arrays.toString(array));
    }
}
