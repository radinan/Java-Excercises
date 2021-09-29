public class Solution {
//    Input: prices = [7,1,5,3,6,4]
//    Output: 7

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }

        int profit = 0;
        for (int i = 0; i < prices.length - 1; ++i) {
            if (prices[i] < prices[i+1]) {
                profit += (prices[i+1] - prices[i]);
            }
        }

        return profit;
    }
}
