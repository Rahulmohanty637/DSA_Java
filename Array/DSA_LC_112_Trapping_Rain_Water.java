package Array;

import java.util.Arrays;

public class DSA_LC_112_Trapping_Rain_Water {
    public static int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (max < height[i]) {
                max = height[i];
            }
            left[i] = max;
        }
        max = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            if (max < height[i]) {
                max = height[i];
            }
            right[i] = max;
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        int trapped = 0;
        for (int i = 0; i < height.length; i++){
            trapped += Math.min(left[i], right[i]) - height[i];
        }
        return trapped;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 0, 1, 3, 2};
        System.out.println(trap(arr));
    }
}
