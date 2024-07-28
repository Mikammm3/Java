
// 牛客网 数据库连接池
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            in.nextLine();
//            Set<Character> set = new HashSet<>();
//            int count = 0;
//            for (int i = 0; i < n; i++) {
//                String str = in.nextLine();
//                char c = str.charAt(0);
//                if (set.contains(c)) {
//                    set.remove(c);
//                } else {
//                    set.add(c);
//                    if (set.size() > count) {
//                        count = set.size();
//                    }
//                }
//            }
//            System.out.println(count);
//        }
//    }
//}