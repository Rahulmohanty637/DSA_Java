package Problems;

import java.util.*;

public class DSA_LC_Unique_Number_of_Occurrences {

    public static boolean bruteuniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int[] count = {0, 0, 0, 0, 0};
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count[j]++;
                continue;
            }
            count[j] += 1;
            j++;
        }
        count[j] += 1;
        System.out.println(Arrays.toString(count));
        return containsDuplicate(count);
    }

    public static boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        if ((arr.length == 1) || ((arr.length == 2) && (arr[0] != arr[1]))) {
            return false;
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != j + 1 && arr[j] == arr[j - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(bruteuniqueOccurrences(arr));
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Set<Integer> s = new HashSet<>();
        for (int x : freq.values()) {
            s.add(x);
        }

        return freq.size() == s.size();
    }
}
