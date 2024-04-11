
// 牛客网 HJ53 杨辉三角的变形
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            if (n < 3) {
//                System.out.println(-1);
//            } else {
//                n -= 2;
//                if (n % 4 == 1 || n % 4 == 3) {
//                    System.out.println(2);
//                } else if (n % 4 == 2) {
//                    System.out.println(3);
//                } else if (n % 4 == 0) {
//                    System.out.println(4);
//                }
//            }
//        }
//    }
//}