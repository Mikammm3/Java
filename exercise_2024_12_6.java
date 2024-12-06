

// leetcode 11. 盛最多水的容器
//class Solution {
//    public int maxArea(int[] height) {
//        int max = 0;
//        int left = 0, right = height.length - 1;
//        while (left < right) {
//            int min = Math.min(height[left], height[right]);
//            int water = min * (right - left);
//            if (water > max) {
//                max = water;
//            }
//            if (min == height[left]) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//        return max;
//    }
//}


// leetcode 15. 三数之和
//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ret = new ArrayList<>();
//        Arrays.sort(nums);
//        int i = 0, n = nums.length;
//
//        // -4 -1 -1 0 1 2
//        while (i < n) {
//            if (nums[i] > 0) break;
//
//            int target = -nums[i];
//            int left = i + 1, right = n - 1;
//
//            while (left < right) {
//                int sum = nums[left] + nums[right];
//                if (sum > target) {
//                    right--;
//                } else if (sum < target) {
//                    left++;
//                } else {
//                    ret.add(new ArrayList<>(Arrays.asList(nums[left], nums[right], nums[i])));
//                    left++;
//                    right--;
//                    // 去重
//                    while (left < right && nums[left] == nums[left - 1]) left++;
//                    while (left < right && nums[right] == nums[right + 1]) right--;
//
//                }
//            }
//
//            i++;
//            // 去重
//            while (i < n && nums[i] == nums[i - 1]) i++;
//        }
//        return ret;
//    }
//}