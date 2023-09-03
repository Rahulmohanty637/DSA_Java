package Recursion;

public class DS_08_Rotated_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int num = searchInRotatedArray(arr, 9, 0, arr.length - 1);
        if (num == -1) {
            System.out.println("The element is not found");
        } else {
            System.out.println("The element found in " + num + " index");
        }
    }

    public static int searchInRotatedArray(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] < arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return searchInRotatedArray(arr, target, start, mid - 1);
            } else {
                return searchInRotatedArray(arr, target, mid + 1, end);
            }
        }
        if (target >= arr[mid] && target <= arr[end]) {
            return searchInRotatedArray(arr, target, mid + 1, end);
        } else {
            return searchInRotatedArray(arr, target, start, mid - 1);
        }
    }
}
