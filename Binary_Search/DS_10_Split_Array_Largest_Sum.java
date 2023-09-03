package Binary_Search;
//Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
//        Return the minimized largest sum of the split.
//        A subarray is a contiguous part of the array.


public class DS_10_Split_Array_Largest_Sum {
    public static int splitArray(int[] nums, int k) {
        int n = nums.length;
        int [] arr1 = new int [n];
        int [] arr2 = new int [n];
        int [] fin = new int [n];
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = 0; j <= i; j++){
                arr1[i] += nums[j];
            }
            for (int m = i+1; m < nums.length; m++){
                arr2[i] += nums[m];
            }
        }

        for (int i = 0; i < arr1.length; i++){
            if(arr1[i] < arr2[i]){
                fin[i] = arr2[i];
            }
            else{
                fin[i] = arr1[i];
            }
        }

        int min = fin[0];
        for (int i = 1; fin[i] != 0; i++){
            if (min > fin[i]){
                min = fin[i];
            }
        }
        if (k == nums.length){
            int max = nums[0];
            for (int i = 1; i < nums.length; i++){
                if (max < nums[i]){
                    max = nums[i];
                }
            }
            return max;
        }
        if (k == 1){
            int sum = 0;
            for (int i = 0; i < nums.length; i++){
                sum += nums[i];
            }
            return sum;
        }
        return min;
    }

    public static void main(String[] args) {
        int [] nums = {7,2,5,10,8};
        int sals = splitArray(nums,2);
        System.out.println(sals);
    }
}
