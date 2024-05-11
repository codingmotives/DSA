package com.array.basics;

/*
 * Finding peak element that is not smaller than its neighbours
 */
public class PeakElementInArray {

    private static Integer findPeakElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        int lastIndex = arr.length - 1;
        if (lastIndex == 0) {
            return arr[lastIndex];
        }
        int peak = arr[0];

        for (int i = 1; i <= lastIndex - 1; i++) {
            if (arr[i] > peak && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peak = arr[i];
            }
        }

        if (arr[lastIndex] > peak && arr[lastIndex] > arr[lastIndex - 1]) {
            peak = arr[lastIndex];
        }
        return peak;
    }

    /*
     * Assuming array would be first strictly in increasing order
     * and then strictly in decreasing order. It would need log(n)
     * time and log(n) extra space for recursive stack
     */
    private static Integer findPeakElementRecursively(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0)
            return null;
        if (start == end)
            return arr[start];
        if (start == end - 1) {
            return Math.max(arr[end], arr[start]);
        }
        int mid = start + (end - start) / 2;
        return arr[mid + 1] < arr[mid] ? findPeakElementRecursively(arr, start, mid) :
                findPeakElementRecursively(arr, mid, end);
    }

    public static void main(String[] args) {
        // verify peak element in an array
        int[] arr = {10, 20, 15, 2, 23, 90, 67};
        Integer peakElement = findPeakElement(arr);
        System.out.println("peak element: " + peakElement);
        // peak element in an increasing sorted array
        arr = new int[]{10, 20, 30, 40, 50};
        peakElement = findPeakElement(arr);
        System.out.println("peak element: " + peakElement);
        // peak element in decreasing sorted array
        arr = new int[]{100, 80, 60, 50, 20};
        peakElement = findPeakElement(arr);
        System.out.println("peak element: " + peakElement);
        // verify peak element in an array
        arr = new int[]{1, 3, 20, 4, 1, 0};
        peakElement = findPeakElementRecursively(arr, 0, arr.length - 1);
        System.out.println("peak element found recursively: " + peakElement);
        // peak element in an increasing sorted array
        arr = new int[]{10, 20, 30, 40, 50};
        peakElement = findPeakElementRecursively(arr, 0, arr.length - 1);
        System.out.println("peak element found recursively: " + peakElement);
        // peak element in decreasing sorted array
        arr = new int[]{100, 80, 60, 50, 20};
        peakElement = findPeakElementRecursively(arr, 0, arr.length - 1);
        System.out.println("peak element found recursively: " + peakElement);
    }
}
