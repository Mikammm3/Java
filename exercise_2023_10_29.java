


//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int[] arr = new int[n];
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = in.nextInt();
//                print(n, arr[i]);
//            }
//            System.out.println();
//        }
//    }
//
//
//    public static void print(int n, int x) {
//        int tmp = (int) Math.pow(x, n);
//        int len = 0;
//        int c = x;
//        while (c != 0) {
//            len++;
//            c /= 10;
//        }
//        StringBuilder s = new StringBuilder();
//        while (tmp != 0) {
//            s.append((tmp % 2));
//            tmp /= 2;
//        }
//        s = s.reverse();
//        String ss = s.toString();
//        // String cur = "";
//        int t = 0;
//        for (int i = 0; i < len; i++) {
//            char ch = ss.charAt(i);
//            t = t * 2 + ch - '0';
//        }
//        tmp = t;
//        len = 0;
//        while (tmp != 0) {
//            len++;
//            tmp /= 10;
//        }
//        if (len < 4) {
//            int cha = 4 - len;
//            for (int i = 0; i < cha; i++) {
//                System.out.print(0);
//            }
//            System.out.print(t);
//        } else {
//            tmp = t;
//            int i = 0;
//            int ret = 0;
//            while (i < 4) {
//                ret = (int) (ret * 10 + tmp % 10);
//                i++;
//                tmp /= 10;
//            }
//            System.out.print(ret);
//        }
//    }
//
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
//            //System.out.println(ans);
//        }
//    }
//
//    public static void print(int n) {
//        int ret = 0;
//        while (n != 0) {
//            ret += n % 10;
//            n /= 10;
//        }
//        if (ret < 10) {
//            System.out.println(ret);
//        } else {
//            System.out.println(ret % 10 + 1);
//        }
//    }
//}