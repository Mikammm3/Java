
// leetcode 122. 买卖股票的最佳时机 II
//class Solution {
//    public int maxProfit(int[] prices) {
//        int sum = 0;
//        // 低买高卖，只用记录股票上升时的差值即可。
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] > prices[i - 1]) {
//                sum += prices[i] - prices[i - 1];
//            }
//        }
//        return sum;
//    }
//}