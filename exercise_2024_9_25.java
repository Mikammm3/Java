
// LCR 188. 买卖芯片的最佳时机
//class Solution {
//    public int bestTiming(int[] prices) {
//        int max = 0;
//        // 记录最低股票值
//        int minPrice = Integer.MAX_VALUE;
//        // 低买高卖
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < minPrice) {
//                minPrice = prices[i];
//            }
//            if (prices[i] - minPrice > max) {
//                max = prices[i] - minPrice;
//            }
//        }
//        return max;
//    }
//}