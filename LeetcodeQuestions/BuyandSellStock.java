package LeetcodeQuestions;

public class BuyandSellStock {
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
    public int maxProfit(int[] prices) {
        int leastPrice = Integer.MAX_VALUE;
        int overallProfit = 0;
        int profitToday = 0;

        for(int i =0; i<prices.length; i++){
            if(prices[i]<leastPrice){
                leastPrice = prices[i];
            }
            profitToday = prices[i] - leastPrice;
            if(overallProfit < profitToday){
                overallProfit = profitToday;
            }
        }
        return overallProfit;
    }
}
