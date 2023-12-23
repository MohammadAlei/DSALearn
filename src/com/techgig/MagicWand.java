package com.techgig;

import java.util.Arrays;
        import java.util.Scanner;

import java.util.Scanner;

public class MagicWand {
    public static int[] calculateCost(int[] arr, int[] queries) {
        int n = arr.length;
        int m = queries.length;
        int[] costs = new int[m];

        int maxNum = arr[0];

        for (int i = 1; i < n; i++) {
            maxNum = Math.max(maxNum, arr[i]);
        }

        for (int i = 0; i < m; i++) {
            int query = queries[i];
            int cost = 0;

            for (int j = 0; j < n; j++) {
                cost += Math.abs(arr[j] - query);
            }

            costs[i] = cost;
        }

        return costs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] queries = new int[M];
        for (int i = 0; i < M; i++) {
            queries[i] = scanner.nextInt();
        }

        // Calculate the costs
        int[] costs = calculateCost(arr, queries);

        // Print the costs
        for (int cost : costs) {
            System.out.print(cost + " ");
        }
    }
}
