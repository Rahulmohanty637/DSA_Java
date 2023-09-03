package Problems.Array;

import java.util.Arrays;

public class DSA_000_Max_and_Min {

    public static int[] getMinAndmax(int[] nums) {
        Arrays.sort(nums);
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        int[] res = new int[2];
        res = getMinAndmax(arr);
        System.out.println(res[0] + " " + res[1]);

    }
}
