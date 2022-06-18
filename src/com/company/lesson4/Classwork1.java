package com.company.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Classwork1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input random whole number");
        int randomNumber = s.nextInt();
        int[][][] threeDimArray = new int[2][2][2];
        int i, j, k, p = 0;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                for (k = 0; k < 2; k++) {
                    threeDimArray[i][j][k] = ((int) (Math.random() * 100));
                }
            }
        }
        System.out.println("Here's your initial array");
        System.out.println(Arrays.deepToString(threeDimArray));
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                for (k = 0; k < 2; k++) {
                    threeDimArray[i][j][k] = threeDimArray[i][j][k] + randomNumber;
                }
            }
        }
        System.out.println("Here's your modified array");
        System.out.println(Arrays.deepToString(threeDimArray));
    }
}
