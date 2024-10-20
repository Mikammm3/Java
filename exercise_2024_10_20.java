
// leetcode 392. 判断子序列
//class Solution {
//    public boolean isSubsequence(String s, String t) {
//        if (s == null && t == null || s.length() == 0 && t.length() == 0) return true;
//        int j = 0;
//        for (int i = 0; i < t.length(); i++) {
//            if (j < s.length() && s.charAt(j) == t.charAt(i)) {
//                j++;
//            }
//            if (j >= s.length()) return true;
//        }
//        return false;
//    }
//}