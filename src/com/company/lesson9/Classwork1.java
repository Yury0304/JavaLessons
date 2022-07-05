package com.company.lesson9;

import java.util.Scanner;

public class Classwork1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input document number (string type)");
        System.out.println("Ex. xxxx-yyy-xxxx-yyy-xyxy");
        System.out.println("1111-aaa-1111-aaa-1a1a");
        System.out.println("x is number, y is letter");
        String documentNumber = s.nextLine();

        for (String split : documentNumber.split("-")) {
            if (split.equals("1111")) {
                System.out.print(split);
            }
        }
        System.out.println();
        System.out.println(documentNumber.replace("aaa", "***"));

        for (String split : documentNumber.split("-")) {
            if (split.equals("aaa")) {
                System.out.print(split.toLowerCase() + "/");
            } else if (split.equals("1a1a")) {
                System.out.print(split.replace("1a1a", "a/a").toLowerCase());
            }
        }
        System.out.println();
        for (String split : documentNumber.split("-")) {

            if (split.equals("aaa")) {
                System.out.print(split.toUpperCase() + "/");
            } else if (split.equals("1a1a")) {
                System.out.print(split.replace("1a1a", "a/a").toUpperCase());
            }

        }
        System.out.println();

        StringBuilder buildNumber = new StringBuilder(documentNumber);
        buildNumber.delete(0, 5);
        buildNumber.replace(0, 4, "AAA/");
        buildNumber.delete(4, 9);
        buildNumber.replace(4, 8, "AAA/");
        buildNumber.replace(8, 12, "A/A");
        buildNumber.insert(0, "Letters:");
        System.out.println(buildNumber);
        System.out.println();

        if (documentNumber.contains("abc") || documentNumber.contains("ABC")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println();

        if (documentNumber.indexOf("555", 0) >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println();

        if (documentNumber.lastIndexOf("1a2b", 21) >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
