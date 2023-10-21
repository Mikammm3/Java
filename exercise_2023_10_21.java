

// 牛客网 HJ87 密码强度等级
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNext()) { // 注意 while 处理多个 case
//            String s = in.next();
//            print(s);
//        }
//    }
//
//
//    public static void print(String s) {
//        int score = 0;
//        if (s.length() <= 4) {
//            score += 5;
//        } else if (s.length() >= 8) {
//            score += 25;
//        } else {
//            score += 10;
//        }
//        int up = daxiezimu(s);
//        int low = xiaoxiezimu(s);
//        int num = number(s);
//        int fuhao = getFuhao(s);
//        if (up > 0 && low > 0 && num > 0 && fuhao > 0) {
//            score += 5;
//        } else if ((up > 0 || low > 0) && num > 0 && fuhao > 0) {
//            score += 3;
//        } else if ((up > 0 || low > 0) && num > 0) {
//            score += 2;
//        }
//
//        if (up > 0 && low > 0) {
//            score += 20;
//        } else if ((up > 0 && low == 0) || (low >= 0 && up == 0)) {
//            score += 10;
//        }
//
//        if (num > 1) {
//            score += 20;
//        } else if (num == 1) {
//            score += 10;
//        }
//
//        if (fuhao > 1) {
//            score += 25;
//        } else if (fuhao == 1) {
//            score += 10;
//        }
//
//
//        if (score >= 90) {
//            System.out.println("VERY_SECURE");
//        } else if (score >= 80) {
//            System.out.println("SECURE");
//
//        } else if (score >= 70) {
//            System.out.println("VERY_STRONG");
//        } else if (score >= 60) {
//            System.out.println("STRONG");
//
//        } else if (score >= 50) {
//            System.out.println("AVERAGE");
//
//        } else if (score >= 25) {
//            System.out.println("WEAK");
//
//        } else {
//            System.out.println("VERY_WEAK");
//        }
//    }
//
//
//    public static int daxiezimu(String s) {
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c >= 'A' && c <= 'Z') {
//                count++;
//            }
//        }
//        return count;
//    }
//
//
//    public static int getFuhao(String s) {
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if ((c >= '!' && c <= '/') || (c >= ':' && c <= '@') || (c >= '[' &&
//                    c <= '`') || (c >= '{' && c <= '~')) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int number(String s) {
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c >= '0' && c <= '9') {
//                count++;
//            }
//        }
//        return count;
//    }
//
//
//    public static int xiaoxiezimu(String s) {
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c >= 'a' && c <= 'z') {
//                count++;
//            }
//        }
//        return count;
//    }
//}