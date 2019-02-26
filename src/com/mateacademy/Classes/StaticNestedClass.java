package com.mateacademy.Classes;

public class StaticNestedClass {

    static class Inner {
        public void message() {
            System.out.println("Unfortunately, I am just outer class member");
        }
    }
}
