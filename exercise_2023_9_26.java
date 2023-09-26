


// 牛客网 GP8 回文数
//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param x int整型
//     * @return bool布尔型
//     */
//    public boolean isPalindrome(int x) {
//        String s = Integer.toString(x);
//        int left = 0;
//        int right = s.length() - 1;
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//}