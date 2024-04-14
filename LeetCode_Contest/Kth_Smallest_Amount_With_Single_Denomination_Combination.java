package LeetCode_Contest;

import java.util.Arrays;

public class Kth_Smallest_Amount_With_Single_Denomination_Combination {
    public long findKthSmallest(int[] coins, int k) {
        // Sort the coins in ascending order
        Arrays.sort(coins);

        int count = 0; // Count of valid amounts generated
        int amount = 0; // Current amount

        // Iterate over the coins
        for (int coin : coins) {
            // Update amount to the next multiple of coin
            amount += coin;
            // Increment count for each valid amount
            count++;
            // If count equals k, return the current amount
            if (count == k) {
                return amount;
            }
        }

        // If k exceeds the number of valid amounts, return -1
        return -1;
    }
}
