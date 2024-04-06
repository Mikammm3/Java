

// 牛客网 HJ87 密码强度等级
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String str = in.nextLine();
//            printScore(str);
//        }
//    }
//
//    public static void printScore(String str) {
//        int score = 0;
//        // 密码长度:
//        if (str.length() <= 4) {
//            score += 5;
//        } else if (str.length() >= 8) {
//            score += 25;
//        } else {
//            score += 10;
//        }
//
//        // 大写字母计数器
//        int A = 0;
//        // 小写字母计数器
//        int a = 0;
//        // 数字计数器
//        int n = 0;
//        // 符号计数器
//        int $ = 0;
//        for (char x : str.toCharArray()) {
//            if (x >= '0' && x <= '9') {
//                n++;
//            } else if (x >= 'a' && x <= 'z') {
//                a++;
//            } else if (x >= 'A' && x <= 'Z') {
//                A++;
//            } else {
//                $++;
//            }
//        }
//        // 字母:
//        if (A > 0 && a > 0) {
//            score += 20;
//        } else if (A > 0) {
//            score += 10;
//        } else if (a > 0) {
//            score += 10;
//        }
//
//        // 数字:
//        if (n > 1) {
//            score += 20;
//        } else if (n == 1) {
//            score += 10;
//        }
//
//        // 符号:
//        if ($ > 1) {
//            score += 25;
//        } else if ($ == 1) {
//            score += 10;
//        }
//
//        // 奖励:
//        if (A > 0 && a > 0 && n > 0 && $ > 0) {
//            score += 5;
//        } else if (A > 0 && n > 0 && $ > 0) {
//            score += 3;
//        } else if (a > 0 && n > 0 && $ > 0) {
//            score += 3;
//        } else if (a > 0 && n > 0) {
//            score += 2;
//        } else if (A > 0 && n > 0) {
//            score += 2;
//        }
//
//
//        // 最后的评分标准:
//        if (score >= 90) {
//            System.out.println("VERY_SECURE");
//        } else if (score >= 80) {
//            System.out.println("SECURE");
//        } else if (score >= 70) {
//            System.out.println("VERY_STRONG");
//        } else if (score >= 60) {
//            System.out.println("STRONG");
//        } else if (score >= 50) {
//            System.out.println("AVERAGE");
//        } else if (score >= 25) {
//            System.out.println("WEAK");
//        } else if (score >= 0) {
//            System.out.println("VERY_WEAK");
//        }
//
//    }
//}


// 牛客网 2. 走方格的方案数
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int m = in.nextInt();
//            int count = getRoadCount(n, m);
//            System.out.println(count);
//        }
//    }
//
//    public static int getRoadCount(int n, int m) {
//        if (n == 1 || m == 1) {
//            return n + m;
//        }
//        return getRoadCount(n, m - 1) + getRoadCount(n - 1, m);
//    }
//}