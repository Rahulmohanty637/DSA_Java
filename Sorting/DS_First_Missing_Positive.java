package Sorting;

import java.util.Arrays;

public class DS_First_Missing_Positive {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{3,4,-1,1};
        int num = firstMissingPositive(arr);
        System.out.println(num);
    }
    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == arr.length) {
                i++;
                continue;
            }
            int correct = arr[i];
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        for (int j = 1; j < arr.length;) {
            if (arr[j] != j+1 && j > 0) {
                return j+1;
            }
        }
        return arr.length;
    }
}
