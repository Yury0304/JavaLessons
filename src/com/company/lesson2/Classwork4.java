package com.company.lesson2;

public class Classwork4 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            int j = 1;
            while (j < 10) {
                System.out.printf("%4d", (i * j));
                System.out.print(" " + "|");
                j++;
            }
            System.out.print("\n——————————————————————————————————————————————————————\n");
            i++;
        }
    }
}
