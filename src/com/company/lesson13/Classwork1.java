package com.company.lesson13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Classwork1 {
    public static void main(String[] args) {
        Date dateNow = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("E");
        System.out.println("Current day of the week: "+sdf.format(dateNow));
    }
}
