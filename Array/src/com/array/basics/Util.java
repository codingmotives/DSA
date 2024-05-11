package com.array.basics;

import java.util.Arrays;

public class Util {

    private Util()
    {

    }
    public static void printArrayElements(int[] arr) {
        Arrays.stream(arr).forEach(element -> System.out.print(element + "\t"));
        System.out.println();
    }
}
