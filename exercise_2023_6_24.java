
//牛客网 JZ3 数组中重复的数字
//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param numbers int整型一维数组
//     * @return int整型
//     */
//    public int duplicate(int[] numbers) {
//        int sz = numbers.length;
//        int[] arr = new int[sz];
//        for (int i = 0; i < sz; i++) {
//            int tmp = numbers[i];
//            arr[tmp]++;
//            if (arr[tmp] > 1) {
//                return tmp;
//            }
//        }
//        return -1;
//    }
//}