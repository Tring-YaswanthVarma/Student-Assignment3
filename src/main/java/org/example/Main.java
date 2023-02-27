package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

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
