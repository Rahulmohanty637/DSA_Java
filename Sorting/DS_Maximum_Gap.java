package Sorting;

public class DS_Maximum_Gap {
    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public int maximumGap(int[] arr) {
        int gap = 0;
        int maxGap = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            gap = arr[i + 1] - arr[i];
            if (gap > maxGap) {
                maxGap = gap;
            }
        }
        return maxGap;
    }
}
