

//import java.util.*;
//
//public class Solution {
//    public int StrToInt(String str) {
//        if (str.length() == 0 || str == null) {
//            return 0;
//        }
//        boolean flg = true;//假设是正数
//        char[] chs = str.toCharArray();
//        long sum = 0;
//        int j = 0;
//        for (int i = 0; i < chs.length; i++) {
//
//            if (chs[i] >= '0' && chs[i] <= '9') {
//                long ret = sum;
//                sum = ret * 10 + (chs[i] - '0');
//                System.out.println(sum);
//
//            } else {
//                if (chs[i] != '+' && chs[i] != '-') {
//                    return 0;
//
//                } else {
//                    if (chs[i] == '-') {
//                        flg = false;
//                    }
//                }
//            }
//        }
//        if (!flg) {
//            sum = -sum;
//        }
//
//        return (int) sum;
//    }
//}