package Array;

public class DSA_LC_022_Continuous_SubarraY_Sum {

    public static boolean checkSubarraySum(int[] nums, int l) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                    sum += nums[k];
                }
                System.out.println();
                if (sum % l == 0) {
                    System.out.println(sum);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {23,2,6,4,7};
        System.out.println(checkSubarraySum(arr, 6));
    }
}
