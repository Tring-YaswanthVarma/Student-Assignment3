package org.example;

import java.util.Scanner;

public class Student {
    private String name;
    private char gradeLevel;
    private double gpa;

    Student(String name, char gradeLevel, double gpa){
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    public void updateGPA(double newGpa){
        gpa = newGpa;
    }

    public String student_grade(){
        return name + " has a gpa of " + gpa;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        char gradeLevel;
        double gpa;
        System.out.println("Enter name of the student : ");
        name = sc.nextLine();
        System.out.println("Enter the grade level : ");
        gradeLevel = sc.next().charAt(0);
        System.out.println("Enter GPA : ");
        gpa = sc.nextDouble();
        Student s = new Student(name, gradeLevel, gpa);
        String studentGrade = s.student_grade();
        System.out.println(studentGrade);
        s.updateGPA(94.6);
        studentGrade = s.student_grade();
        System.out.println(studentGrade);
    }
}