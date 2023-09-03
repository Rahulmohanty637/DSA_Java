package Sorting;

import java.util.Arrays;

public class DS_04_Cyclic_Sort {
    public static int[] cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{3, 5, 1, 4, 2};
        int[] num = cyclicSort(arr);
        System.out.println(Arrays.toString(num));
    }
}
