


//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param numbers int整型一维数组
//     * @return bool布尔型
//     */
//    public boolean IsContinuous(int[] numbers) {
//        // write code here
//        // Arrays.sort(numbers);
//        int[] arr = new int[14];
//        int zero = 0;
//        for (int x : numbers) {
//            if (x == 0) zero++;
//            arr[x]++;
//        }
//        if (zero == 4) return true;
//        boolean flg = true;
//        int start = -1;
//        for (int i = 1; i < 14; i++) {
//            if (arr[i] >= 1) {
//                start = i;
//                break;
//            }
//        }
//        System.out.println(start);
//        if (start > 9 || start == -1) {
//            return false;
//        }
//        for (int j = start; j < start + 5 && j < arr.length; j++) {
//            if (arr[j] < 1) {
//                if (zero > 0) {
//                    zero--;
//                } else {
//                    flg = false;
//                    return flg;
//                }
//            }
//        }
//        return flg;
//    }
//}