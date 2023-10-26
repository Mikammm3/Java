

//import java.util.*;
//
//public class Gift {
//    public int getValue(int[] gifts, int n) {
//        Arrays.sort(gifts);
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (gifts[i] == gifts[n / 2]) {
//                count++;
//            }
//        }
//        if (count > n / 2) {
//            return gifts[n / 2];
//        } else {
//            return 0;
//        }
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
//
//            print(s1, s2);
//        }
//    }
//
//
//    public static void print(String s1, String s2) {
//        // int count = 0;
//        // int i = 0;
//        // int j = 0;
//        // int len1 = s1.length();
//        // int len2 = s2.length();
//        // while (i < len1 && j < len2) {
//        //     while (i < len1 && j < len2 && s1.charAt(i) == s2.charAt(j)) {
//        //         i++;
//        //         j++;
//        //     }
//        //     if (i >= len1 && j >= len2) {
//        //         break;
//        //     } else if (i >= len1) {
//        //         count += len2 - j;
//        //     } else if (j >= len2) {
//        //         count += len1 - i;
//        //     } else {
//        //         while (i < len1 && j < len2 && s1.charAt(i) != s2.charAt(j)) {
//        //             count++;
//        //             if (len1 >= len2) {
//        //                 i++;
//        //             } else {
//        //                 j++;
//        //             }
//        //         }
//        //         if (i >= len1 && j >= len2) {
//        //             break;
//        //         } else if (i >= len1) {
//        //             count += len2 - j;
//        //         } else if (j >= len2) {
//        //             count += len1 - i;
//        //         }
//        //     }
//        // }
//        // System.out.println(count);
//
//
//        String l = s1;
//        String s = s2;
//        if (s2.length() > s2.length()) {
//            l = s2;
//            s = s1;
//        }
//        StringBuilder ret = new StringBuilder(l);
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < ret.length(); j++) {
//                if (s1.charAt(i) == ret.charAt(j)) {
//                    ret = ret.deleteCharAt(j);
//                    break;
//                }
//            }
//        }
//        System.out.println(ret.length());
//    }
//}