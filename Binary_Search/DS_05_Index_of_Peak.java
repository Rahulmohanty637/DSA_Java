package Binary_Search;
//An array arr a mountain if the following properties hold:
//
//        arr.length >= 3
//        There exists some i with 0 < i < arr.length - 1 such that:
//        arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//        arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//        Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
//
//        You must solve it in O(log(arr.length)) time complexity.
public class DS_05_Index_of_Peak {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end){
            mid = start + (end - start)/2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if (arr[mid] > arr[mid-1]){
                start = mid + 1;
            }
            else {
                end = mid;
            }

        }
        return mid;
    }

    public static void main(String[] args) {
        int [] arr = {0,10,5,2};
        int n = peakIndexInMountainArray(arr);
        System.out.println(n);
    }
}
