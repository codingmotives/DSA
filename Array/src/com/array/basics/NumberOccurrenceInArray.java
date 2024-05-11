package com.array.basics;

/*
 * Find number of occurrence of element in a sorted array
 * Use binary search to find first and last occurrence of element
 * and count numbers
 */
public class NumberOccurrenceInArray {

    private static int firstOccurrenceIndex(int[] arr, int element) {
        if (arr == null || arr.length == 0)
            return -1;
        int start = 0, end = arr.length - 1;
        if (start == end)
            return (element == arr[start]) ? start : -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == 0) {
                return (element == arr[mid]) ? 0 : -1;
            }
            if (element == arr[mid] && arr[mid - 1] < arr[mid])
                return mid;

            if (arr[mid] < element)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    private static int lastOccurrenceIndex(int[] arr, int element) {
        if (arr == null || arr.length == 0)
            return -1;
        int start = 0, end = arr.length - 1;
        if (start == end)
            return (element == arr[end]) ? end : -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == arr.length - 1) {
                return (element == arr[mid]) ? arr.length-1 : -1;
            }
            if (element == arr[mid] && arr[mid + 1] > arr[mid])
                return mid;

            if (arr[mid] > element)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    private static void elementTotalOccurrences(int[] arr, int element) {
        int firstOccurrenceIndex = firstOccurrenceIndex(arr, element);
        if (firstOccurrenceIndex == -1) {
            System.out.println("element not present");
            return;
        }
        int lastOccurrenceIndex = lastOccurrenceIndex(arr, element);
        System.out.println("first index: " + firstOccurrenceIndex);
        System.out.println("last index: " + lastOccurrenceIndex);
        System.out.println("total occurrence: " + (lastOccurrenceIndex - firstOccurrenceIndex + 1));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        elementTotalOccurrences(arr,8);
    }
}
