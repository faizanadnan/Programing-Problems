package com.company.geeksforgeeks.algo;

import java.util.Arrays;

public class QuickSort {


    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int middle = partition(arr, start, end);
            quickSort(arr, start, middle - 1);
            quickSort(arr, middle + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int i = start - 1;
        int pivot = arr[end];
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 4, 3, 5, 5};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
