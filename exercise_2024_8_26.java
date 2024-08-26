
// leetcode LCR 138. 有效数字
//class Solution {
//    public boolean validNumber(String s) {
//        // 是否有数字，E，正负号，点
//        boolean hasNum = false;
//        boolean hasE = false;
//        boolean hasSign = false;
//        boolean hasDot = false;
//        // 先跳过开头的空格
//        int index = 0, len = s.length();
//        while (index < len && s.charAt(index) == ' ') {
//            index++;
//        }
//        // 从非空格的字符开始判断
//        // 顺序严格按照 空格，正负号，数字，(点)，数字，eE，数字 空格
//        while (index < len) {
//            if (isNum(s.charAt(index))) {
//                hasNum = true;
//                // 如果是数字
//                while (index < len && isNum(s.charAt(index))) {
//                    index++;
//                }
//                // 说明字符串全是数字
//                if (index == len) return true;
//            }
//            // 到这里就字符就一定是非数字的
//            char c = s.charAt(index);
//            if (c == 'e' || c == 'E') {
//                // 如果出现多个 E，或者之前没有出现过数字
//                if (hasE || !hasNum) {
//                    return false;
//                }
//                hasE = true;
//                // 将其他三个 flg 置为 false，继续从 E 往后找新的数字
//                hasNum = false;
//                hasSign = false;
//                hasDot = false;
//            } else if (c == '+' || c == '-') {
//                // 如果之前出现过符号或者数字或者'.'，则返回 false
//                if (hasSign || hasNum || hasDot) {
//                    return false;
//                }
//                hasSign = true;
//            } else if (c == '.') {
//                // 如果之前出现过点或者 eE
//                if (hasDot || hasE) {
//                    return false;
//                }
//                hasDot = true;
//            } else if (c == ' ') {
//                // 说明此时可能到了字符串末尾的空格，也可能是夹在字符间的空格，需要额外处理。
//                break;
//            } else {
//                // 其他非法字符
//                return false;
//            }
//            index++;
//        }
//        // 处理末尾空格
//        while (index < len && s.charAt(index) == ' ') {
//            index++;
//        }
//        if (index == len && hasNum) {
//            return true;
//        }
//        return false;
//    }
//
//    public boolean isNum(char c) {
//        if (c >= '0' && c <= '9') return true;
//        return false;
//    }
//}