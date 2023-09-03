package Sorting;

public class DS_Missing_Number {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{9,6,4,2,3,5,7,0,1};
        int num = missingNumber(arr);
        System.out.println((num));
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] == arr.length) {
                i++;
                continue;
            }
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }
}
