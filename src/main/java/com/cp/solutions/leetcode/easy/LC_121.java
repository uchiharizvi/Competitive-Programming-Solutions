package Easy;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Given an array prices where prices[i] is the price of a given stock on the ith day.
 * *Maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell
 * that stock.
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 **/
public class LC_121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit_4MS(prices));
    }

    /**
     * Time Complexity : O(n)
     * 2 ms
     * 84.3 MB
     **/
    public static int maxProfit_2MS(int[] prices) {
        int max = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] - max > profit) profit = prices[i] - max;
            if (prices[i] < max) max = prices[i];
        }
        return profit;
    }

    /**
     * 4 ms
     * 85.1 MB
     **/
    public static int maxProfit_4MS(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int profitMade = 0;
        for (int i = 0; i < prices.length; i++) {
            min = min(prices[i], min);
            profitMade = prices[i] - min;
            max = max(profitMade, max);
        }
        return max;
    }
}
