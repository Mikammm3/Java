
// leetcode 198. 打家劫舍
//class Solution {
//    public int rob(int[] nums) {
//        if (nums.length == 1)
//            return nums[0];
//        // 这道题用动态规划来做
//        // dp[i] 就代表以i下标所能偷盗的最大的钱
//        // 对于 dp[i] 有两种情况：
//        // 1.偷i , 则代表 i-1 一定不能偷, nums[i] + dp[i-2]
//        // 2.不偷i, 则代表可以偷 i-1 以及之前的钱，考虑最大值，就是 dp[i-1]
//        // dp[i] = max(nums[i] + dp[i-2], dp[i-1])
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        dp[1] = Math.max(nums[0], nums[1]);
//        for (int i = 2; i < nums.length; i++) {
//            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
//        }
//        return dp[nums.length - 1];
//    }
//}


// leetcode 279. 完全平方数
//class Solution {
//    public int numSquares(int n) {
//        // 这道题可以用动态规划来做
//        // 将 n 看成背包， 完全平方数(1,4,9,16...) 看为物品
//        // 求填满 n 背包的最小物品数
//        // dp[j] 表示填满 j 背包的最小物品个数
//        // dp[j] = min(dp[j], dp[j-i*i] + 1)
//        // dp[j-i*i] 表示填满 j-i*i 的最小物品个数, 加上对应的 i*i(物品)(加一)就表示 dp[j]
//        int[] dp = new int[n + 1];
//        Arrays.fill(dp, Integer.MAX_VALUE);// 求最小，所以初始化为最大
//        dp[0] = 0;
//        // 物品
//        for (int i = 1; i * i <= n; i++) {
//            // 背包, 从 i*i 开始是为了防止数组越界
//            for (int j = i * i; j <= n; j++) {
//                dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
//            }
//        }
//        return dp[n];
//    }
//}