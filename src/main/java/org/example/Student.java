package org.example;

import java.util.Scanner;

public class Student {
    private String name;
    private char grade_level;
    private double gpa;

    Student(String name, char grade_level, double gpa){
        this.name = name;
        this.grade_level = grade_level;
        this.gpa = gpa;
    }

    public void update_GPA(double new_gpa){
        gpa = new_gpa;
    }

    public String student_grade(){
        return name + " has a gpa of " + gpa;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        char grade_level;
        double gpa;
        System.out.println("Enter name of the student : ");
        name = sc.nextLine();
        System.out.println("Enter the grade level : ");
        grade_level = sc.next().charAt(0);
        gpa = sc.nextDouble();
        Student s = new Student(name, grade_level, gpa);
        System.out.println(s.student_grade());
        s.update_GPA(94.6);
        System.out.println(s.student_grade());
    }
}