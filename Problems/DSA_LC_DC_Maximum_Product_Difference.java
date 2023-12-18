package Problems;

import java.util.Arrays;

public class DSA_LC_DC_Maximum_Product_Difference {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
    }
}
