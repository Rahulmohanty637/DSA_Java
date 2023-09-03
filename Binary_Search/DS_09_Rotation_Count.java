package Binary_Search;

public class DS_09_Rotation_Count {
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

    public static void main(String[] args) {
        int [] nums = {15, 18, 2, 3, 6, 12};
        int [] arr = {7, 9, 11, 12, 5};
        int rot_count = findPivot(arr);
        System.out.println(rot_count + 1);
    }
}
