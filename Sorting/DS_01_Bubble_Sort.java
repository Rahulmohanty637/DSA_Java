package Sorting;

import java.util.Arrays;

public class DS_01_Bubble_Sort {
    public static void main(String[] args) {
        int [] arr;
        arr = new int[]{7, 3, 5, 14, 19, 11, 2};
        int [] num = bubbleSort(arr);
        System.out.println(Arrays.toString(num));
        for (int ar : num) {
            System.out.println(ar);
        }
    }
    public static int[] bubbleSort(int [] arr){
        boolean swapped;
        int temp;
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            for (int j = 1; j < arr.length - i; j++){
                if (arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return arr;
    }
}
