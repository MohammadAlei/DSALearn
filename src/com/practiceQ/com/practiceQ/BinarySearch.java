package com.practiceQ;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 10, 20, 30, 40, 50};
        // Search for the element (change 20 to the desired value)
        int elementToFind = 20;
        int index = findElement(arr, elementToFind, 0, arr.length - 1);

        // Print the result
        if (index != -1) {
            System.out.println("Element found: " + elementToFind + " at index: " + index);
        } else {
            System.out.println("Element not found: " + elementToFind);
        }
    }

    private static int findElement(int[] arr, int target, int low, int high) {
        if (low <= high) { // Correct condition for the search
            int median = low + (high - low) / 2; // Calculate the median index

            // Check if the target is at the median
            if (arr[median] == target) {
                return median; // Element found
            } else if (arr[median] > target) {
                return findElement(arr, target, low, median - 1); // Search in the left subarray
            } else {
                return findElement(arr, target, median + 1, high); // Search in the right subarray
            }
        }
        return -1; // Element not found
    }
}
