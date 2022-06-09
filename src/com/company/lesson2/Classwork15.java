package com.company.lesson2;

public class Classwork15 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;
        int d;
        int sum = 1;
        System.out.print(a + " " + b + " " + c + " ");
        while (sum <= 8) { // 3 members have already been used, so 11-3=8
            d = b + c;
            System.out.print(d + " ");
            b = c;
            c = d;
            sum++;
        }
    }
}
