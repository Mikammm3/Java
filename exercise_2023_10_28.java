
// 牛客网 无穷大二叉树的最近公共祖先
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int a = in.nextInt();
//            int b = in.nextInt();
//            print(a, b);
//        }
//    }
//
//
//    public static void print(int a, int b) {
//        while (a != b) {
//            if (a > b) {
//                a /= 2;
//            } else {
//                b /= 2;
//            }
//        }
//        System.out.println(a);
//    }
//}