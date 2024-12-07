
// leetcode 42. 接雨水
//class Solution {
//    public int trap(int[] height) {
//        // i 左边最高的墙
//        int[] leftWall = new int[height.length];
//        // i 右边最高的墙
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
//        int water = 0;
//        // 只有当当前元素的高度小于 其左右两边最高的墙 的时候，才能装水
//        for (int i = 1; i < height.length - 1; i++) {
//            int minWall = Math.min(leftWall[i], rightWall[i]);
//            if (height[i] < minWall) {
//                water += (minWall - height[i]);
//            }
//        }
//        return water;
//
//    }
//}


// leetcode 3. 无重复字符的最长子串
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        if (s == null || s.length() == 0) return 0;
//        int count = 0, left = 0, right = 0, len = s.length();
//        Set<Character> set = new HashSet<>();
//        while (right < len) {
//            // 进窗口
//            while (right < len && (set.isEmpty() || !set.contains(s.charAt(right)))) {
//                set.add(s.charAt(right));
//                right++;
//            }
//            // 判断
//            if (right >= len) {
//                count = Math.max(count, right - left);
//                break;
//            }
//            char c = s.charAt(right);
//            count = Math.max(count, right - left);
//            right++;
//            // 出窗口
//            while (left < right && s.charAt(left) != c) {
//                set.remove(s.charAt(left));
//                left++;
//            }
//            left++;
//        }
//
//        return count;
//
//    }
//}