

// leetcode 125. 验证回文串
//class Solution {
//    public boolean isPalindrome(String s) {
//        char[] arr = s.toLowerCase().toCharArray();
//        int i = 0, j = s.length() - 1;
//        // 0p
//        while (i < j) {
//            while (i < j && !isCharacter(arr[i])) {
//                i++;
//            }
//            while (i < j && !isCharacter(arr[j])) {
//                j--;
//            }
//            if (i < j && arr[i] != arr[j]) {
//                return false;
//            }
//            i++;
//            j--;
//
//        }
//        return true;
//    }
//
//    public boolean isCharacter(char c) {
//        if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9') return true;
//        return false;
//    }
//}