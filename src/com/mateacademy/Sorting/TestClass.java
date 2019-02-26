package com.mateacademy.Sorting;

public class TestClass {

    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        sorting.initArray();
        System.out.println("Output massive.");
        sorting.printArray();
        Sorting.bubbleSort();
        System.out.println("Use bubble sorting.");
        sorting.printArray();

        sorting.initArray();
        System.out.println("Output massive.");
        sorting.printArray();
        sorting.selectionSort();
        System.out.println("Use selection sorting.");
        sorting.printArray();

        sorting.initArray();
        System.out.println("Output massive.");
        sorting.printArray();
        sorting.quickSort(0,9);
        System.out.println("Use quick sorting.");
        sorting.printArray();

        sorting.initArray();
        System.out.println("Output massive.");
        sorting.printArray();
        sorting.insertionSort();
        System.out.println("Use insertion sort.");
        sorting.printArray();

        sorting.initArray();
        System.out.println("Output massive.");
        sorting.printArray();
        sorting.shuttleSort();
        System.out.println("Use shuttle sorting.");
        sorting.printArray();
    }
}
