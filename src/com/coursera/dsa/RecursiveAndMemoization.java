package com.coursera.dsa;

public class RecursiveAndMemoization {


    public static void main(String[] args) {
        int n = 4;
        int stor[] = new int[n+1];

        for (int i = 0; i < n+1; i++) {
            stor[i] = -1;
        }
//       int a =  FnR(n);
//        int b =  FnM(n ,stor);
//        System.out.println(a);

//        System.out.println(b);

        int c = fibD(n);
        System.out.println(c);
    }

    private static int fibD(int n) {
        int stor[] = new int[n+1];
        stor[0] = 0;
        stor[1] = 1;
        for (int i = 2; i < n+1 ; i++) {
            stor[i] = stor[i-1] + stor[i-2];
        }
        return stor[n] ;
    }

    private static int FnM(int n, int[] stor) {
        if (n == 0 || n ==1) {
            stor[n] = n;
        }
        if (stor[n] != -1) {
            return stor[n];
        }
        stor[n] = FnM(n - 1 ,stor) + FnM(n -2 ,stor);
        return stor[n];
    }

    private static int FnR(int n) {
        if (n == 1 || n ==0) {
            return n;
        }
        return FnR(n-1) + FnR(n-2) ;
    }
}
