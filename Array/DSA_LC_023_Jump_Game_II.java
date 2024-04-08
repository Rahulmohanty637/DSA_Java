package Array;

public class DSA_LC_023_Jump_Game_II {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4,5,1,5,8,3,5};
        System.out.println(jump(arr));
    }

    public static int jump(int[] nums) {
//        int cnt = 0;
//        int i = 0;
//        int n = nums.length;
//
//        if (n == 2) {
//            return 1;
//        }
//
//        while (i < n) {
//            if (i + nums[i] >= n - 1) {
//                return cnt;
//            } else {
//                i += nums[i];
//                cnt++;
//            }
//        }
//        return cnt;


        int n = nums.length;
        if (n <= 1) return 0; // If the array length is less than or equal to 1, no jump is needed

        int count = 0; // Count of jumps
        int left = 0, right = 0; // Window boundaries
        int mxIdx = nums[0]; // Farthest index reachable from the current window

        while (left < n) {
            left = right + 1; // Move to the next window
            right = Math.min(mxIdx, n - 1); // Define the next window
            count++; // Increment count for the jump taken to reach this window

            if (right >= n - 1) {
                return count; // If we've reached the last index, return count
            }

            // Find the farthest index we can reach within the current window
            while (left <= right) {
                mxIdx = Math.min(Math.max(mxIdx, left + nums[left]), n - 1);
                left++;
            }
        }
        return count;
    }
}
