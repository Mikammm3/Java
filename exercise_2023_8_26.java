
//LeetCode 217. 存在重复元素
//class Solution {
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (set.contains(nums[i])) {
//                return true;
//            } else {
//                set.add(nums[i]);
//            }
//        }
//        return false;
//    }
//}

//LeetCode 219. 存在重复元素 II
//class Solution {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        Set<Integer> set = new HashSet<>();
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (set.contains(nums[i])) {
//                int val = map.get(nums[i]);
//                if (Math.abs(val - i) <= k) {
//                    return true;
//                } else {
//                    map.put(nums[i], i);
//                }
//            } else {
//                map.put(nums[i], i);
//                set.add(nums[i]);
//            }
//        }
//        return false;
//    }
//}