

// 牛客网 BM53 缺失的第一个正整数
//import java.util.*;
//
//
//public class Solution {
//    public int minNumberDisappeared(int[] nums) {
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            if (nums[i] <= 0) {
//                nums[i] = n + 1;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (Math.abs(nums[i]) <= n) {
//                nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (nums[i] > 0) {
//                return i + 1;
//            }
//        }
//        return n + 1;
//    }
//}