package Problems.Array;

public class DSA_LC_013_House_Robber {
    public static int rob(int[] nums) {
        int odd = 0;
        int eve = 0;
        for (int i = 0; i < nums.length; i += 2) {
            odd += nums[i];
        }
        for (int i = 1; i < nums.length; i += 2) {
            System.out.println(eve);
            eve += nums[i];
        }
//        System.out.println(eve);
//        System.out.println(odd);
        if (odd < eve) {
            return eve;
        } else {
            return odd;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(rob(arr));
    }
}
