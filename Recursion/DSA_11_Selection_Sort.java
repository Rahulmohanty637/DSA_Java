package Recursion;

import java.util.Arrays;

public class DSA_11_Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 9, 4, 0};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

//    static void selectionSort(int[] arr, int index) {
//        if (index == arr.length) {
//            return;
//        } else {
//            int maxValue = maxValue(arr, index);
//            swapElement(arr, maxValue, arr.length - index - 1);
//            selectionSort(arr, index + 1);
//        }
//    }
//
//    static int maxValue(int[] arr, int index) {
//        int maxVlaue = 0;
//        for (int i = 0; i < arr.length - index - 1; i++) {
//            if (arr[maxVlaue] < arr[i]) {
//                maxVlaue = i;
//            }
//        }
//        return maxVlaue;
//    }
//
//    public static void swapElement(int[] arr, int max, int last) {
//        int temp = arr[max];
//        arr[max] = arr[last];
//        arr[last] = temp;
//    }

    public static void selectionSort(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[max] < arr[col]) {
                selectionSort(arr, row, col + 1, col);
            } else {
                selectionSort(arr, row, col + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            selectionSort(arr,row-1, 0, 0);
        }
    }
}
