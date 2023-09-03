package Binary_Search;

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

//        If target is not found in the array, return [-1, -1].

//        You must write an algorithm with O(log n) runtime complexity.

import java.util.Arrays;
import java.util.Scanner;

public class DS_03_First_And_Last_Position {
    public int[] searchRange(int[] nums, int target) {
        int [] arr = {-1 ,-1};
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = start + ((end - start)/2);
            if (nums.length == 1 && nums[0] != target){
                return arr;
            }
            if (target == nums[mid]){
                if (nums.length == 1){
                    arr[0] = 0;
                    arr[1] = 0;
                    return arr;
                }
                for (int i = mid; i >= 0; i--){
                    if (nums[i] == target){
                        arr[0] = i;
                    }
                }
                for (int j = mid; j < nums.length; j++){
                    if (nums[j] == target){
                        arr[1] = j;
                    }
                }
                return arr;
            }
            else if (target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        DS_03_First_And_Last_Position obj = new DS_03_First_And_Last_Position();
        Scanner sc = new Scanner(System.in);
        int [] num1 = {5,7,7,8,8,10};
        int target = sc.nextInt();
        int [] arr = obj.searchRange(num1,target);
        System.out.println(Arrays.toString(arr));
    }
}
