import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static List<Integer> findNumbersInArray(int[] arr) {
        int maxNum = findMax(arr);
        Set<Integer> result = new HashSet<>();

        // Iterate through all possible combinations of i, j, and k
        for (int i = 0; i <= Math.sqrt(maxNum); i++) {
            for (int j = 0; j <= Math.sqrt(maxNum); j++) {
                for (int k = 0; k <= Math.sqrt(maxNum); k++) {
                    int num = (int) (Math.pow(2, i) * Math.pow(3, j) * Math.pow(5, k));
                    if (num <= maxNum) {
                        result.add(num);
                    }
                }
            }
        }

        // Check if the generated numbers are in the array
        List<Integer> resultList = new ArrayList<>(result);
        resultList.retainAll(convertArrayToSet(arr));
        resultList.sort(null);
        return resultList;
    }

    private static Set<Integer> convertArrayToSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set;
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 10, 15, 30, 35, 50};
        List<Integer> result = findNumbersInArray(arr);
        System.out.println("Numbers in the array that can be expressed as 2^i * 3^j * 5^k: " + result);
    }
}
