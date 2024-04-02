

// 牛客网 计算糖果
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int x = in.nextInt();
//            int y = in.nextInt();
//            int z = in.nextInt();
//            int k = in.nextInt();
//            int a = (x + z) / 2;
//            int b1 = (y + k) / 2;
//            int b2 = (z - x) / 2;
//            int c = (k - y) / 2;
//            // 存在结果, 并且只有一种情况
//            if (a >= 0 && b1 >= 0 && b1 == b2 && c >= 0) {
//                System.out.printf("%d %d %d\n", a, b1, c);
//            } else {
//                System.out.printf("No\n");
//            }
//        }
//    }
//}


// 牛客网 DD5 进制转换
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int m = in.nextInt();
//            int n = in.nextInt();
//            String str = get(m, n);
//            System.out.println(str);
//        }
//    }
//
//    public static String get(int m, int n) {
//        // 特殊情况特殊处理
//        if (m == 0 || n == 10) return String.valueOf(m);
//        char[] hash = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',};
//        StringBuilder ret = new StringBuilder();
//        boolean flg = false;
//        if (m < 0) {
//            flg = true;
//            m = -m;
//        }
//        while (m != 0) {
//            int i = m % n;
//            ret.append(hash[i]);
//            m /= n;
//        }
//        if (flg) {
//            ret.append("-");
//        }
//        ret.reverse();
//        return ret.toString();
//    }
//}