package Problems;

import java.util.Arrays;

public class DSA_Rearrange_the_Array_II {
    public static void main(String[] args) {
        int [] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        segregateElements(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void segregateElements(int arr[], int n)
    {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] >= 0) {
                i++;
            }
            if (arr[j] < 0) {
                j--;
            }
            if (arr[i] < 0 && arr[j] >= 0) {
                swapElements(arr, i, j);
                i++;
                j--;
            }
        }
    }
    public static void swapElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
