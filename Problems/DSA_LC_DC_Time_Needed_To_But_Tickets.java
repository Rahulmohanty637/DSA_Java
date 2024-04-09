package Problems;

public class DSA_LC_DC_Time_Needed_To_But_Tickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int total = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                total += Math.min(tickets[i], tickets[k]);
            } else {
                total += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return total;
    }

    public static void main(String[] args) {

    }
}
