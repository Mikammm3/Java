

//
//import java.util.*;
//
//public class Solution {
//    public int Add(int num1, int num2) {
//        return num1 + num2;
//    }
//}
//
//
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
//            double c = in.nextDouble();
//            if ((a - c + b > 0) && (a - b < c) && (a - b + c > 0) && (a - c < b) &&
//                    (b - a + c > 0) &&
//                    (b - c < a)) {
//                System.out.println("Yes");
//            } else {
//                System.out.println("No");
//            }
//        }
//    }
//}