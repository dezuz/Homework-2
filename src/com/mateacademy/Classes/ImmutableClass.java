package com.mateacademy.Classes;

public final class ImmutableClass {
    private String name;
    private int age;

    ImmutableClass(String name, int age) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
