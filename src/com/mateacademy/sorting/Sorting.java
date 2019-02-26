package com.mateacademy.sorting;

public class Sorting {
    private static int ARRAY_LENGTH = 1_0;
    private static int[] array = new int[ARRAY_LENGTH];

    public int[] getArray() {
        return array;
    }
    public void initArray(int[] array) {

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array[i] = (int) (Math.random() * 1_0);
        }
    }

    public void printArray(int[] array) {

        for (int i = 0; i < ARRAY_LENGTH - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[ARRAY_LENGTH - 1]);
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static int[] bubbleSort(int[] array) {
        boolean needIteration = true;

        while (needIteration) {
            needIteration = false;

            for (int i = 1; i < ARRAY_LENGTH; i++) {

                if (array[i] < array[i - 1]) {
                    swap(array,i, i - 1);
                    needIteration = true;
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        for (int left = 0; left < ARRAY_LENGTH; left++) {
            int minInd = left;
            for (int i = left; i < ARRAY_LENGTH; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        for (int left = 0; left < ARRAY_LENGTH; left++) {
            int value = array[left];
            int i = left - 1;

            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        return array;
    }

    public static int[] quickSort(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];
        do {
            while (array[leftMarker] < pivot) {
                leftMarker++;
            }
            while (array[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(array, leftBorder, rightMarker);
        }
        return array;
    }

    public static int[] shuttleSort(int[] array) {
        for (int i = 1; i < ARRAY_LENGTH; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                        swap(array, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
        return array;
    }
}
