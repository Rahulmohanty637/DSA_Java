package Array;

public class DS_LC_000_Median_of_Two_Sorted_Array {
    public static void main(String[] args) {

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double n =6.7d;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[nums1.length + nums2.length];
        if (nums2[0] < nums1[nums1.length - 1]) {
            for (int i = 0; i < nums1.length; i++) {
                if (nums2[i] > nums1[nums1.length - 1]) {
                    System.arraycopy(nums1, 0, arr, 0, n1);
                    System.arraycopy(nums2, 0, arr, n1, n2);
                }
            }
        }

           return n;
    }
}
