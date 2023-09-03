package Sorting;

import java.util.Arrays;

public class DS_02_Selection_Sort {
    public static int [] selectionSort (int [] arr){
        for (int i = 0; i < arr.length; i++){
            int last = arr.length - i -1;
            int max = maxElement(arr, 0, last);
            swapElement(arr, max, last);
        }
        return arr;
    }
    public static int maxElement(int [] arr, int start, int last){
        int max = start;
        for (int i = start; i <= last; i++){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swapElement(int [] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
    public static void main(String[] args) {
        int [] arr;
        arr = new int[]{7, 3, 5, 14, 19, 11, 2};
        int [] num = selectionSort(arr);
        System.out.println(Arrays.toString(num));
    }
}
