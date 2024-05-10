package com.temp.basics;

/*
 * Reverse an integer array, doing in place reversal with loop or recursion.
 * Other options are - using additional array or stack
 */
public class ArrayReversal {
    public int[] reverseArray(int[] inputArr) {
        int size = inputArr.length;
        // inplace reversal that would modify original array
        for (int i = 0; i < size / 2; i++) {
            int element = inputArr[size - i - 1];
            inputArr[size - i - 1] = inputArr[i];
            inputArr[i] = element;
        }
        return inputArr;
    }

    public int[] reverseArrayUsingRecursion(int[] inputArr, int start, int end)
    {
        if(start>end)
            return inputArr;
        int element= inputArr[end];
        inputArr[end]= inputArr[start];
        inputArr[start]= element;
        return reverseArrayUsingRecursion(inputArr, start+1, end-1);
    }
}
