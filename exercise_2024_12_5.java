
// leetcode 128. 最长连续序列
//class Solution {
//    public int longestConsecutive(int[] nums) {
//        if (nums == null || nums.length == 0) return 0;
//        Arrays.sort(nums);
//        int count = 1;
//        int maxCount = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == nums[i - 1] + 1) {
//                count++;
//            } else if (nums[i] == nums[i - 1]) {
//                continue;
//            } else {
//                if (count > maxCount) {
//                    maxCount = count;
//                }
//                count = 1;
//            }
//        }
//        if (count > maxCount) {
//            maxCount = count;
//        }
//        return maxCount;
//    }
//}


// leetcode 283. 移动零
class Solution {
    public void moveZeroes(int[] nums) {
        // i 表示不是 0 的数组的下标结束位置
        for (int i = -1, j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int zero = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = zero;
                i++;
            }
        }

    }
}