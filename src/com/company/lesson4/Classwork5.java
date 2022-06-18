package com.company.lesson4;

import java.util.Arrays;

public class Classwork5 {
    public static void main(String[] args) {
        String[][] twoDimArray = new String[8][8];
        int i, j;
        for (i = 0; i < twoDimArray.length; i++) {
            for (j = 0; j < twoDimArray.length; j++) {
                if ((i + j) % 2 == 0) {
                    twoDimArray[i][j] = "W";
                } else {
                    twoDimArray[i][j] = "B";
                }
            }
        }
        System.out.println("Here's your 8x8 chessboard array");
        System.out.println(Arrays.deepToString(twoDimArray));
    }
}
