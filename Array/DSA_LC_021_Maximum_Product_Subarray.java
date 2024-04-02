package Array;

public class DSA_LC_021_Maximum_Product_Subarray {

    public static int maxProduct(int[] arr) {

        // brute force
     /*   int prod = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int mul = 1;
                for (int k = 0; k <= j; k++) {
                    mul *= arr[k];
                }
                if (mul > prod) {
                    prod = mul;
                }
            }
        }
        if (prod == Integer.MIN_VALUE) {
            return 0;
        } else {
            return prod;
        }*/

        // optimal solution (similar to kadanne's algorithm
        int prefix = 1;
        int suffix = 1; // taking product of the subarary from both the directions
        int max = 0;

        /*
         * case 1 -  All the numbers are positive -> then product of all the elements will be the answer
         * case 2 -  All the numbers are negative -> then product of all the elements will be the answer
         * case 3 -  If the even number of elements are negative -> the output remains just as above two cases
         * case 4 -  (important) having odd number of elements negative -> then we have to avoid 1 negative number to get the output and it must the first negative or the last negative
         * case 5 -  If there will be any 0 then we will make prefix or suffix back equals to 1
         */
        for (int i = 0; i < arr.length; i++) {
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
            prefix = prefix * arr[i];
            suffix = suffix * arr[arr.length - i - 1];
            max = Math.max(max, Math.max(prefix, suffix));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2};
        System.out.println(maxProduct(arr));
    }
}
