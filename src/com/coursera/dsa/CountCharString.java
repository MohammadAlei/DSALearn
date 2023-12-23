package com.coursera.dsa;

import java.util.*;

public class CountCharString {
    public static void main(String[] args) {
        String s = "shehnaz";
        Map<Character, Integer> h1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (h1.containsKey(s.charAt(i))) {
                h1.put(s.charAt(i), h1.get(s.charAt(i)) + 1);
                System.out.println(s.charAt(i));
            } else {
                h1.put(s.charAt(i), 1);
            }
        }
        //System.out.println(h1);
    }
}
