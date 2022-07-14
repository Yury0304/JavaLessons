package com.company.lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class StudentMain {
    public static void main(String[] args) {
        Student students [] = new Student[7];

        students[0] = new Student("Misha",3.151f);
        students[1] = new Student("Masha",5.1515f);
        students[2] = new Student("Nasha",6.151f);
        students[3] = new Student("Vasya",4.545f);
        students[4] = new Student("Sasha",7.1515f);
        students[5] = new Student("Kate",8.1515f);
        students[6] = new Student("John",9.25156f);

        List<Student> Student = new ArrayList<Student>();

        Student.add(0,students[0]);
        Student.add(1,students[1]);
        Student.add(2,students[2]);
        Student.add(3,students[3]);
        Student.add(4,students[4]);
        Student.add(5,students[5]);
        Student.add(6,students[6]);

        System.out.println(Student);

            for (int j = 0; j < students.length; j++) {
                if (students[j].mark < 4f) {
                    Student.remove(j);
                }
            }
        System.out.println(Student);

    }
}
 /* Student student1 = new Student("Misha",3.151f);
        Student student2 = new Student("Masha",5.1515f);
        Student student3 = new Student("NAsha",6.151f);
        Student student4 = new Student("Vasya",4.545f);
        Student student5 = new Student("Sasha",7.1515f);
        Student student6 = new Student("kate",8.1515f);
        Student student7 = new Student("John",9.25156f);
        List<Student> Student = new ArrayList<Student>();


 Student.add(0,student1);
        Student.add(1,student2);
        Student.add(2,student3);
        Student.add(3,student4);
        Student.add(4,student5);
        Student.add(5,student6);
        Student.add(6,student7);
        System.out.println(Student);

for (Student s: Student){
if(s.mark<4f){

    System.out.println("ss");
    Student.remove(s.mark<4f);
}
}
        System.out.println(Student);
         }
         }*/