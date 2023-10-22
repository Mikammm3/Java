

//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            if (n == 0) {
//                break;
//            }
//            print(n);
//        }
//    }
//
//
//    public static void print(int n) {
//        int count = n / 2;
//        System.out.println(count);
//    }
//}


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNext()) { // 注意 while 处理多个 case
//            String s1 = in.next();
//            String s2 = in.next();
//            print(s1, s2);
//        }
//    }
//
//
//    public static void print(String s1, String s2) {
//        String sL = s1;
//        String sS = s2;
//        if (s1.length() < s2.length()) {
//            sL = s2;
//            sS = s1;
//        }
//        String ret = "";
//        int lenL = sL.length();
//        int lenS = sS.length();
//        for (int i = 0; i < lenS; i++) {
//            int j = 0;// 遍历长串
//            int k = i;// 遍历短串
//            String cur = "";
//            while (k < lenS) {
//                while (k < lenS && j < lenL && sS.charAt(k) != sL.charAt(j)) {
//                    j++;
//                }
//                if (j >= lenL) {
//                    break;
//                }
//                while (k < lenS && j < lenL && sS.charAt(k) == sL.charAt(j)) {
//                    cur += sS.charAt(k) + "";
//                    k++;
//                    j++;
//                }
//                if (cur.length() > ret.length()) {
//                    ret = new String(cur);
//                }
//                cur = "";
//                if (k >= lenS || j >= lenL) {
//                    break;
//                }
//            }
//        }
//        System.out.println(ret);
//    }
//}