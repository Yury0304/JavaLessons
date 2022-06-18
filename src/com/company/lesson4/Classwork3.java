package com.company.lesson4;

import java.util.Arrays;

public class Classwork3 {
    public static void main(String[] args) {
        String[][] twoDimArray = new String[8][8];
        int i, j = 0;
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
            }
        }
        for (i = 0; i < 8; i = i + 2) {
            for (j = 0; j < 8; j = j + 2) {
                twoDimArray[i][j] = "W";
            }
        }
        for (i = 0; i < 8; i = i + 2) {
            for (j = 1; j < 8; j = j + 2) {
                twoDimArray[i][j] = "B";
            }
        }
        for (i = 1; i < 8; i = i + 2) {
            for (j = 0; j < 8; j = j + 2) {
                twoDimArray[i][j] = "B";
            }
        }
        for (i = 1; i < 8; i = i + 2) {
            for (j = 1; j < 8; j = j + 2) {
                twoDimArray[i][j] = "W";
            }
        }
        System.out.println("Here's your 8x8 chessboard array");
        System.out.println(Arrays.deepToString(twoDimArray));
    }
}
