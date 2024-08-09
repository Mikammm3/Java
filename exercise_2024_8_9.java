
// 牛客网 查找兄弟单词
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            String[] words = new String[n];
//            for (int i = 0; i < words.length; i++) {
//                words[i] = in.next();
//            }
//            String x = in.next();
//            int k = in.nextInt();
//            getKthBroWord(words, x, k, n);
//        }
//    }
//
//
//    // 查找第 K 个兄弟单词
//    public static void getKthBroWord(String[] words, String x, int k, int n) {
//        int count = 0;
//        String ans = null;
//        // 要按照字典序排序后输出第 K 个兄弟单词
//        Arrays.sort(words);
//        for (int i = 0; i < words.length; i++) {
//            String str = words[i];
//            if (isBroWord(str, x)) {
//                count++;
//                // 如果兄弟单词此时是第 K 个，那就记录一下
//                if (count == k) {
//                    ans = str;
//                }
//            }
//        }
//
//        System.out.println(count);
//        // 如果兄弟单词数量没达到 k，就不输出
//        if (count >= k) {
//            System.out.println(ans);
//        }
//    }
//
//    // 判断是否为兄弟单词
//    public static boolean isBroWord(String str, String x) {
//        // 如果两字符串长度不相同，或者两字符串内容相同
//        // 或者两字符串中的每种字符个数不同，则不是兄弟单词
//        if (str.length() != x.length()) {
//            return false;
//        } else if (str.equals(x)) {
//            return false;
//        } else {
//            // 要判断每种字符是否相同
//            // 可以直接分别排序两个字符串，然后看看其内容是否相同即可
//            char[] arr1 = str.toCharArray();
//            char[] arr2 = x.toCharArray();
//            Arrays.sort(arr1);
//            Arrays.sort(arr2);
//            return new String(arr1).equals(new String(arr2));
//        }
//    }
//}