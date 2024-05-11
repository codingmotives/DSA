package com.array.basics;

public class BinarySearch {

    /*
     * Assuming array is sorted already
     */
    private static boolean searchElement(int[] arr, int element) {
        int start = 0, end = arr.length, mid;
        boolean elementFound = false;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == element) {
                elementFound = true;
                break;
            } else if (element < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return elementFound;
    }

    private static boolean binarySearchRecursive(int[] arr, int element, int start, int end) {
        if (start > end)
            return false;
        int mid = start + (end - start) / 2;
        if (arr[mid] == element)
            return true;
        return element < arr[mid] ? binarySearchRecursive(arr, element, start, mid - 1) :
                binarySearchRecursive(arr, element, mid + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 8, 9, 11, 15};
        System.out.println("element found: " + searchElement(arr, 8));
        System.out.println("element found: " + searchElement(arr, 4));
        System.out.println("element found: " + searchElement(arr, 14));
        System.out.println("element found recursively: " + binarySearchRecursive(arr, 8, 0, arr.length - 1));
        System.out.println("element found recursively: " + binarySearchRecursive(arr, 4, 0, arr.length - 1));
        System.out.println("element found recursively: " + binarySearchRecursive(arr, 14, 0, arr.length - 1));
    }
}
