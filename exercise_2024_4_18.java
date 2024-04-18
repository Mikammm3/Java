

//import java.util.*;
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
//    public static void print(int y) {
//        // 第一个节日
//        System.out.println(y + "-01-01");
//        // 找到 1 月 1 日是周几，然后根据公式计算
//        // 1月的第三个星期一
//        int w = getWeekDay(y, 1, 1);
//        int d = getDays(3, w, 1);
//        System.out.printf("%04d-%02d-%02d\n", y, 1, d);
//
//        //  2月的第三个星期一
//        w = getWeekDay(y, 2, 1);
//        d = getDays(3, w, 1);
//        System.out.printf("%04d-%02d-%02d\n", y, 2, d);
//
//        // 5月的最后一个星期一：阵亡将士纪念日
//        // 将 6 月 1 日看作是 5 月 32 号，
//        w = getWeekDay(y, 6, 1);
//        int t = ((w == 1) ? 7 : (w - 1));
//        d = 32 - t;
//        System.out.printf("%04d-%02d-%02d\n", y, 5, d);
//
//        // 7月4日：美国国庆
//        System.out.printf("%04d-%02d-%02d\n", y, 7, 4);
//
//        //   9月的第一个星期一
//        w = getWeekDay(y, 9, 1);
//        d = getDays(1, w, 1);
//        System.out.printf("%04d-%02d-%02d\n", y, 9, d);
//
//        // 11月的第四个星期四：感恩节
//        w = getWeekDay(y, 11, 1);
//        d = getDays(4, w, 4);
//        System.out.printf("%04d-%02d-%02d\n", y, 11, d);
//
//        // 12月25日：圣诞节
//        System.out.printf("%04d-%02d-%02d\n", y, 12, 25);
//
//        System.out.println();
//
//    }
//
//    // n: 找第几个星期
//    // w: 1 号是星期几
//    // e: 找星期几
//    public static int getDays(int n, int w, int e) {
//        return 1 + (n - 1) * 7 + (7 - w + e) % 7;
//    }
//
//    public static int getWeekDay(int y, int m, int d) {
//        int days = (y - 1) + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
//        int[] hash = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        for (int i = 1; i < m; i++) {
//            days += hash[i];
//        }
//        if (isLeapYear(y) && m > 2) {
//            days++;
//        }
//        days += d;
//        return days % 7;
//    }
//
//    public static boolean isLeapYear(int y) {
//        return ((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0);
//    }
//}