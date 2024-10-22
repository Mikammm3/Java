
// leetcode 11. 盛最多水的容器
//class Solution {
//    public int maxArea(int[] height) {
//        int left = 0, right = height.length - 1;
//        int maxSum = 0;
//        while (left < right) {
//            int sum = Math.min(height[left], height[right]) * (right - left);
//            if (sum > maxSum) maxSum = sum;
//            if (height[left] < height[right]) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//        return maxSum;
//    }
//}