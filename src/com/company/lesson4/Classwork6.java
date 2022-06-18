package com.company.lesson4;

import java.util.Arrays;

public class Classwork6 {
    public static void main(String[] args) {
        int[][] twoDimArray1 = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] twoDimArray2 = new int[][]{{1, 2, 3}, {1, 1, 1}, {0, 0, 0,}, {2, 1, 0}};
        int[][] twoDimArray3 = new int[3][3];
        System.out.println("Here's your first array");
        System.out.println(Arrays.deepToString(twoDimArray1));
        System.out.println("Here's your second array");
        System.out.println(Arrays.deepToString(twoDimArray2));
        for (int i = 0; i < twoDimArray1.length; i++) {
            for (int u = 0; u < twoDimArray2[0].length; u++) {
                for (int j = 0; j < twoDimArray1[0].length; j++) {
                    twoDimArray3[i][u] += twoDimArray1[i][j] * twoDimArray2[j][u];
                    System.out.println(Arrays.deepToString(twoDimArray3));
                }
            }
        }
        System.out.println("Array, using multiplication of both initial arrays");
        System.out.println(Arrays.deepToString(twoDimArray3));
    }
}