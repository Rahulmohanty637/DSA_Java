package Binary_Search;
//A peak element is an element that is strictly greater than its neighbors.
//
//        Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
//
//        You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
//
//        You must write an algorithm that runs in O(log n) time.
public class DS_06_Finding_Peak_Element {
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end){
            mid = start + (end - start)/2;
            if (start == mid){
                if(nums[end] > nums[mid]){
                    return end;
                }
                else{
                    return mid;
                }

            }
            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if (nums[mid] > nums[mid-1]){
                start = mid + 1;
            }
            else {
                end = mid;
            }

        }
        return mid;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,5,6,4};
        int n = findPeakElement(arr);
        System.out.println(n);
    }
}
