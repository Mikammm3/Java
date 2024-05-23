

// 牛客网 客似云来
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        long[] fib = new long[81];
//        fib[1] = 1;
//        fib[2] = 1;
//        for (int i = 3; i < fib.length; i++) {
//            fib[i] = fib[i - 1] + fib[i - 2];
//        }
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int from = in.nextInt();
//            int to = in.nextInt();
//            long sum = 0;
//            for (int i = from; i <= to; i++) {
//                sum += fib[i];
//            }
//            System.out.println(sum);
//        }
//    }
//}