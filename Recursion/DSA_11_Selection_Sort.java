package Recursion;

import java.util.Arrays;

public class DSA_11_Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 9, 4, 0};
        selectionSort(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }else {
            int maxValue = maxValue(arr, index);
            arr[arr.length-index -1] = arr[maxValue];
            selectionSort(arr, index+1);
        }
    }

    static int maxValue(int[] arr, int index) {
        int maxVlaue = 0;
        for (int i = 0; i < arr.length - index -1; i++) {
            if (arr[maxVlaue] < arr[i] ) {
                maxVlaue = i;
            }
        }
        return maxVlaue;
    }
}
