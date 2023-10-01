


// 牛客网 BM22 比较版本号
//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     * <p>
//     * 比较版本号
//     *
//     * @param version1 string字符串
//     * @param version2 string字符串
//     * @return int整型
//     */
//    public int compare(String version1, String version2) {
//        int len1 = version1.length();
//        int len2 = version2.length();
//        int i = 0;
//        int j = 0;
//        while (i < len1 || j < len2) {
//            long n1 = 0;
//            while (i < len1 && version1.charAt(i) != '.') {
//                n1 = n1 * 10 + (version1.charAt(i) - '0');
//                i++;
//            }
//            i++;
//            long n2 = 0;
//            while (j < len2 && version2.charAt(j) != '.') {
//                n2 = n2 * 10 + (version2.charAt(j) - '0');
//                j++;
//            }
//            j++;
//            if (n1 > n2) {
//                return 1;
//            }
//            if (n1 < n2) {
//                return -1;
//            }
//        }
//        return 0;
//    }
//}