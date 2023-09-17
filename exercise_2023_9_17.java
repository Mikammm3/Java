
// 牛客网 JZ21 调整数组顺序使奇数位于偶数前面(一)
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
//    public int[] reOrderArray(int[] array) {
//        int[] nums = new int[array.length];
//        int j = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 1) {
//                nums[j++] = array[i];
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                nums[j++] = array[i];
//            }
//        }
//        return nums;
//    }
//}


// 牛客网 JZ21 调整数组顺序使奇数位于偶数前面(一)
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
//    public int[] reOrderArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            // 遇到奇数就往前插入
//            if (array[i] % 2 == 1 && i != 0) {
//                int tmp = array[i];// 奇数
//                int j = i;
//                // 遇到偶数，奇数就往前插
//                for (; j > 0 && array[j - 1] % 2 == 0; j--) {
//                    array[j] = array[j - 1];// 偶数往后挪
//                }
//                array[j] = tmp;// 奇数就往前插
//            }
//        }
//        return array;
//    }
//}