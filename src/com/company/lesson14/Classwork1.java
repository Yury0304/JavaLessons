package com.company.lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Classwork1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(9);
        list.add(14);
        list.add(14);
        list.add(19);
        list.add(11);
        System.out.println("Initial list");
        System.out.println(list);
        System.out.println("Delete duplicates");
        System.out.println(list.stream()
                .distinct()
                .collect(Collectors.toList()));
        System.out.println("Even numbers from 7 to 17(included)");
        System.out.println(list.stream()
                .filter(number -> number > 7 && number <= 17 && number % 2 == 0)
                .collect(Collectors.toList()));
        System.out.println("All numbers are multiplied by 2");
        System.out.println(list.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList()));
        System.out.println("Sort all numbers and print first 4");
        System.out.println(list.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList()));
        System.out.println("Count numbers in list");
        long total = list.stream().count();
        System.out.println(total);
        double[] listDouble = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            listDouble[i] = (double) list.get(i);
        }
        System.out.println("Count average of numbers in list");
        System.out.println(Arrays.stream(listDouble)
                .reduce(0, (x, y) -> (x + y))
                / list.size());
    }
}
