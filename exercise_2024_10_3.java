
// leetcode 121. 买卖股票的最佳时机
//class Solution {
//    public int maxProfit(int[] prices) {
//        int min = Integer.MAX_VALUE;
//        int maxProfit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < min) {
//                min = prices[i];
//            }
//            if (prices[i] - min > maxProfit) {
//                maxProfit = prices[i] - min;
//            }
//        }
//
//        return maxProfit;
//
//    }
//}