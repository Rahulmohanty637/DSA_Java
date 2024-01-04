package Problems;

import java.util.Arrays;

public class DSA_LC_DC_Minimum_Number_of_Operations_to_Make_Array_Empty {
    public static int minOperations(int[] nums) {
        int op = 0;
        int freq = 0;
        int ans = 0;
        int[] arr = null;
        int j = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                freq++;
            } else {
                arr[j] = freq;
                j++;
                freq = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - 1) % 3 == 0) {
                ans += 2;
                ans += (arr[i] - 4) / 3;
            } else if ((arr[i] - 2) % 3 == 0) {
                ans += 1;
                ans += (arr[i] - 2) / 3;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {16, 19, 31, 8, 10};
        System.out.println(minOperations(nums));
    }
}
