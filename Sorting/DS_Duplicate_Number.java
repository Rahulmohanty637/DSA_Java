package Sorting;

public class DS_Duplicate_Number {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{3, 1, 3, 4, 2};
        int num = duplicateNumber(arr);
        System.out.println((num));
    }

    public static int duplicateNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == arr.length) {
                i++;
                continue;
            }
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }
        return arr.length;
    }
}
