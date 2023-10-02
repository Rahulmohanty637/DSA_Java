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
}
