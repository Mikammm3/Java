

//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            String[] str = new String[n];
//            for (int i = 0; i < n; i++) {
//                str[i] = in.next();
//            }
//            print(str, n);
//        }
//    }
//
//    public static void print(String[] str, int n) {
//        String[] hash = {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
//        Set<String> set = new TreeSet<>();
//        for (int i = 0; i < n; i++) {
//            StringBuilder tmp = new StringBuilder();
//            for (int j = 0; j < str[i].length(); j++) {
//                if (tmp.length() == 3) tmp.append("-");
//                char c = str[i].charAt(j);
//                if (c >= '0' && c <= '9') tmp.append(c);
//                else if (c >= 'A' && c <= 'z') {
//                    for (int k = 2; k < hash.length; k++) {
//                        if (hash[k].contains(c + "")) {
//                            tmp.append(k);
//                            break;
//                        }
//                    }
//                }
//
//            }
//            set.add(tmp.toString());
//        }
//        String s = set.toString();
//        s = s.substring(1, s.length() - 1);
//        String[] x = s.split(",");
//        for (String t : x) {
//            for (char c : t.toCharArray()) {
//                if ((c >= '0' && c <= '9') || c == '-') {
//                    System.out.print(c);
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//    }
//}