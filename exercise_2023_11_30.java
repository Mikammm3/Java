
// LeetCode 525. 连续数组
//class Solution {
//    public int findMaxLength(int[] nums) {
//        int sum = 0;
//        // 前缀和，下标
//        HashMap<Integer, Integer> hash = new HashMap<>();
//        hash.put(0, -1);
//        int ret = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0) nums[i] = -1;
//            sum += nums[i];
//            if (hash.containsKey(sum)) {
//                int j = hash.get(sum);
//                ret = Math.max(ret, i - j);
//            } else {
//                hash.put(sum, i);
//            }
//        }
//        return ret;
//    }
//}

