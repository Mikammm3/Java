
// leetcode 28. 找出字符串中第一个匹配项的下标
//class Solution {
//    public int strStr(String haystack, String needle) {
//        int i = 0, j = 0;
//        int len = haystack.length();
//        while (i < len) {
//            while (i < len && haystack.charAt(i) != needle.charAt(j)) {
//                i++;
//            }
//            if (i >= len) break;
//            int start = i;
//            while (i < len && j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
//                i++;
//                j++;
//            }
//            if (j >= needle.length()) {
//                return start;
//            } else {
//                i = start + 1;
//                j = 0;
//            }
//        }
//        return -1;
//    }
//}