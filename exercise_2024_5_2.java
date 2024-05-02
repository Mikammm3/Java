//
//
//
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int a = in.nextInt();
//            int b = in.nextInt();
//            getCount(a, b);
//        }
//    }
//
//
//    public static void getCount(int a, int b) {
//        int count = 0;
//        for (int i = a; i <= b; i++) {
//            if (i < 10) {
//                continue;
//            }
//            String tmp = i + "";
//            // 99999
//            for (int j = 0; j < tmp.length(); j++) {
//                boolean flg = false;
//                for (int k = j + 1; k < tmp.length(); k++) {
//                    if (isMagicNum(tmp.charAt(j), tmp.charAt(k)) ||
//                            isMagicNum(tmp.charAt(k), tmp.charAt(j))) {
//                        count++;
//                        // System.out.println(tmp);
//                        flg = true;
//                        break;
//                    }
//                }
//                if (flg) {
//                    break;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//
//    public static boolean isMagicNum(char a, char b) {
//        if (a == '0') return false;
//        String s = a + "" + b;
//        int n = Integer.valueOf(s);
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//
//}