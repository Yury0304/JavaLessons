package com.company.lesson4;

import java.util.Arrays;

public class Classwork4 {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[4][4];
        int i, j, sum = 0;
        for (i = 0; i < twoDimArray.length; i++) {
            for (j = 0; j < twoDimArray.length; j++) {
                twoDimArray[i][j] = ((int) (Math.random() * 10));
                sum += twoDimArray[i][j];
            }
        }
        System.out.println("Here's your random array");
        System.out.println(Arrays.deepToString(twoDimArray));
        System.out.println("Sum of all members");
        System.out.println(sum);
    }
}
