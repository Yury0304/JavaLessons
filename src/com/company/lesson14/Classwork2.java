package com.company.lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Classwork2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sasha");
        list.add("Masha");
        list.add("Asha");
        list.add("Kesha");
        list.add("Sanya");
        System.out.println(list);
        System.out.println(list.stream().filter(e -> e.equalsIgnoreCase("Sasha")).count());
        System.out.println(list.stream().filter(e -> e.startsWith("A") || e.startsWith("a")).collect(Collectors.toList()));
        System.out.println(list.stream().sorted().findFirst().orElse("Empty"));

    }
}
