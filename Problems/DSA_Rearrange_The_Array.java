package Problems;

import java.util.Arrays;

public class DSA_Rearrange_The_Array {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5,
                6, -7, 5, -3, 11};
        rearrangeArray(arr);
    }

    public static void rearrangeArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] < 0) {
                i++;
            }
            if (arr[j] >= 0) {
                j--;
            }
            if (arr[i] >= 0 && arr[j] < 0) {
                swapElements(arr, i, j);
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swapElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
