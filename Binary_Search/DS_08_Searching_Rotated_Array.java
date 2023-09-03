package Binary_Search;

public class DS_08_Searching_Rotated_Array {
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int firsthalf = BinarySearch(nums, target, 0, pivot);
        if (firsthalf != -1){
            return firsthalf;
        }
        else{
            return BinarySearch(nums, target, pivot+1, nums.length - 1);
        }

    }
    static int findPivot(int [] nums){
        int start = 0;
        int end = nums.length - 1;
        if(end == 0){
            return end;
        }
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]){
                return mid-1;
            }
            if (start > nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }
    static int BinarySearch(int [] arr, int item, int start, int end){
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == item) {
                return mid;
            }
            if (item < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {1,3};
        int n = search(nums,0);
        System.out.println(n);
    }
}
