package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class Student {
    private String name;
    private char gradeLevel;
    private double gpa;

    Student(String name, char gradeLevel, double gpa) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    public void updateGPA(double newGpa) {
        gpa = newGpa;
    }

    public String studentGrade() {
        return name + " has a gpa of " + gpa;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("com.api.jar");
        String name;
        char gradeLevel;
        double gpa;
        logger.info("Enter name of the student : ");
        name = sc.nextLine();
        logger.info("Enter the grade level : ");
        gradeLevel = sc.next().charAt(0);
        logger.info("Enter GPA : ");
        gpa = sc.nextDouble();
        Student s = new Student(name, gradeLevel, gpa);
        String studentGrade = s.studentGrade();
        logger.info(studentGrade);
        s.updateGPA(94.6);
        studentGrade = s.studentGrade();
        logger.info(studentGrade);

    }
}