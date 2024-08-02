


// 牛客网 字符串计数
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
//            int len1 = in.nextInt();
//            int len2 = in.nextInt();
//            print(s1, s2, len1, len2);
//        }
//    }
//
//
//    public static void print(String s1, String s2, int len1, int len2) {
//        // 可以将字符串看做 26 进制的数字。
//        // 这样问题就转化为了，求满足 s1 < x < s2，的 x 有多少个。
//        // 假设 s1 是 21，s2 是 32，则 x 有 32 - 21 - 1 = 10 个
//        // 也就是说，当长度为 2 的，并且在 s1 和 s2 之间的个数有 10 个
//        // 类比一下，a ~ z 是 26 个字母，也就是 26 进制，
//        // 将每个字母的差 * 对应的 26 的 n 次方，将其转化为 10 进制，就是结果
//        // 让 s1 和 s2 长度相等，补位补到 len2
//        // s1 补 a，s2 补 (z+1)
//        // 然后需要将 s2 和 s1 所对应的字符相减，并记录下来
//        // 再从 26 进制转化为 10 进制，既是最后的结果
//
//        // 如果 s1 不够 len2 位或者 s2 不够 len2 位，就需要补位
//        // s1 补 a，s2 补 (char)('z'+1)
//        while (s1.length() < len2 || s2.length() < len2) {
//            if (s1.length() < len2) {
//                s1 += 'a';
//                s2 += (char) ('z' + 1);
//            }
//        }
//
//        // 记录结果
//        long result = 0;
//
//        // 先将 s2 和 s1 的每个对应字符的差值存入 arr 中
//        long[] arr = new long[len2];
//        for (int i = 0; i < len2; i++) {
//            char c1 = s1.charAt(i);
//            char c2 = s2.charAt(i);
//            arr[i] = c2 - c1;
//        }
//
//        // 然后再来计算每个长度有多少个
//        for (int i = len1; i <= len2; i++) {
//            // 然后再来计算, 将 26 进制转化为 10 进制
//            for (int j = 0; j < i; j++) {
//                // 计算当长度为 i 时， x 的取值范围
//                long tmp = tmp = arr[j] * (long) Math.pow(26, i - j - 1);
//                result += tmp;
//
//            }
//        }
//
//        System.out.println((result - 1) % 1000007);
//    }
//}