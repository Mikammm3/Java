

// 牛客网 星际密码
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//
//        int[] hash = new int[10001];
//        hash[1] = 1;
//        hash[2] = 2;
//
//        for (int i = 3; i < hash.length; i++) {
//            hash[i] = hash[i - 1] + hash[i - 2];
//            hash[i] = hash[i] % 10000;
//        }
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            for (int i = 0; i < n; i++) {
//                int x = in.nextInt();
//                System.out.printf("%04d", hash[x]);
//            }
//            System.out.println();
//        }
//    }
//}