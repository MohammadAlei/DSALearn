package com.coursera.dsa;

public class BinarySearch1 {
    public static void main(String[] args) {

        int val = findVal();
        System.out.println(val);
    }

    private static int findVal() {
        int []a1= {3,4,6,9,15};
        int s = 9;
        int start = 0;
        int end = a1.length-1;int mid = 0;
        while(start <= end){
            mid =start +((-start + end) /2);
            if (a1[mid] == s) {
                return mid;
            }else if (a1[mid] > s) {
                end = mid-1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
