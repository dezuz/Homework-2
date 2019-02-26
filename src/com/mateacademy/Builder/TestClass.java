package com.mateacademy.Builder;

public class TestClass {

    public static void main(String[] args) {
        Student firstStudent= new Student.StudentBuilder()
                .setStudentName("Serhij")
                .setStudentSurname("Hurko")
                .setStudentAge(18)
                .setStudentHeight(1.78)
                .setStudentWeight(72.5)
                .build();

        Student secondStudent= new Student.StudentBuilder()
                .setStudentName("Max")
                .setStudentSurname("Dovhopoliy")
                .setStudentAge(19)
                .setStudentHeight(1.80)
                .setStudentWeight(68)
                .build();

        System.out.println("First student name & surname is: " + firstStudent.getName() + " " + firstStudent.getSurname());
        System.out.println("Second student name & surname is: " + secondStudent.getName() + " " + secondStudent.getSurname());
    }
}
