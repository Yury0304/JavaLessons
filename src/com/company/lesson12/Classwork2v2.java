package com.company.lesson12;

import java.util.*;

public class Classwork2v2 {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        List<Integer> list = Arrays.asList(array);
        System.out.println(list);
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println(list.get(i)+" has no pair");
                break;
            }
            counter = 0;
        }
    }
}
