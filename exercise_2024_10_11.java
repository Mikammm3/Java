
// leetcode 42. 接雨水
//class Solution {
//    public int trap(int[] height) {
//        int ret = 0;
//
//        // leftWall[i] 代表第 i 列左边最高墙的高度
//        int[] leftWall = new int[height.length];
//        // rightWall[i] 代表第 i 列右边最高墙的高度
//        int[] rightWall = new int[height.length];
//
//        for (int i = 1; i < height.length - 1; i++) {
//            leftWall[i] = Math.max(leftWall[i - 1], height[i - 1]);
//        }
//
//        for (int i = height.length - 2; i >= 0; i--) {
//            rightWall[i] = Math.max(rightWall[i + 1], height[i + 1]);
//        }
//
//        for (int i = 1; i < height.length - 1; i++) {
//            int minWall = Math.min(leftWall[i], rightWall[i]);
//            // 只有较小的一段大于当前列的高度才会有水，其他情况不会有水
//            if (height[i] < minWall) {
//                ret += (minWall - height[i]);
//            }
//        }
//        return ret;
//    }
//}