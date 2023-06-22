

//牛客网 AB34 跳台阶
//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param number int整型
//     * @return int整型
//     */
//    public int jumpFloor(int number) {
//        if (number <= 2) {
//            return number;
//        } else {
//            return jumpFloor(number - 1) + jumpFloor(number - 2);
//        }
//    }
//}