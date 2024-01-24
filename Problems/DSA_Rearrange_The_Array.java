package Problems;

public class DSA_Rearrange_The_Array {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5,
                6, -7, 5, -3, 11};

    }

    public static int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int first = arr[0];
        int last = arr[n - 1];
        while (first < last) {
            if (first > 0) {
                first++;
            } else if (last < 0) {
                last++;
            }
            if (first < 0 && last > 0) {
                
            }
        }
        return arr;
    }
}
