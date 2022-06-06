package com.company.lesson1;
import java.util.Scanner;

public class Classwork3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите а");
        int a = s.nextInt();
        System.out.println("Введите б");
        int b = s.nextInt();
        System.out.println("Введите с");
        int c = s.nextInt();
        double d = Math.pow(b,2)-4*a*c;
        System.out.println("Дискрименант равен");
        System.out.println(Math.round(d));
    }
}
