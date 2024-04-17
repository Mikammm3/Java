
// 牛客网 求正数数组的最小不可组成和
//import java.util.*;
//
//
//public class Solution {
//
//    public int getFirstUnFormedNum(int[] arr) {
//        // 先找到子集和的范围
//        int min = Integer.MAX_VALUE;
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//            max += arr[i];
//        }
//        boolean[] flg = new boolean[max + 1];
//        flg[0] = true;// 空集
//        for (int i = 0; i < arr.length; i++) {
//            // 逆序判断
//            for (int j = max; j >= arr[i]; j--) {
//                if (flg[j - arr[i]] == true) {
//                    flg[j] = true;
//                }
//            }
//        }
//        for (int i = min; i <= max; i++) {
//            if (flg[i] == false) {
//                return i;
//            }
//        }
//
//        return max + 1;
//
//    }
//}