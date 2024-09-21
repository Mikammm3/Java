
// leetcode LCR 188. 买卖芯片的最佳时机
//class Solution {
//    public int bestTiming(int[] prices) {
//        int max = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int tmp = prices[j] - prices[i];
//                if (tmp > max) {
//                    max = tmp;
//                }
//            }
//        }
//        return max;
//    }
//}


// leetcode LCR 162. 数字 1 的个数
//class Solution {
//    public int digitOneInNumber(int num) {
//        if (num == 0 || num == 1) return num;
//        int count = 0;
//        for (int i = 1; i <= num; i++) {
//            int tmp = i;
//            while (tmp != 0) {
//                if (tmp % 10 == 1) {
//                    count++;
//                }
//                tmp /= 10;
//            }
//        }
//        return count;
//
//    }
//}