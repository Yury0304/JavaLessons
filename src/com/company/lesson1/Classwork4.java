package com.company.lesson1;
import java.util.Scanner;

public class Classwork4 {
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
        if (d<0){
            System.out.println("Корней нет");
        } else if (d==0){
            int x0 = -b/(2*a);
            System.out.println("Корень уравнения равен");
            System.out.println(x0);
        } else {
            double x1 = (-b + Math.sqrt(d)) / 2 * a;
            double x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("Корень уравнения равен");
            System.out.printf("%.2f",x1);
            System.out.println();
            System.out.println("Корень уравнения равен");
            System.out.printf("%.2f",x2);
        }
    }
}
