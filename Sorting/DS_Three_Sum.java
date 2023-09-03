package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DS_Three_Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> arr2 = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if ((nums[i] + nums[j] + nums[k]) == 0) {
                            arr2.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        }
                    }
                }
            }
            return arr2;
    }
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> list  = threeSum(arr);
        System.out.println(list);
    }

}


