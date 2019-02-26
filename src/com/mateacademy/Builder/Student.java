package com.mateacademy.Builder;

public class Student {

    private final String name;
    private final String surname;
    private final int age;
    private final double height;
    private final double weight;

    private Student(String name, String surname, int age, double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public static class StudentBuilder {

        private String name;
        private String surname;
        private int age;
        private double height;
        private double weight;

        public StudentBuilder setStudentName(String name) {
            this.name = name;

            return this;
        }

        public StudentBuilder setStudentSurname(String surname) {
            this.surname = surname;

            return this;
        }

        public StudentBuilder setStudentAge(int age) {
            this.age = age;

            return this;
        }

        public StudentBuilder setStudentHeight(double height) {
            this.height = height;

            return this;
        }

        public StudentBuilder setStudentWeight(double weight) {
            this.weight = weight;

            return this;
        }

        public Student build() {
            return new Student(name, surname, age, height, weight);
        }

    }

}