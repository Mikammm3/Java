


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextDouble()) { // 注意 while 处理多个 case
//            double a = in.nextDouble();
//            double b = in.nextDouble();
//            double c = a / b;
//            if (c > 6.28) {
//                System.out.println("No");
//            } else {
//                System.out.println("Yes");
//            }
//        }
//    }
//}


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
//
//    //
//    public int jumpFloorII(int number) {
//        if (number == 1 || number == 2) {
//            return number;
//        } else {
//            return jumpFloorII(number - 1) + jumpFloorII(number - 2) + 1;
//        }
//    }
//}