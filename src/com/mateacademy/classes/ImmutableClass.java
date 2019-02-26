package com.mateacademy.classes;

public final class ImmutableClass {
    private String name;
    private int age;

    ImmutableClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
