package com.practiceQ;

public class BubbleSort{
    public static void main(String[] args) {

        int a1[] = {1,312 ,67, 8 , 6, 3, 23,5};
 
        for (int i = 1; i < a1.length -1; i++) {
           for (int j = 0; j < a1.length -1; j++) {
            if(a1[j] > a1[j+1]) {
                a1[j] = a1[j] + a1[j+1] ;
                a1[j+1] = a1[j] - a1[j+1];
                a1[j] = a1[j] - a1[j+1];
            }
           }
           System.out.println("");
           for (int z : a1) {			
			System.out.print(z + " ");
		}
        }
        System.out.println("");

        for (int i : a1) {			
			System.out.print(i + " ");
		}
    }


}