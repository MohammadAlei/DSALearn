package com.practiceQ;

public class QuickSort {
    public static void main(String[] args) {
        // int[] arr = {10,0, 2,20, 30,1, 90, 40, 50,-1};
        // int[] arr = {-1, 0, 1, 2, 10, 20, 30, 40, 50, 90};
        int[] arr = {90, 50, 40, 30, 20, 10, 2, 1, 0, -1};


        // Print the elements of the array
        System.out.println("Integer Array:");
        for (int number : arr) {
            System.out.print(" " + number);
        }
        System.out.println("before : ");

        // int pivotNum = arr[arr.length - 1] ;
        sortArr(arr, 0, arr.length-1);
        System.out.println("after : ");

        for (int number : arr) {
            System.out.print(" " + number);
        }
    }
    private static void sortArr(int []arr,int low , int high){
        if (low < high) {
            int partitionIndex = partitioning(arr,low , high);
            if (partitionIndex > low) {
                sortArr(arr, low, partitionIndex - 1);
            }
            if (partitionIndex < high) {
                sortArr(arr, partitionIndex + 1, high);
            }

        }
    }
    private static int partitioning(int[] arr, int low, int high) {
        int i = low -1;
        int pivot = arr[high];

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // System.out.println("arr[${i}} : `${arr[i]}`  ; arr[`${j}`} : `${arr[j]}`"+ i + " : j : " + j);
                System.out.println("arr[" + i + "] : " + arr[i] + " ; arr[" + j + "] : " + arr[j] + " ; i : " + i + " ; j : " + j);
                int temp = arr[i];
                arr[i]=  arr[j];
                arr[j] = temp;
                for (int number : arr) {
                    System.out.print(" " + number);
                }
                System.out.println("pivot : "+ pivot);
            }            
        }
          // Swap the pivot element with the element at i + 1
          int temp = arr[i + 1];
          arr[i + 1] = arr[high];
          arr[high] = temp;
  
          // Print debug information
          System.out.println("Pivot placed at index " + (i + 1) + ": " + arr[i + 1]);
  
          return i + 1; // Return the partition index
    }

}
