


//import java.util.*;
//
//public class LCA {
//    public int getLCA(int a, int b) {
//        // 1. 其中一个为根节点
//        if (a == 1 || b == 1) {
//            return 1;
//        }
//        // 2. a 和 b 在同一边
//        int ps = a;
//        int pl = b;
//        while (ps != pl) {
//            ps /= 2;
//            pl /= 2;
//            if (ps == 1 || pl == 1) {
//                break;
//            }
//            if (ps == pl) {
//                return ps;
//            }
//        }
//
//        ps = a;
//        pl = b;
//        if (a > b) {
//            pl = a;
//            ps = b;
//        }
//        while (pl != ps && pl != 1) {
//            pl /= 2;
//            if (pl == ps) {
//                return pl;
//            }
//        }
//        // 3. a 和 b 在树的左右两边
//        return 1;
//    }
//}


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            print(n);
//        }
//    }
//
//    public static void print(int n) {
//        int count = 0;
//        int maxCount = 0;
//        while (n != 0) {
//            int tmp = n % 2;
//            if (tmp == 1) {
//                count++;
//            } else {
//                if (count > maxCount) {
//                    maxCount = count;
//                }
//                count = 0;
//            }
//            n /= 2;
//        }
//        if (count > maxCount) {
//            maxCount = count;
//        }
//        System.out.println(maxCount);
//    }
//}