package Problems;

public class DSA_LC_DC_Buy_Two_Chocolates {
    public int buyChoco(int[] prices, int money) {
        // Arrays.sort(prices);
        // int cost = prices[0] + prices[1];
        // if(cost <= money){
        //     return money - cost;
        // }else{
        //     return money;
        // }

        int cost = Integer.MAX_VALUE;
        int leftOver;
        for(int i = 0; i < prices.length; i++){
            for(int j = 0; j < prices.length; j++){
                if (i != j ) {
                    int sum = prices[i] + prices[j];
                    cost = Math.min(cost, sum);
                }
            }
        }
        leftOver = money - cost;
        if(leftOver >= 0){
            return leftOver;
        }else{
            return money;
        }
    }
}
