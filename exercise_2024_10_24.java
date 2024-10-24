
// leetcode 15. 三数之和
//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> ret = new ArrayList<>();
//        int i = 0, n = nums.length;
//        while (i < n) {
//            if (nums[i] > 0) {
//                break;
//            }
//            int target = -nums[i];
//            int left = i + 1, right = n - 1;
//            while (left < right) {
//                int sum = nums[left] + nums[right];
//                if (sum > target) {
//                    right--;
//                } else if (sum < target) {
//                    left++;
//                } else {
//                    ret.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
//                    left++;
//                    right--;
//                    while (left < right && nums[left] == nums[left - 1]) left++;
//                    while (left < right && nums[right] == nums[right + 1]) right--;
//                }
//            }
//            i++;
//            while (i < n && nums[i] == nums[i - 1]) i++;
//        }
//        return ret;
//    }
//}