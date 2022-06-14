package com.company.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Classwork5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input array size (random whole number from 6 to 10)");
        int arrayLenght = 0;
        if (!s.hasNextInt()) {
            System.out.println("Your input is not a number");
        } else if (s.hasNextInt()) {
            arrayLenght = s.nextInt();
            if (arrayLenght < 6 || arrayLenght > 10) {
                System.out.println("Your number is out of the specified range");
            }
        }
        int[] currentArray = new int[arrayLenght];
        int counter = 0;
        for (int i = 0; i < arrayLenght; i++) {
            currentArray[i] = ((int) (Math.random() * 10));
            if (currentArray[i] % 2 == 0) {
                counter = counter + 1;
            }
        }
        if (arrayLenght > 5 && arrayLenght <= 10) {
            System.out.println("Here's your random array");
            System.out.println(Arrays.toString(currentArray));
        }
        int[] modEvenArray = new int[counter];
        int modIndex = 0;
        for (int i = 0; i < arrayLenght; i++) {
            if (currentArray[i] % 2 == 0) {
                modEvenArray[modIndex] = currentArray[i];
                modIndex++;
            }
        }
        if (arrayLenght > 5 && arrayLenght <= 10) {
            System.out.println("Here's your modified array, possessing only even numbers");
            System.out.println(Arrays.toString(modEvenArray));
        }
    }
}
