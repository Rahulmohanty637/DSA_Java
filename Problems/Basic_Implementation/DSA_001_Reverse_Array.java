package Problems.Basic_Implementation;

import java.util.Arrays;

// Given an array (or string), the task is to reverse the array/string.
public class DSA_001_Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 9, 0, 4};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    public static int[] reverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < (arr.length / 2); i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}
