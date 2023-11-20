

// LeetCode 面试题 08.06. 汉诺塔问题
//class Solution {
//    public void hanota(List<Integer> a, List<Integer> b, List<Integer> c) {
//        dfs(a, b, c, a.size());
//    }
//
//    public void dfs(List<Integer> a, List<Integer> b, List<Integer> c, int n) {
//        if (n == 1) {
//            c.add(a.remove(a.size() - 1));
//            return;
//        }
//        dfs(a, c, b, n - 1);
//        c.add(a.remove(a.size() - 1));
//        dfs(b, a, c, n - 1);
//    }
//}


// LeetCode 21. 合并两个有序链表
//class Solution {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list1 == null) {
//            return list2;
//        }
//        if (list2 == null) {
//            return list1;
//        }
//
//        if (list1.val < list2.val) {
//            list1.next = mergeTwoLists(list1.next, list2);
//            return list1;
//        } else {
//            list2.next = mergeTwoLists(list1, list2.next);
//            return list2;
//        }
//    }
//}


// LeetCode 面试题 08.01. 三步问题
//class Solution {
//    public int waysToStep(int n) {
//        // 1. 创建 dp 表
//        // 2. 初始化
//        // 3. 填表
//        // 4. 返回值
//
//        if (n == 1 || n == 2) {
//            return n;
//        } else if (n == 3) {
//            return 4;
//        }
//
//        int MOD = (int) 1e9 + 7;
//        int[] dp = new int[n + 1];
//        dp[1] = 1;
//        dp[2] = 2;
//        dp[3] = 4;
//        for (int i = 4; i <= n; i++) {
//            dp[i] = ((dp[i - 1] + dp[i - 2]) % MOD + dp[i - 3]) % MOD;
//        }
//        return dp[n];
//    }
//}


// LeetCode 746. 使用最小花费爬楼梯
//class Solution {
//    public int minCostClimbingStairs(int[] cost) {
//        int n = cost.length;
//        if (n < 2) {
//            return 0;
//        }
//        // 1. 建表
//        // 2. 初始化
//        // 3. 填表
//        // 4. 返回值
//        int[] dp = new int[n];
//        dp[n - 1] = cost[n - 1];
//        dp[n - 2] = cost[n - 2];
//        for (int i = n - 3; i >= 0; i--) {
//            dp[i] = Math.min(dp[i + 1], dp[i + 2]) + cost[i];
//        }
//
//        return Math.min(dp[0], dp[1]);
//    }
//}


// LeetCode 202. 快乐数
//class Solution {
//    public boolean isHappy(int n) {
//        int fast = bitSum(n);
//        int slow = n;
//
//        while (fast != slow) {
//            fast = bitSum(bitSum(fast));
//            slow = bitSum(slow);
//        }
//        return fast == 1;
//    }
//
//    public int bitSum(int n) { // 求平方和
//        int sum = 0;
//        while (n != 0) {
//            int t = n % 10;
//            sum += t * t;
//            n /= 10;
//        }
//        return sum;
//    }
//}


// LeetCode 2208. 将数组和减半的最少操作次数
//class Solution {
//    public int halveArray(int[] nums) {
//        PriorityQueue<Double> heap = new PriorityQueue<>((a, b) -> b.compareTo(a));// 大根堆
//        double sum = 0.0;
//        for (int x : nums) {
//            heap.offer((double) x);
//            sum += x;
//        }
//        int count = 0;
//        double half = sum / 2;
//        while (sum > half) {
//            double t = heap.poll() / 2;
//            sum -= t;
//            heap.offer(t);
//            count++;
//        }
//        return count;
//    }
//}