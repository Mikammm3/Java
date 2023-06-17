

//牛客网 BM88 判断是否为回文字符串
//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param str string字符串 待判断的字符串
//     * @return bool布尔型
//     */
//    public boolean judge(String str) {
//        if (str == null || str.length() == 0) {
//            return false;
//        }
//        char[] arr = str.toCharArray();
//        int left = 0;
//        int right = arr.length - 1;
//        while (left < right) {
//            if (arr[left] != arr[right]) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//}