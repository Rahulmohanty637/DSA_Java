package Recursion;

import java.util.Arrays;

public class DSA_12_Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 9, 4, 0};
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length-1)));
    }

    static int[] mergeSort(int[] arr, int start, int end) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = start + (end - start) / 2;
        int[] left = mergeSort(arr, start, mid);
        int[] right = mergeSort(arr, mid, arr.length-1);

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mergedArray = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mergedArray[k] = first[i];
                i++;
            } else {
                mergedArray[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            mergedArray[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mergedArray[k] = second[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
