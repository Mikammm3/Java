

//牛客网 BM52 数组中只出现一次的两个数字
//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param array int整型一维数组
//     * @return int整型一维数组
//     */
//    public int[] FindNumsAppearOnce(int[] array) {
//        int ret = 0;
//        for (int i = 0; i < array.length; i++) {
//            ret ^= array[i];
//        }
//        int pos = -1;
//        for (int i = 0; i < 32; i++) {
//            if (((ret >> i) & 1) == 1) {
//                pos = i;
//                break;
//            }
//        }
//        int[] ans = new int[2];
//        for (int i = 0; i < array.length; i++) {
//            if (((array[i] >> pos) & 1) == 0) {
//                ans[0] ^= array[i];
//            }
//            if (((array[i] >> pos) & 1) == 1) {
//                ans[1] ^= array[i];
//            }
//        }
//        Arrays.sort(ans);
//        return ans;
//    }
//}