
// leetcode LCR 128. 库存管理 I
//class Solution {
//    public int stockManagement(int[] stock) {
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < stock.length; i++) {
//            if (stock[i] < min) {
//                min = stock[i];
//            }
//        }
//        return min;
//    }
//}
//class Solution {
//    public int stockManagement(int[] stock) {
//        int left = 0;
//        int right = stock.length - 1;
//        while (left < right) {
//            int mid = (left + right) / 2;
//            if (stock[mid] > stock[right]) {
//                left = mid + 1;
//            } else if (stock[mid] == stock[right]) {
//                right--;
//            } else {
//                right = mid;
//            }
//        }
//        return stock[right];
//    }
//}


// leetcode LCR 131. 砍竹子 I
//class Solution {
//    public int cuttingBamboo(int bamboo_len) {
//        // dp[i] 是长度为 i 的竹子拆分为两段或以上的最大乘积
//        int[] dp = new int[bamboo_len + 1];
//        // 初始化 dp[0] = dp[1] = 0
//        dp[0] = 0;
//        dp[1] = 0;
//        for (int i = 2; i <= bamboo_len; i++) {
//            // 分两种情况，一种是竹子 i 只拆分成两个数字 3 = 2 + 1
//            // 分别是 j 和 i - j，另一种是 j，和 i - j 继续拆分成更细的 3 = 1 + 1 + 1
//            // 所以需要 j 从 i - 1 开始遍历，j 》= 1，然后求以上结果集合中的最大的那一个
//            for (int j = i - 1; j >= 1; j--) {
//                int max = Math.max(j * (i - j), j * dp[i - j]);
//                dp[i] = Math.max(dp[i], max);
//            }
//        }
//        return dp[bamboo_len];
//    }
//}