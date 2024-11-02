
// leetcode 219. 存在重复元素 II
//class Solution {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Map<Integer, Integer> hash = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (hash.containsKey(nums[i]) && i - hash.get(nums[i]) <= k) {
//                return true;
//            }
//            hash.put(nums[i], i);
//        }
//        return false;
//    }
//}