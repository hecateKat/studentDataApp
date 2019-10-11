package com.kat;

import com.kat.entity.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter number of students enrolling courses: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];


        for (int n =0; n< numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            students[n].viewBalance();
            System.out.println(students[n].showInfo());
        }


    }
}
