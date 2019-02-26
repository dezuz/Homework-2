package com.mateacademy.Classes;

import com.mateacademy.Builder.*;

public class TestClass {

    public static void main(String[] args) {
        NestedInnerClass.Inner nestedInnerClass = new NestedInnerClass().new Inner();
        StaticNestedClass.Inner staticNestedClass = new StaticNestedClass.Inner();
        MethodLocalInnerClass methodLocalInnerClass = new MethodLocalInnerClass();
        ImmutableClass immutableClass = new ImmutableClass("John", 43);

        System.out.println(immutableClass.getName());

        nestedInnerClass.getAge();
        staticNestedClass.message();
        methodLocalInnerClass.message();
    }
}
