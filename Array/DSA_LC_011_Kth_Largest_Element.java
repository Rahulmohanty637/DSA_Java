package Array;

public class DSA_LC_011_Kth_Largest_Element {
    public static void main(String[] args) {

    }

    public static int findKthLargest(int[] nums, int k) {
        int val = 0;
        for (int i = nums.length; i > nums.length - k; i--) {
            val = findMaxElement(nums, i);
            swapElement(nums, val, i - 1);
            i++;
        }
        return nums[val];
    }

    public static void swapElement(int[] nums, int val, int i) {
        int temp = nums[val];
        nums[val] = nums[i];
        nums[i] = temp;
    }

    public static int findMaxElement(int[] nums, int end) {
        int max = nums[0];
        int maxIndex = 0;
        for (int i = 1; i < end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
