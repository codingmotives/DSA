package com.temp.basics;

public class BinarySearch {

    /*
     * Assuming array is sorted already
     */
    public boolean searchElement(int[] arr, int element) {
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
}
