package Array;

public class DSA_LC_023_Jump_Game_II {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4,5,1,5,8,3,5};
        System.out.println(jump(arr));
    }

    public static int jump(int[] nums) {
        int cnt = 0;
        int i = 0;
        int n = nums.length;

        if (n == 2) {
            return 1;
        }

        while (i < n) {
            if (i + nums[i] >= n - 1) {
                return cnt;
            } else {
                i += nums[i];
                cnt++;
            }
        }
        return cnt;
    }
}
