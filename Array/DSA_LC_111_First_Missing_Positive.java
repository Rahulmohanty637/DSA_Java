package Array;

//Given an unsorted integer array nums, return the smallest missing positive integer.
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

public class DSA_LC_111_First_Missing_Positive {
    public static void main(String[] args) {
        int [] nums = {7,8,9,11,12};
        int res = firstMissingPositive(nums);
        System.out.println(res);
    }

    public static int firstMissingPositive(int[] nums) {
        int i =0;
        while(i<nums.length){
            if(nums[i]<=nums.length && nums[i]>0 && i != nums[i]-1){
                if(nums[i] == nums[nums[i]-1]){
                    i++;
                }else{
                    int temp = nums[i];
                    nums[i] = nums[temp-1];
                    nums[temp-1] = temp;
                }

            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length ; j++){
            if(j != nums[j]-1){
                return j+1;
            }
        }
        return nums.length+1;
    }
}
