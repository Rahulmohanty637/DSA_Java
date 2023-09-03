package Sorting;

import java.util.ArrayList;

public class DS_All_Duplicate_Numbers {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        ArrayList<Integer> list = allDuplicateNumber(arr);
        System.out.println(list);
    }

    public static ArrayList<Integer> allDuplicateNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
//            if (arr[i] == arr.length) {
//                i++;
//                continue;
//            }
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                list.add(arr[j]);
            }
        }
        return list;
    }
}
