package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DSA_Subset_via_Iteration {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> subset = subSetDuplicate(arr);
        for (List<Integer> n : subset) {
            System.out.println(n);
        }
    }

    public static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // created an initial list with []
        for (int num : arr) { // Then iterating arr for each element num
            int size = outer.size(); // Now for adding a list we must have same number of element as the outer list
            for (int i = 0; i < size; i++) { // creating a new list same as the size of outer list
                List<Integer> internal = new ArrayList<>(outer.get(i)); // New list i.e. internal list first makes a copy of outer list by constructor
                internal.add(num); // Then its just add the number in each element
                outer.add(internal); // since the internal list was a copy and now it turned into entire new list, so simply add the internal list in outer list
            }
        }
        return outer;
    }

    public static List<List<Integer>> subSetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            // if current and previous elements are same, start = (previous) end + 1
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outerList.size() - 1;
            for (int j = start; j < end + 1; j++) {
                List<Integer> internal = new ArrayList<>(outerList.get(j));
                internal.add(arr[i]);
                outerList.add(internal);
            }
        }
        return outerList;
    }

    public static class DSA_LC_023_House_Robber {
        public static int rob(int[] nums) {
            int odd = 0;
            int eve = 0;
            for (int i = 0; i < nums.length; i += 2) {
                odd += nums[i];
            }
            for (int i = 1; i < nums.length; i += 2) {
                System.out.println(eve);
                eve += nums[i];
            }
    //        System.out.println(eve);
    //        System.out.println(odd);
            if (odd < eve) {
                return eve;
            } else {
                return odd;
            }
        }

        public static void main(String[] args) {
            int[] arr = {1,2};
            System.out.println(rob(arr));
        }
    }

    public static class DSA_LC_022_Maximum_Product_Subarray {
        public int maxProduct(int[] arr) {
            int prod1 = arr[0], prod2 = arr[0], result = arr[0];

            for (int i = 1; i < arr.length; i++) {
                int temp = Math.max(arr[i], Math.max(prod1 * arr[i], prod2 * arr[i]));
                prod2 = Math.min(arr[i], Math.min(prod1 * arr[i], prod2 * arr[i]));
                prod1 = temp;

                result = Math.max(result, prod1);
            }
            return result;
        }
    }

    public static class DSA_LC_021_Maximum_Subarray {
        public int maxSubArray(int[] nums) {
            int max = Integer.MIN_VALUE;

            // Brute Force
            // for(int i = 0; i < nums.length; i++){
            //     int sum = 0;
            //     for(int j = i; j < nums.length; j++){
            //         // for(int k = i; k <= j; k++){
            //             sum += nums[j];
            //         // }
            //         max = Math.max(sum, max);
            //     }
            // }

            //Optimal Solution
            if (nums.length == 1) {
                return nums[0];
            }

            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (sum > max) {
                    max = sum;
                }
                if (sum < 0) {
                    sum = 0;
                }
            }
            return max;
        }
    }
}
