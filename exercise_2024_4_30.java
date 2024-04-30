


//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String a = in.nextLine();
//            String b = in.nextLine();
//            print(a, b);
//        }
//    }
//
//
//    public static void print(String a, String b) {
//        Map<Character, Integer> map1 = new HashMap<>();
//        Map<Character, Integer> map2 = new HashMap<>();
//        for (char x : a.toCharArray()) {
//            int len = map1.getOrDefault(x, 0);
//            map1.put(x, len + 1);
//        }
//        for (char x : b.toCharArray()) {
//            int len = map2.getOrDefault(x, 0);
//            map2.put(x, len + 1);
//        }
//        boolean flg = true;
//        for (char x : b.toCharArray()) {
//            int len2 = map2.getOrDefault(x, 0);
//            int len1 = map1.getOrDefault(x, 0);
//            if (len1 < len2) {
//                flg = false;
//                break;
//            }
//        }
//        if (flg) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}