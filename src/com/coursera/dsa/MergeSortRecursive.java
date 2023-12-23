package com.coursera.dsa;

public class MergeSortRecursive {
    public static void main(String[] args) {
   int[] a1 = {3, 9, 89, 2, 4, 8, 45, 1, 0};
        //int a1[] = {4,3,2,1};
        int[] aux = new int[a1.length];
        sortArray(a1, aux, 0, a1.length - 1);
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
    }

    private static void sortArray(int arr[], int aux[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;

        sortArray(arr, aux, low, mid);
        sortArray(arr, aux, mid + 1, high);
        mergesort(arr, aux, low, high,mid);
    }

    private static void mergesort(int[] arr, int[] aux, int low, int high, int mid) {
        for (int i = low; i <= high; i++) {
            aux[i] = arr[i];
        }
        int i= low,j=mid+1;
        for (int k = low; k <= high; k++) {
             if (i>mid) {
                arr[k]=aux[j++];

            } else if (j>high) {
                arr[k]=aux[i++];

            }else if (aux[i]<aux[j]){
                arr[k]=aux[i++];
            } else  {
                arr[k]=aux[j++];
            }
        }

    }
}
