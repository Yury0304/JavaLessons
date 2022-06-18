package com.company.lesson4;

import java.util.Arrays;

public class Classwork9 {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[3][3];
        int i, j = 0;
        for (i = 0; i < twoDimArray.length; i++) {
            for (j = 0; j < twoDimArray.length; j++) {
                twoDimArray[i][j] = ((int) (Math.random() * 100));
            }
        }
        System.out.println("Here's your random array");
        System.out.println(Arrays.deepToString(twoDimArray));
        for (i = 0; i < twoDimArray.length; i++) {
            for (j = 0; j < twoDimArray[i].length; j++) {
                Arrays.sort(twoDimArray[i]);
            }
        }
        System.out.println("Here's your sorted by strings array");
        System.out.println(Arrays.deepToString(twoDimArray));
    }
}
