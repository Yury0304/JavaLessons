package com.company.lesson12;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Classwork1v2 {
    public static ConcurrentHashMap<String, String> getMyMap(ConcurrentHashMap<String, String> m){
        ConcurrentHashMap<String, String> map2 = new ConcurrentHashMap<String, String>();
        for(Map.Entry<String, String> e:m.entrySet()){
            map2.put(e.getValue(), e.getKey());
        }
        return map2;
    }
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map1 = new ConcurrentHashMap<String, String>();
        map1.put("abc", "123");
        map1.put("def", "456");
        map1.put("ghk", "789");
        map1 = getMyMap(map1);
        System.out.println(map1);


    }
}
