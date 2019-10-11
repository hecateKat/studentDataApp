package com.kat.entity;

import java.util.Scanner;

public class Student {

    private static int id =1000;
    private String studentId;
    private String name;
    private String surname;
    private int year;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int courseCost = 600;


    public Student() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        this.name = sc.nextLine();

        System.out.println("Enter student surname: ");
        this.surname = sc.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\n Enter class level: ");
        this.year = sc.nextInt();

        setStudentId();

    }

    private void setStudentId(){
        id++;
        this.studentId = year + "" + id;
    }

    public void enroll (){
        do {
            System.out.println("Enter course to enroll (q  to quit)");

            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + courseCost;
            } else {
                break;
            }
        }while (1 !=0);
    }

    public void viewBalance(){
        System.out.println("Balance: $" + tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        System.out.println("Enter the payment");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Payment $ " + payment + " accepted.");
    }

    public String showInfo (){
        return "Name: " + name + " " + surname +
        "\nGrade lvl: " + year +
        "\nStudent id: " + studentId +
        "\nCourses enrolled: " + courses +
        "\nBalance: $" + tuitionBalance;
    }
}