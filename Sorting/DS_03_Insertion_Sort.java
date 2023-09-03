package Sorting;

import java.util.Arrays;

public class DS_03_Insertion_Sort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else {
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr;
        arr = new int[]{7, 3, 5, 14, 19, 11, 2};
        int [] num = insertionSort(arr);
        System.out.println(Arrays.toString(num));
    }
}
