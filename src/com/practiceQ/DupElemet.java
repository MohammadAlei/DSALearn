package com.practiceQ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DupElemet {
    public static void main(String[] args) {
        // using Set 
        int arr[] = {2 ,9,9, 2 , 3 , 8, 8, 8,9,4 ,4};
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    s.add(arr[i]);
                    break;
                }                
            }
        }

        for (Integer o : s) {
            System.out.print(o + " ");
        }

        //using hashmap 
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                // System.out.println("hm.get(arr[i] : " + hm.get(arr[i]));
                hm.put(arr[i], 2);
            } else {
                hm.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer , Integer> entry : hm.entrySet()){
            if (entry.getValue()!= null && entry.getValue() > 1 ) {
                System.out.println( entry.getKey());

            }
        }
// print using stream
        hm.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> System.out.println(entry.getKey()));

        Set<Integer> distinct = new HashSet<>();
        Set<Integer> dup = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!distinct.contains(arr[i])) {
                distinct.add(arr[i]);
            } else {
                dup.add(arr[i]);
            }
        }
        System.out.println("-----------");
        for (Integer o : dup) {
            System.out.print(o + " ");
        }
    }
}
