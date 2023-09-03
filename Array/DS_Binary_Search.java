package Array;
// Order Agnostic Binary Search
public class DS_Binary_Search {

    static int BinarySearch(int [] arr, int item){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == item) {
                return mid;
            }
            if (arr[start] < arr[end]) {
                // Array is sorted in Increasing order
                if (item < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                // Array is sorted in Decreasing order
                if (item > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr1 [] = {26, 59, 74, 106, 138, 222, 271, 380, 791, 995};
        int arr2 [] = {995, 791, 380, 271, 222, 138, 106, 74, 59, 26};
        int ans = BinarySearch(arr1, 138);
        int res = BinarySearch(arr2, 138);
        System.out.println(ans);
        System.out.println(res);
//        int [] arr = new int[5];
//        for (int i =0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }
    }
    }
