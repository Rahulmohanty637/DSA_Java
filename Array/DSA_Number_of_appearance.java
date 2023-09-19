package Array;

import java.util.Arrays;

public class DSA_Number_of_appearance {
    public static void main(String[] args) {
        int[] arr = {10, 13, 2, 10, 5, 10, 7, 10, 13, 25, 33, 10, 24, 10, 10};
        int[] num = {14, 2, 33, 26, 18};
        int res = checkAppeearance(num);
        if (res == -1) {
            System.out.println("There is no element that appeared n/2 times");
        } else {
            System.out.println("The element " + res + " appeared n/2 times");
        }

    }

    public static int checkAppeearance(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length / 2;
        int count = 1;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] == arr[i]) {
                count++;
            } else {
                if (count >= n) {
                    return arr[j];
                } else {
                    count = 1;
                    j = i;
                }
            }
        }
        return -1;
    }
}
