

// 牛客网 BM83 字符串变形
//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param s string字符串
//     * @param n int整型
//     * @return string字符串
//     */
//    public String trans(String s, int n) {
//        char[] arr = s.toCharArray();
//        reverse(arr, 0, n - 1);
//        int i = 0;
//        while (i < n) {
//            int j = i;
//            while (j < n && arr[j] != ' ') {
//                j++;
//            }
//            if (j < n) {
//                reverse(arr, i, j - 1);
//                i = j + 1;
//            } else {
//                reverse(arr, i, j - 1);
//                break;
//            }
//        }
//        for (i = 0; i < arr.length; i++) {
//            if (arr[i] >= 'a' && arr[i] <= 'z') {
//                arr[i] = (char) (arr[i] - 32);
//                continue;
//            }
//            if (arr[i] >= 'A' && arr[i] <= 'Z') {
//                arr[i] = (char) (arr[i] + 32);
//            }
//        }
//        return new String(arr);
//    }
//
//    public void reverse(char[] arr, int left, int right) {
//        while (left < right) {
//            char tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//            left++;
//            right--;
//        }
//    }
//}