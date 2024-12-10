
// leetcode 53. 最大子数组和
//class Solution {
//    public int maxSubArray(int[] nums) {
//        // dp[i] 就代表以 i 结尾的最大和连续子数组
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        int max = dp[0];
//        for (int i = 1; i < nums.length; i++) {
//            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
//            max = Math.max(max, dp[i]);
//        }
//        return max;
//    }
//}

// leetcode 56. 合并区间
//class Solution {
//    public int[][] merge(int[][] intervals) {
//        // ret 的最后一个元素作为判断点
//        List<int[]> ret = new ArrayList<>();
//        // 先排序，根据每个二元组的第一个元素
//        Arrays.sort(intervals, new Comparator<>() {
//            public int compare(int[] arr1, int[] arr2) {
//                return arr1[0] - arr2[0];
//            }
//        });
//
//        for (int i = 0; i < intervals.length; i++) {
//            int start = intervals[i][0];
//            int end = intervals[i][1];
//            // 没重合
//            if (ret.isEmpty() || ret.get(ret.size() - 1)[1] < start) {
//                ret.add(new int[]{start, end});
//            } else {
//                // 重合了，就需要更新下标
//                int[] arr = ret.get(ret.size() - 1);
//                arr[1] = Math.max(arr[1], end);
//            }
//        }
//
//        return ret.toArray(new int[ret.size()][]);
//
//    }
//}