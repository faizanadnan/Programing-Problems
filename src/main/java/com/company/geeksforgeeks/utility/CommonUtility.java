package com.company.geeksforgeeks.utility;

public class CommonUtility {
    public static String calculateBinary(int x, String binary) {
        if (x <= 1) {
            return x + binary;
        }
        return calculateBinary(x / 2, x % 2 + binary);
    }


    public static void printMatrix(int mat[][], int R, int C) {
        int i, j;
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void swap(int[] arr, int i1, int i) {
        int temp = arr[i1];
        arr[i1] = arr[i];
        arr[i] = temp;
    }


    public static int countSetBit(int n, int count) {
        if (n <= 0) return count;
        if (n%2 == 1) count++;
        return countSetBit(n/2, count);
    }
}
