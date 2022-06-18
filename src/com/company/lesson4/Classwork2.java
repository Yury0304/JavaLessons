package com.company.lesson4;

import java.util.Arrays;

public class Classwork2 {
    public static void main(String[] args) {
        String[][] twoDimArray = new String[8][8];
        int i, j = 0;
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                if (i % 2 != 0 && j % 2 == 0) {
                    twoDimArray[i][j] = "B";
                } else if (i % 2 != 0 && j % 2 != 0) {
                    twoDimArray[i][j] = "W";
                } else if (i % 2 == 0 && j % 2 == 0) {
                    twoDimArray[i][j] = "W";
                } else if (i % 2 == 0 && j % 2 != 0) {
                    twoDimArray[i][j] = "B";
                }
            }
        }
        System.out.println("Here's your 8x8 chessboard array");
        System.out.println(Arrays.deepToString(twoDimArray));
    }
}