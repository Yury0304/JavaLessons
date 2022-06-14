package com.company.lesson3;

import java.util.Arrays;

public class Classwork8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
        }
        System.out.println("Here's your unsorted array");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) { //outer circle for counting iterations of sorting
            for (int j = array.length - 1; j > i; j--) { // inner circle for switching members
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Here's your sorted array");
        System.out.println(Arrays.toString(array));
    }
}
