package com.company.lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Misha", 3.151f);
        Student student2 = new Student("Masha", 5.1515f);
        Student student3 = new Student("Nasha", 6.151f);
        Student student4 = new Student("Vasya", 4.545f);
        Student student5 = new Student("Sasha", 7.1515f);
        Student student6 = new Student("Kate", 8.1515f);
        Student student7 = new Student("John", 3.25156f);
        List<Student> Student = new ArrayList<>();
        Student.add(0, student1);
        Student.add(1, student2);
        Student.add(2, student3);
        Student.add(3, student4);
        Student.add(4, student5);
        Student.add(5, student6);
        Student.add(6, student7);
        System.out.println(Student);
        for (int i = 0; i < Student.size(); i++) {
            if (Student.get(i).getMark() < 4f) {
                Student.remove(i);
                i--;
            }
        }
        System.out.println(Student);
    }
}