package Sorting;

import java.util.Arrays;

//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
// You are given an integer array nums representing the data status of this set after the error.
// Find the number that occurs twice and the number that is missing and return them in the form of an array.
public class DS_Set_Mismatch {
    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == arr.length) {
                i++;
                continue;
            }
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[]{arr[j],j};
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{3, 1, 3, 4, 2};
        int[] num = findErrorNums(arr);
        System.out.println(Arrays.toString(num));
    }
}
