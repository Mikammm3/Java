


// 牛客网 斐波那契凤尾
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        long[] hash = new long[100000];
//        hash[0] = 1;
//        hash[1] = 2;
//        int flg = -1;
//        for (int i = 2; i < hash.length; i++) {
//            hash[i] = hash[i - 1] + hash[i - 2];
//            if (flg == -1 && hash[i] >= 1000000) {
//                flg = i;
//            }
//            hash[i] %= 1000000;
//        }
//
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            if (n - 1 >= flg) {
//                System.out.printf("%06d\n", hash[n - 1]);
//            } else {
//                System.out.println(hash[n - 1]);
//            }
//        }
//    }
//
//
//}