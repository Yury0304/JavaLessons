package com.company.lesson2;

import java.util.Scanner;

public class Classwork10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input rainbow color number");
        if (s.hasNextInt()) {
            int colorNumber = s.nextInt();
            if (colorNumber == 1) {
                System.out.println("Your color is red");
            } else if (colorNumber == 2) {
                System.out.println("Your color is orange");
            } else if (colorNumber == 3) {
                System.out.println("Your color is yellow");
            } else if (colorNumber == 4) {
                System.out.println("Your color is green");
            } else if (colorNumber == 5) {
                System.out.println("Your color is blue");
            } else if (colorNumber == 6) {
                System.out.println("Your color is dark blue");
            } else if (colorNumber == 7) {
                System.out.println("Your color is purple");
            } else {
                System.out.println("Something wrong, try again");
            }
        }
    }
}