package com.mateacademy.Classes;

public class MethodLocalInnerClass {
    final int x = 100;

    public void message() {
        System.out.println("I am an outer class method");
        class Inner {
            public void message() {
                System.out.println("I am an inner class method, i can use only final fields, for example x is: " + x);
            }
        }
        Inner innerClass = new Inner();
        innerClass.message();
    }
}
