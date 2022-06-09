package com.company.lesson2;

import java.util.Scanner;

public class Classwork9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input temperature value");
        if (s.hasNextInt()) {
            int t = s.nextInt();
            if (t > -5) {
                System.out.println("Тепло");
            } else if (t <= -5 && t > -20) {
                System.out.println("Нормально");
            } else if (t <= -20) {
                System.out.println("Холодно");
            }
        }
    }
}