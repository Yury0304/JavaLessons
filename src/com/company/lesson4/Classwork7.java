package com.company.lesson4;

import java.util.Arrays;

public class Classwork7 {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[3][3];
        int i, j, sum = 0;
        for (i = 0; i < twoDimArray.length; i++) {
            for (j = 0; j < twoDimArray.length; j++) {
                twoDimArray[i][j] = ((int) (Math.random() * 10));
            }
        }
        System.out.println("Here's your random array");
        System.out.println(Arrays.deepToString(twoDimArray));
        System.out.print("Right side diagonal");
        for (i = twoDimArray.length; i >= 0; i--) {
            for (j = 0; j < twoDimArray.length; j++) {
                if (i == j) {
                    System.out.print(twoDimArray[i][j] + "");
                }
            }
            System.out.println();
        }
        System.out.println("Left side diagonal");
        int counter = 0;
        for (i = 0; i < twoDimArray.length; i++) {
            for (j = twoDimArray.length; j >= 0; j--) {
                if (j == twoDimArray.length) {
                    System.out.print(twoDimArray[i][j - 1 - counter] + "");
                    counter++;
                }
            }
            System.out.println();
        }
    }
}
