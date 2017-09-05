package com.timbuchalka.arrays;

import java.util.Scanner;

/**
 * Section 9, Lecture 53
 */
public class SortArrayDescending {
    public static int[] getIntegers(int arrayLength) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " integer values.\r");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " of array has value: " + array[i]);
        }

    }

    public static int[] sortIntegers(int[] array) {
        int arrayLength = array.length;
        int temp;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < arrayLength - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
}
