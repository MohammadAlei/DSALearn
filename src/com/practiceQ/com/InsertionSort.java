package com;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 10, 0, 2, 20, 30, 1, 90, 40, 50, 2};
        for (int i = 1; i < arr.length+1; i++) {
            int k = i-1;
            for (int j = i - 1; j >= 0; j--) {
                if ( arr[j] > arr[k]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                    k--;
                }
            }
            printArray( arr);

        }
        printArray( arr);

    }

    public static void printArray(int arr[]) {
        String result1 = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(result1);
    }
}
