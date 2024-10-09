package com.practiceQ;

public class DiamondPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 3; j++) {                
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 3; i >0 ; i--) {
            for (int j = 0; j < 3-i+1; j++) {                
                System.out.print(" ");
            }
            for (int j = i*2-1; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}