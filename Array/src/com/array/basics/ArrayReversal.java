package com.array.basics;

/*
 * Reverse an integer array, doing in place reversal with loop or recursion.
 * Other options are - using additional array or stack
 */
public class ArrayReversal {
    private static void reverseArray(int[] inputArr) {
        int size = inputArr.length;
        // inplace reversal that would modify original array
        for (int i = 0; i < size / 2; i++) {
            int element = inputArr[size - i - 1];
            inputArr[size - i - 1] = inputArr[i];
            inputArr[i] = element;
        }
    }

    private static void reverseArrayUsingRecursion(int[] inputArr, int start, int end) {
        if (start > end)
            return;
        int element = inputArr[end];
        inputArr[end] = inputArr[start];
        inputArr[start] = element;
        reverseArrayUsingRecursion(inputArr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reverseArray(arr);
        Util.printArrayElements(arr);
        // this step reverse array again that make array as in initial condition
        reverseArrayUsingRecursion(arr, 0, arr.length - 1);
        Util.printArrayElements(arr);
    }
}
