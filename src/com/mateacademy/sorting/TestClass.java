package com.mateacademy.sorting;

public class TestClass {

    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        sorting.initArray(sorting.getArray());
        System.out.println("Output massive.");
        sorting.printArray(sorting.getArray());
        Sorting.bubbleSort(sorting.getArray());
        System.out.println("Use bubble sorting.");
        sorting.printArray(sorting.getArray());

        sorting.initArray(sorting.getArray());
        System.out.println("Output massive.");
        sorting.printArray(sorting.getArray());
        Sorting.selectionSort(sorting.getArray());
        System.out.println("Use selection sorting.");
        sorting.printArray(sorting.getArray());

        sorting.initArray(sorting.getArray());
        System.out.println("Output massive.");
        sorting.printArray(sorting.getArray());
        Sorting.quickSort(sorting.getArray(),0,9);
        System.out.println("Use quick sorting.");
        sorting.printArray(sorting.getArray());

        sorting.initArray(sorting.getArray());
        System.out.println("Output massive.");
        sorting.printArray(sorting.getArray());
        Sorting.insertionSort(sorting.getArray());
        System.out.println("Use insertion sort.");
        sorting.printArray(sorting.getArray());

        sorting.initArray(sorting.getArray());
        System.out.println("Output massive.");
        sorting.printArray(sorting.getArray());
        Sorting.shuttleSort(sorting.getArray());
        System.out.println("Use shuttle sorting.");
        sorting.printArray(sorting.getArray());
    }
}
