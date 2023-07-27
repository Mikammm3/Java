


//LeetCode 13. 罗马数字转整数
//class Solution {
//    public int romanToInt(String s) {
//        int num = 0;
//        int prevNum = getValue(s.charAt(0));
//        //遍历，前一个数字比当前数字小的话就做减法（对于前一个数字而言）
//        for (int i = 1; i < s.length(); i++) {
//            int curNum = getValue(s.charAt(i));
//            if (prevNum < curNum) {
//                num -= prevNum;
//            } else {
//                num += prevNum;
//            }
//            prevNum = curNum;//最后更新
//        }
//        num += prevNum;
//        return num;
//    }
//
//    public static int getValue(char ch) {
//        switch (ch) {
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
//        }
//        return 0;
//    }
//}