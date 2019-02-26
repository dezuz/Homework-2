package com.mateacademy.Classes;

public class AnonymousInnerClass {
    static AnonymousClass anonymousClass = new AnonymousClass() {
        public void message() {
            super.message();
            System.out.println("Anonymous inner class method");
        }
    };

    public static void main(String[] args) {
        anonymousClass.message();
    }
}

class AnonymousClass {
    public void message() {
        System.out.println("Superclass method");
    }
}