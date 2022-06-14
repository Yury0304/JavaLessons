package com.company.lesson2;

import java.util.Scanner;

public class Classwork8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input whole number");
        if (s.hasNextInt()) {
            int number = s.nextInt();
            if (number % 2 == 0) {
                System.out.println("This is even number");
            } else {
                System.out.println("This is odd number");
            }
        }
    }
}
