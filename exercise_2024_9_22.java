

// leetcode LCR 163. 找到第 k 位数字
//class Solution {
//    public int findKthNumber(int k) {
//        if (k < 10) return k;
//        int cnt = 9;
//        for (int i = 10; i <= k; i++) {
//            String value = String.valueOf(i);
//            for (int j = 0; j < value.length(); j++) {
//                int ch = (int) (value.charAt(j) - '0');
//                cnt++;
//                if (cnt == k) {
//                    return ch;
//                }
//            }
//        }
//        return -1;
//
//    }
//}