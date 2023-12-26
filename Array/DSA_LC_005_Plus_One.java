package Array;

import java.util.Arrays;

public class DSA_LC_005_Plus_One {
    public static int[] plusOne(int[] digits) {
//        int res=0;
//        for(int i = 0; i < digits.length; i++) {
//            res = res*10 + digits[i];
//        }
//        res++;
//        System.out.println(res);
//        String temp = Integer.toString(res);
//        System.out.println(temp);
//        int [] arr = new int[temp.length()];
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(temp.charAt(i));
//            arr[i] = temp.charAt(i) - '0';
//            System.out.println(arr[i]);
//        }
//
//        return arr;


        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,2,1,0};
        int [] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }
}
