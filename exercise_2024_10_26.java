
// leetcode 3. 无重复字符的最长子串
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        // 双指针
//        char[] hash = new char[128];
//        int left = 0, right = 0;
//        char[] arr = s.toCharArray();
//        int len = arr.length;
//        int ans = 0;
//        while (right < len) {
//            hash[arr[right]]++;
//            while (hash[arr[right]] > 1) {
//                hash[arr[left]]--;
//                left++;
//            }
//            ans = Math.max(ans, right - left + 1);
//            right++;
//        }
//        return ans;
//
//    }
//}