

//牛客网 AB5 点击消除
//import java.util.*;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String str = in.nextLine();
//            print(str);
//        }
//    }
//
//    private static void print(String str) {
//        int index = -1;
//        int i = 0;
//        char[] arr = new char[str.length()];
//        while (i < str.length()) {
//            if (index < 0) {
//                arr[++index] = str.charAt(i++);
//            } else {
//                if (arr[index] == str.charAt(i)) {
//                    index--;
//                    i++;
//                } else {
//                    arr[++index] = str.charAt(i++);
//                }
//            }
//        }
//        if (index == -1) {
//            System.out.print(0);
//        }
//        for (int j = 0; j <= index; j++) {
//            System.out.print(arr[j]);
//        }
//    }
//}


//牛客网 NC228 判断子序列
//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param S string字符串
//     * @param T string字符串
//     * @return bool布尔型
//     */
//    public boolean isSubsequence(String S, String T) {
//        int i = 0;
//        int j = 0;
//        int lenS = S.length();
//        int lenT = T.length();
//        while (i < lenS && j < lenT) {
//            char c1 = S.charAt(i);
//            char c2 = T.charAt(j);
//            if (c1 == c2) {
//                i++;
//                j++;
//            } else {
//                j++;
//            }
//        }
//        return i == lenS;
//    }
//}