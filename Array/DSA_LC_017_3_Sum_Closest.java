package Array;

import java.util.Arrays;

public class DSA_LC_017_3_Sum_Closest {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int k = 0; k < nums.length - 2; k++){
            int i = k + 1;
            int j = nums.length - 1;
            while (i < j){
                int sum = nums[k] + nums[i] + nums[j];
                if(Math.abs(target - sum) < Math.abs(target - res)){
                    res = sum;
                }
                if(sum < target){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return res;
    }
}
