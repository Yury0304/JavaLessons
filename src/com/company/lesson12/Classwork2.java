package com.company.lesson12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classwork2 {
    public static void main(String[] args) {

        List<Integer> listValue = new ArrayList<>();
        listValue.add(1);
        listValue.add(2);
        listValue.add(3);
        listValue.add(4);
        listValue.add(5);
        listValue.add(4);
        listValue.add(3);
        listValue.add(2);
        listValue.add(1);
        Map<Integer, Integer> listToMap = new HashMap<>();

        for (Integer l : listValue) {
            if (listToMap.containsKey(l)) {
                listToMap.put(l, listToMap.get(l) + 1);
                System.out.println(listToMap.put(l, listToMap.get(l) + 1));
            } else {
                listToMap.put(l, 1);
                System.out.println(listToMap.put(l, 1));
            }
        }
        for (Map.Entry<Integer, Integer> duplicate : listToMap.entrySet()) {
            if (duplicate.getValue() == 1) {
                System.out.println(duplicate.getKey() + " has no pair");
            }
        }
    }
}


