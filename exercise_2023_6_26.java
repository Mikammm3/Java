

//牛客网 JZ5 替换空格
//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param s string字符串
//     * @return string字符串
//     */
//    public String replaceSpace(String s) {
//        String ans = "";
//        for (int i = 0; i < s.length(); i++) {
//            char tmp = s.charAt(i);
//            if (tmp == ' ') {
//                ans += "%20";
//            } else {
//                ans += tmp;
//            }
//        }
//        return ans;
//    }
//}