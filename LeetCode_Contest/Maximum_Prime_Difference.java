package LeetCode_Contest;

public class Maximum_Prime_Difference {

    public static int maxDistance(int[] nums) {
        int maxDistance = 0;
        int prevPrimeIndex = -1;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the current number is prime
            if (isPrime(nums[i])) {
                // Update maxDistance if there's a previous prime
                if (prevPrimeIndex != -1) {
                    maxDistance = Math.max(maxDistance, i - prevPrimeIndex);
                }
                // Update prevPrimeIndex
                prevPrimeIndex = i;
            }
        }

        // Check if no prime numbers were found
        if (prevPrimeIndex == -1) {
            return 0;
        }

        return maxDistance;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 9, 5, 3};
        System.out.println(maxDistance(nums)); // Output: 3
        int[] nums2 = {4, 8, 2, 8};
        System.out.println(maxDistance(nums2)); // Output: 0
    }
}
