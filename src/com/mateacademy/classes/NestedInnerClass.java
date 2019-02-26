package com.mateacademy.classes;

public class NestedInnerClass {
    private int age = 17;

    class Inner {
        public int getAge() {
            System.out.println("I have access to outer class private field");
            return age;
        }
    }
}
