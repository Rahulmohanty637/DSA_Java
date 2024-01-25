package Array;

import java.util.Arrays;

public class DSA_LC_019_Rearrange_Array_Elements_by_Sign {
    public static int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int j = 0;
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                arr[j] = nums[i];
                j += 2;
            } else {
                arr[k] = nums[i];
                k += 2;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] nums = rearrangeArray(arr);
        System.out.println(Arrays.toString(nums));
    }
}
