package Binary_Search;
// Find the largest number present in an array which is smaller than or equal to the target.
public class DS_02_Floor_Number {
    static int floor_Number (int [] arr, int target){
        int asd = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (arr[mid] == target) {
                return arr[mid];
            }
            if (arr[start] < arr[end]) {
                asd = 1;
                // Array is sorted in Increasing order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                // Array is sorted in Decreasing order
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        if (asd == 1) {
            return arr[start];
        }
        else
            return arr[start];
    }

    public static void main(String[] args) {
        int arr1 [] = {26, 59, 60, 61, 66,
                74, 84, 87, 94, 99,
                106, 111, 125, 195,
                222, 254, 271, 298,
                345, 367, 380, 429,
                488, 567, 628, 791,
                888, 995};
        int arr2 [] = {995, 791, 380, 271, 222, 138, 106, 74, 59, 26};
        int ans = floor_Number(arr1, 127);
        int res = floor_Number(arr2, 215);
        System.out.println(ans);
        System.out.println(res);
    }
}
