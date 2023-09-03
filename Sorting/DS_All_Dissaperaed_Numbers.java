package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class DS_All_Dissaperaed_Numbers {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{4,2,3,5,7,0,1,2,5,3};
        ArrayList<Integer> list = dissapearedNumbers(arr);
        System.out.println(list);
    }
    public static ArrayList<Integer> dissapearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] == arr.length) {
                i++;
                continue;
            }
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
//        int [] nums = new int[arr.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                list.add(j);
            }
        }
        return list;
    }
}
