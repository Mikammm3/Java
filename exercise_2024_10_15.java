
// leetcode 14. 最长公共前缀
//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) {
//            return "";
//        }
//        String prev = strs[0];
//        for (int i = 1; i < strs.length; i++) {
//            prev = getLongestCommonPrefix(prev, strs[i]);
//            if (prev.length() == 0) {
//                break;
//            }
//        }
//        return prev;
//    }
//
//
//    public String getLongestCommonPrefix(String s1, String s2) {
//        int len = Math.min(s1.length(), s2.length());
//        int i = 0;
//        while (i < len && s1.charAt(i) == s2.charAt(i)) {
//            i++;
//        }
//        return s1.substring(0, i);
//    }
//}