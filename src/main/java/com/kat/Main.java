package com.kat;

import com.kat.entity.Student;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.enroll();
        student1.payTuition();
        student1.viewBalance();
        System.out.println(student1.showInfo());

    }
}
