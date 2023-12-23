package com.coursera.dsa;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        int arr1[] = {2, 90, 80, 76, 46, 52};
        for(int element : arr1)
            System.out.println(element);

        System.out.println("----------------------------------------");
        selectionSort2(arr1);
        for(int element : arr1)
        System.out.println(element);
    }

    private static void selectionSort2(int[] a) {
        for (int i = 0; i < a.length -1; i++) {
            int min =a[i];
            int minIndex = i;
            for (int j = i+1; j < a.length ; j++) {
                if (min >a[j]) {
                    min = a[j];
                    minIndex = j;
                }
            }
            a[minIndex] = a[i];
            a[i] = min;
        }
    }


    private static int[] selectionSort(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr1[j] < arr1[j - 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j - 1];
                    arr1[j - 1] = temp;
                } else
                    break;
            }
        }
        return arr1;
    }
    private static int[] selectionSort1(int[] arr) {
        for (int i = 0; i < arr.length -1 ; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i+1; j < arr.length; j++) {

                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                    min = arr[j];
                }
            }

            arr[minIndex] = arr[i];
            arr[i]=min;

        }
        return arr;
    }
}
