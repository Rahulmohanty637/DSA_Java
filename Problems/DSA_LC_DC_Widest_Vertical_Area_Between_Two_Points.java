package Problems;

import java.util.Arrays;

public class DSA_LC_DC_Widest_Vertical_Area_Between_Two_Points {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] arr = new int[points.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        int minDiff = 0;
        for (int i = 1; i < arr.length; i++) {
            int dif = arr[i] - arr[i - 1];
            if (minDiff < dif) {
                minDiff = dif;
            }
        }
        return minDiff;
    }
}
