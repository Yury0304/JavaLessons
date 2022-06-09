package com.company.lesson2;

import java.util.Scanner;

public class Classwork16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input sum of deposit");
        float sum = s.nextFloat();
        System.out.println("Input number of months");
        int monthNumber = s.nextInt();
        String resultSum = "";
        for (int i = 1; i <= monthNumber; i++) {
            sum = sum + sum / 100 * 7;
            resultSum = String.format("%.2f", sum);
            System.out.println("Sum of your deposit for " + i + " month(s) " + resultSum);
        }
        System.out.println();
        System.out.println("Overall sum of your deposit is " + resultSum);
    }
}