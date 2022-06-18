package com.company.lesson4;

import java.util.Arrays;

public class Classwork8 {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[3][3];
        int i, j, k, b = 0;
        for (i = 0; i < twoDimArray.length; i++) {
            for (j = 0; j < twoDimArray.length; j++) {
                twoDimArray[i][j] = ((int) (Math.random() * 100));
            }
        }
        System.out.println("Here's your random array");
        System.out.println(Arrays.deepToString(twoDimArray));
        for (i = 0; i < twoDimArray.length; i++) {
            for (j = 0; j < twoDimArray.length; j++) {
                for (k = j + 1; k < twoDimArray.length; k++) {
                    if (twoDimArray[i][j] > twoDimArray[i][k]) {
                        b = twoDimArray[i][j];
                        twoDimArray[i][j] = twoDimArray[i][k];
                        twoDimArray[i][k] = b;
                    }
                }
            }
        }
        System.out.println("Here's your sorted by strings array");
        System.out.println(Arrays.deepToString(twoDimArray));
    }
}