package Week04;
//Java：买卖股票的最佳时机 II
public class P122BestTimeToBuyAndSellStockIi{
    public int maxProfit(int[] prices) {

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int tmp = prices[i] - prices[i - 1];
            if (tmp > 0) profit += tmp;
        }
        return profit;
    }
}

//leetcode submit region begin(Prohibit modification and deletion)

/**
 * 思路 --
 * 当T+1 大约T日价格进行买入
 * 当    等于 小于  跳过
 *
 */

//leetcode submit region end(Prohibit modification and deletion)

