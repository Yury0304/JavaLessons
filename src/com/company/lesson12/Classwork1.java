package com.company.lesson12;

import java.util.HashMap;
import java.util.Map;

public class Classwork1 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "aaa");
        map.put("2", "bbb");
        map.put("3", "ccc");
        map.put("4", "ccc");
        map.put("5", "eee");
        map.put("6", "fff");
        String key = "";
        String value = "";

        Map<String, String> mapSecond = new HashMap<>();
        for (Map.Entry<String, String> mapReplace : map.entrySet()) {
            key = mapReplace.getKey();
            value = mapReplace.getValue();
            mapSecond.put(value, key);
        }
        System.out.println(mapSecond);
    }
}
