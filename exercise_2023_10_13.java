

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
//
//    public static void print(int n) {
//        int min = 10000;
//        int a = 0;
//        int b = 0;
//        for (int i = 2; i < n - 1; i++) {
//            if (isSushu(i)) {
//                // 是素数
//                int j = n - i;
//                // int tmp = Math.abs(i-j);
//                if (isSushu(j)) {
//                    if (Math.abs(i - j) < min) {
//                        if (i < j) {
//                            a = i;
//                            b = j;
//                        } else {
//                            a = j;
//                            b = i;
//                        }
//                        min = Math.abs(i - j);
//                    }
//                }
//            }
//        }
//        System.out.println(a);
//        System.out.println(b);
//    }
//
//    public static boolean isSushu(int n) {
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}


//import java.util.*;
//
//public class BinInsert {
//    public int binInsert(int n, int m, int j, int i) {
//        StringBuffer stringBuffer1 = new StringBuffer();
//        int tmp = m;
//        while (tmp != 0) {
//            stringBuffer1.append((tmp % 2) + "");
//            tmp /= 2;
//        }
//
//        stringBuffer1.reverse();
//        // 得到 m 的二进制
//        tmp = n;
//        StringBuffer stringBuffer2 = new StringBuffer();
//        while (tmp != 0) {
//            stringBuffer2.append((tmp % 2) + "");
//            tmp /= 2;
//        }
//        stringBuffer2.reverse();
//        // 得到 n 的二进制
//        int z = 0;
//        for (int k = stringBuffer2.length() - i - 1;
//             k < Math.abs(i - j) + 1 + stringBuffer2.length() - i - 1; k++) {
//            if (z < stringBuffer1.length()) {
//                char c = stringBuffer1.charAt(z++);
//                stringBuffer2.setCharAt(k, c);
//            }
//        }
//        tmp = 1;
//        int ret = 0;
//        for (int k = stringBuffer2.length() - 1; k >= 0; k--) {
//            int c = stringBuffer2.charAt(k) - '0';
//            ret += c * tmp;
//            tmp *= 2;
//        }
//        return ret;
//    }
//}