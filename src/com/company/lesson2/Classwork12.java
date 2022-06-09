package com.company.lesson2;

import java.util.Scanner;

public class Classwork12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.println("Input whole positive number");

        if (s.hasNextInt()) {
            int number = s.nextInt();
            int i = 1;
            while (i <= number) {
                sum = sum + i;
                i++;
            }
        }
        System.out.println(sum);
    }
}