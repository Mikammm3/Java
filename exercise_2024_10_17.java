
// leetcode 6. Z 字形变换
//class Solution {
//    public String convert(String s, int numRows) {
//        if (numRows == 1) return s;
//        StringBuilder ans = new StringBuilder();
//        // 第 1 行
//        int d = 2 * numRows - 2;
//        for (int i = 0; i < s.length(); i += d) {
//            ans.append(s.charAt(i));
//        }
//        // 中间行
//        for (int i = 1; i < numRows - 1; i++) {
//            // 3    1357
//            // 4    1571113
//            int tmp = 0;
//            for (int j = i; j + tmp < s.length(); tmp += d) {
//                ans.append(s.charAt(j + tmp));
//                if (d - j + tmp < s.length()) ans.append(s.charAt(d - j + tmp));
//            }
//        }
//        // 尾行
//        for (int i = numRows - 1; i < s.length(); i += d) {
//            ans.append(s.charAt(i));
//        }
//        return ans.toString();
//    }
//}