
// leetcode 12. 整数转罗马数字
//class Solution {
//    public String intToRoman(int num) {
//        StringBuilder str = new StringBuilder();
//        while (num > 0) {
//            if (num >= 1000) {
//                num -= 1000;
//                str.append('M');
//            } else if (num >= 500) {
//                if (num >= 900) {
//                    num -= 900;
//                    str.append("CM");
//                } else {
//                    num -= 500;
//                    str.append('D');
//                }
//            } else if (num >= 100) {
//                if (num >= 400) {
//                    num -= 400;
//                    str.append("CD");
//                } else {
//                    num -= 100;
//                    str.append("C");
//                }
//            } else if (num >= 50) {
//                if (num >= 90) {
//                    num -= 90;
//                    str.append("XC");
//                } else {
//                    num -= 50;
//                    str.append("L");
//                }
//            } else if (num >= 10) {
//                if (num >= 40) {
//                    num -= 40;
//                    str.append("XL");
//                } else {
//                    num -= 10;
//                    str.append("X");
//                }
//            } else if (num >= 5) {
//                if (num >= 9) {
//                    num -= 9;
//                    str.append("IX");
//                } else {
//                    num -= 5;
//                    str.append("V");
//                }
//            } else if (num >= 1) {
//                if (num >= 4) {
//                    num -= 4;
//                    str.append("IV");
//                } else {
//                    num -= 1;
//                    str.append("I");
//                }
//            }
//        }
//        return str.toString();
//    }
//}