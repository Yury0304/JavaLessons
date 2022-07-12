package com.company.lesson11;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Classwork1 {
    static final String VALID_NUMBER = "Valid number: ";
    static final String INVALID_NUMBER = "Invalid number: ";
    static final String INVALID_NUMBER_START = ": doesn't start with 'docnum' or 'contract'\n";
    static final String INVALID_NUMBER_CONTENT = ": contains service characters\n";
    static final String INVALID_NUMBER_LENGTH = ": total length is not 15\n";

    public static void main(String[] args) {
        File inputNumber = new File("F:\\Java\\Джава курсы\\07.07", "inputNumber.txt");
        File validNumber = new File("F:\\Java\\Джава курсы\\07.07", "validNumber.txt");
        File invalidNumber = new File("F:\\Java\\Джава курсы\\07.07", "invalidNumber.txt");
        try (FileReader inputFileReader = new FileReader(inputNumber);
             BufferedReader inputReader = new BufferedReader(inputFileReader);
             BufferedWriter validWriter = new BufferedWriter(new FileWriter(validNumber));
             BufferedWriter invalidWriter = new BufferedWriter(new FileWriter(invalidNumber));
        ) {
            List<String> list = inputReader.lines().collect(Collectors.toList());
            for (String s : list) {
                if (validNumberStart(s) && validNumberContent(s) && validNumberLength(s)) {
                    validWriter.write(s + "\n");
                    System.out.println(VALID_NUMBER + s);
                } else {
                    if (!validNumberStart(s)) {
                        invalidWriter.write(s + INVALID_NUMBER_START);
                    } else if (!validNumberContent(s)) {
                        invalidWriter.write(s + INVALID_NUMBER_CONTENT);
                    } else if (!validNumberLength(s)) {
                        invalidWriter.write(s + INVALID_NUMBER_LENGTH);
                    }
                    System.out.println(INVALID_NUMBER + s);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean validNumberStart(String s) {
        return s.startsWith("docnum") || s.startsWith("contract");
    }

    private static boolean validNumberContent(String s) {
        return s.matches("[a-zA-Z0-9]+");
    }

    private static boolean validNumberLength(String s) {
        return s.length() == 15;
    }
}
