package com.practiceQ;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JavaUtil {
    public static void printArray(int arr[]) {
        String result1 = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(result1);
    }
}
