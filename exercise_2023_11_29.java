// LeetCode 560. 和为 K 的子数组
//class Solution {
//    public int subarraySum(int[] nums, int k) {
//        // 利用前缀和 + hash 表
//        // 第一个 int 表示前缀和，第二个 int 表示该前缀和出现次数
//        HashMap<Integer, Integer> hash = new HashMap<>();
//        hash.put(0, 1);
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum = sum + nums[i];
//            int target = sum - k;
//            count += hash.getOrDefault(target, 0);
//            hash.put(sum, hash.getOrDefault(sum, 0) + 1);
//        }
//        return count;
//    }
//}