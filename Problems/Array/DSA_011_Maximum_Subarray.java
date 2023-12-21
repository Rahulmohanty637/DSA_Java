package Problems.Array;

public class DSA_011_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        
        // Brute Force
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         // for(int k = i; k <= j; k++){
        //             sum += nums[j];
        //         // }
        //         max = Math.max(sum, max);
        //     }
        // }

        //Optimal Solution
        if (nums.length == 1) {
            return nums[0];
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
