package com.company.lesson3;

import java.util.Arrays;

public class Classwork7 {
    public static void main(String[] args) {
        String[] names = {"Sasha", "Misha", "Dima", "Lesha", "Vadim"};
        for (int i = 0; i < 5; i++) {
            Arrays.sort(names);
            System.out.print(names[i] + " ");
        }
    }
}
