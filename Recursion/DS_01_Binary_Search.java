package Recursion;

public class DS_01_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {26, 59, 74, 106, 138, 222, 271, 380, 791, 995};
        int start = 0;
        int end = arr.length - 1;
        System.out.println(binarySearch(arr, 261, start, end));
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        int val = binarySearch(arr, target, start, end);
        return val;
    }
}
