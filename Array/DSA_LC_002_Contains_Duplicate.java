package Array;

import java.util.Arrays;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class DSA_LC_002_Contains_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }

    public static boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        if ((arr.length == 1) || ((arr.length == 2) && (arr[0] != arr[1]))) {
            return false;
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != j + 1 && arr[j] == arr[j - 1]) {
                return true;
            }
        }
        return false;
    }
}
