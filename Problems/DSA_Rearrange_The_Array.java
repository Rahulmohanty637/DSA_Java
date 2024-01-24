package Problems;

public class DSA_Rearrange_The_Array {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5,
                6, -7, 5, -3, 11};

    }

    public static void rearrangeArray(int[] arr) {
        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[j] >= 0) {
                j++;
            }
            else {
                for (int k = j; k > i; k--) {
                    int temp = arr[k];
                    arr[k] = arr[k - 1];
                    arr[k - 1] = temp;
                }
                i++;
                j++;
            }
        }
    }
}
