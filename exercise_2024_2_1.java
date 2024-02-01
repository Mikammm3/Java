


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
//        char[] hash1 = new char[26];// A
//        char[] hash2 = new char[26];// B
//        for (char c : s1.toCharArray()) {
//            hash1[c - 'A']++;
//        }
//        for (char c : s2.toCharArray()) {
//            hash2[c - 'A']++;
//        }
//        boolean flg = true;// 假设yes
//        for (int i = 0; i < 26; i++) {
//            int a = hash1[i];
//            int b = hash2[i];
//            if ((b != 0 && a == 0) || (b > a)) {
//                flg = false;
//                break;
//            }
//        }
//        System.out.println(((flg == true) ? "Yes" : "No"));
//    }
//}