package com.company.lesson2;

public class Classwork5 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            int j = 1;
            while (j < 10) {
                System.out.print(i * j + " ");
                if (i * j < 10) {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
