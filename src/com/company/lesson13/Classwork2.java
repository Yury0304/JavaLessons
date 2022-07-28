package com.company.lesson13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Classwork2 {
    public static void main(String[] args) {
        String date1 = "28.07.2022";
        String date2 = "02.08.2022";
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date now = null;
        Date tuesday = null;
        try {
            now = sdf.parse(date1);
            tuesday = sdf.parse(date2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long difference = tuesday.getTime() - now.getTime();
        System.out.println("Между указанными датами период " + difference + " секунд");
        int days = (int) (difference / (24 * 60 * 60 * 1000));
        System.out.println("Между указанными датами период " + days + " дней");
        Date dateNow = new Date();
        long nextTuesday = dateNow.getTime() + difference;
        System.out.println("Дата следующего вторника: " + sdf.format(nextTuesday));
    }
}
