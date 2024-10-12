
// leetcode 13. 罗马数字转整数
//class Solution {
//    public int romanToInt(String s) {
//        int ret = 0;
//        int prevNum = getValue(s.charAt(0));
//        for (int i = 1; i < s.length(); i++) {
//            int cur = getValue(s.charAt(i));
//            if (cur > prevNum) {
//                ret -= prevNum;
//            } else {
//                ret += prevNum;
//            }
//            prevNum = cur;
//        }
//        ret += prevNum;
//        return ret;
//    }
//
//
//    private int getValue(char c) {
//        switch (c) {
//            case 'I':
//                return 1;
//            case 'V':
//                return 5;
//            case 'X':
//                return 10;
//            case 'L':
//                return 50;
//            case 'C':
//                return 100;
//            case 'D':
//                return 500;
//            case 'M':
//                return 1000;
//            default:
//                return -1;
//        }
//    }
//}