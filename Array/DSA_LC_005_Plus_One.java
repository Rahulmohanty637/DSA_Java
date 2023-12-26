package Array;

import java.util.Arrays;

public class DSA_LC_005_Plus_One {
    public static int[] plusOne(int[] digits) {
        int res=0;
        for(int i = 0; i < digits.length; i++) {
            res = res*10 + digits[i];
        }
        res++;
        String temp = Integer.toString(res);
        int [] arr = new int[digits.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = temp.charAt(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int [] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }
}
