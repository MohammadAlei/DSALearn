package com.coursera.dsa;

public class Divide123 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countSteps(n));
        System.out.println(countStepsM(n));
        System.out.println(countStepsDP(n));

    }

    private static int countStepsDP(int n) {
        int storage[] = new int[n+1];
        for (int i = 2; i <= n ; i++) {
            
        }
    }



    private static int countStepsM(int n) {
        int storage[] = new int[n+1];
        return countStepsM(n, storage);
    }

    private static int countStepsM(int n, int[] storage) {
        if (n==1){
            storage[n] = 0;
            return storage[n];
        }
        int op1 = countSteps(n-1);
        int m = op1;
        if (n %3 == 0) {
            int op2 = countSteps(n/3);
            if (op2 < m) {
                m = op2;
            }
        }
        if (n %2 == 0) {
            int op2 = countSteps(n/2);
            if (op2 < m) {
                m = op2;
            }
        }
        storage[n] =  1 + m;
        return storage[n];
    }

    private static int countSteps(int n) {

        if (n == 1) {
            return 0;
        }
        int op1 = countSteps(n-1);
        int m = op1;
        if (n %3 == 0) {
            int op2 = countSteps(n/3);
            if (op2 < m) {
                m = op2;
            }
        }
        if (n %2 == 0) {
            int op2 = countSteps(n/2);
            if (op2 < m) {
                m = op2;
            }
        }
        return 1 + m;
    }
}
