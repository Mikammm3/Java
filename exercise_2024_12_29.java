
// leetcode 121. 买卖股票的最佳时机
//class Solution {
//    public int maxProfit(int[] prices) {
//        int sum = 0;
//        int[] max = new int[prices.length];
//        for (int i = prices.length - 2; i >= 0; i--) {
//            max[i] = Math.max(max[i + 1], prices[i + 1]);
//            sum = Math.max(max[i] - prices[i], sum);
//        }
//        return sum;
//    }
//}
//class Solution {
//    public int maxProfit(int[] prices) {
//        int min = Integer.MAX_VALUE;
//        int maxProfit = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] < min) min = prices[i];
//            if (prices[i] - min > maxProfit) maxProfit = prices[i] - min;
//        }
//        return maxProfit;
//    }
//}


// leetcode 55. 跳跃游戏
//class Solution {
//    public boolean canJump(int[] nums) {
//        // 这道题用贪心
//        // 不去考虑具体跳多少步，而是去看当前下标，的覆盖范围，取最大的覆盖范围
//        // 1 0 1
//        // 比如上面，从下标 0 开始，nums[i] = 1, 所以当前的覆盖范围是下标 [0, 1]
//        // 看看最大的覆盖范围是否覆盖了最后一个下标即可
//        int cover = 0;
//        for (int i = 0; i <= cover; i++) {
//            cover = Math.max(cover, i + nums[i]);
//            if (cover >= nums.length - 1)
//                return true;
//        }
//        return false;
//    }
//}


// leetcode 45. 跳跃游戏 II
//class Solution {
//    public int jump(int[] nums) {
//        if (nums.length == 1) return 0;
//        // 贪心思路，每次挑最大的覆盖范围进行覆盖
//
//        int count = 0;
//        // 当前的覆盖范围, 下一步的覆盖范围(最大的)
//        int cover = 0, nextCover = 0;
//        for (int i = 0; i < nums.length; i++) {
//            nextCover = Math.max(nextCover, i + nums[i]);
//            if (i == cover) {
//                // 如果已经走到了范围的尽头，但是还没到达终点，则需要启动下一步覆盖范围
//                if (cover < nums.length - 1) {
//                    count++;
//                    cover = nextCover;
//                }
//            }
//            // 如果达到了终点，则返回结果
//            if (cover >= nums.length - 1) return count;
//        }
//        return count;
//
//    }
//}

