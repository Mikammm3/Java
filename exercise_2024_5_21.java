//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int year1 = in.nextInt();
//            int month1 = in.nextInt();
//            int day1 = in.nextInt();
//            int year2 = in.nextInt();
//            int month2 = in.nextInt();
//            int day2 = in.nextInt();
//
//            // 先计算 year1 剩下的部分
//            int profit = profitOfYear(year1) - profitOfThisYear(year1, month1, day1 - 1);
//            // 再计算 year2 的部分
//            profit += profitOfThisYear(year2, month2, day2);
//            // 如果是同一年，则说明需要特殊处理
//            if (year1 == year2) {
//                profit -= profitOfYear(year1);
//            }
//            // 再计算 year1 + 1 到 year2 - 1 的年份收益
//            for (int y = year1 + 1; y < year2; y++) {
//                profit += profitOfYear(y);
//            }
//            System.out.println(profit);
//        }
//    }
//
//    // 计算某年的全年收益
//    public static int profitOfYear(int year) {
//        return 2 * 31
//                + 1 * 28
//                + 1 * 31
//                + 2 * 30
//                + 1 * 31
//                + 2 * 30
//                + 1 * 31
//                + 2 * 31
//                + 2 * 30
//                + 2 * 31
//                + 1 * 30
//                + 2 * 31
//                + (isLeapYear(year) ? 1 : 0);
//    }
//
//    // 判断是否是闰年
//    public static boolean isLeapYear(int year) {
//        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//            return true;
//        }
//        return false;
//    }
//
//    // 判断范围为 [1,12] 的 n 是否是素数
//    public static boolean isPrime(int n) {
//        if (n == 2 || n == 3 || n == 5 || n == 7 || n == 11) {
//            return true;
//        }
//        return false;
//    }
//
//    // 计算从 year 的 1 月 1 日到 year 的 month 月 day 日的收益
//    public static int profitOfThisYear(int year, int month, int day) {
//        int profit = 0;
//        if (!isPrime(month)) {
//            profit += 2 * day;
//        } else {
//            profit += day;
//        }
//        // 闰年的情况
//        if (isLeapYear(year) && month > 2) profit += 1;
//        for (int i = 1; i < month; i++) {
//            switch (i) {
//                case 1:
//                case 8:
//                case 10:
//                case 12:
//                    profit += 2 * 31;
//                    break;
//                case 2:
//                    profit += 1 * 28;
//                    break;
//                case 3:
//                case 5:
//                case 7:
//                    profit += 1 * 31;
//                    break;
//                case 4:
//                case 6:
//                case 9:
//                    profit += 2 * 30;
//                    break;
//                case 11:
//                    profit += 1 * 30;
//                    break;
//            }
//        }
//        return profit;
//    }
//}