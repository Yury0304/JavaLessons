package com.company.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Classwork3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[10];
        for (int i=0; i<array.length; i++){
            array[i]= ((int)(Math.random()*10));
        }
        System.out.println("Input random whole number");
        int randomNumber = s.nextInt();
        System.out.println("Your current array");
        System.out.println(Arrays.toString(array));
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == randomNumber) {
                counter = counter + 1;
            }
        }
        if (counter > 0) {
            System.out.println("Your number has match(es) with members of array");
        } else {
            System.out.println("No match(es)");
        }
    }
}
