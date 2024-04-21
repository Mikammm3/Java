


//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String str = in.nextLine();
//            print(str);
//        }
//    }
//
//
//    public static void print(String str) {
//        str = str.toLowerCase();
//        int count = 0;
//        String ans = "";
//        int i = 0;
//        int len = str.length();
//        while (i < len) {
//            while (i < len && str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
//                i++;
//            }
//            String tmp = "";
//            while (i < len && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//                tmp += str.charAt(i);
//                i++;
//            }
//            if (tmp.length() > ans.length()) {
//                ans = new String(tmp);
//                // System.out.println(tmp);
//            }
//            i++;
//        }
//        System.out.println(ans);
//    }
//}