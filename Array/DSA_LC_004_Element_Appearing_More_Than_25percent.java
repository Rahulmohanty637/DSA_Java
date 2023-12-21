package Array;

public class DSA_LC_004_Element_Appearing_More_Than_25percent {
    public int findSpecialInteger(int[] arr) {
        int num = arr.length / 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + num]) {
                return arr[i];
            }
        }
        return -1;
    }
}
