
// 倒置字符串
//import java.util.Scanner;
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
//    public static void print(String str) {
//        char[] s = str.toCharArray();
//        // 先逆置整个字符串
//        reverse(s, 0, s.length - 1);
//        // 再分别逆置每个单词
//        int i = 0;
//        int len = s.length;
//        while (i < len) {
//            int j = i;//从这里结束
//            while (j < len && s[j] != ' ') {
//                j++;
//            }
//            // j 为空格且没到字符串最后
//            if (j < len) {
//                reverse(s, i, j - 1);
//                i = j + 1;
//                j++;
//            } else {
//                reverse(s, i, j - 1);
//                break;
//            }
//        }
//        String s2 = new String(s);
//        System.out.println(s2);
//    }
//
//    public static void reverse(char[] str, int left, int right) {
//        while (left < right) {
//            char ret = str[left];
//            str[left] = str[right];
//            str[right] = ret;
//            left++;
//            right--;
//        }
//    }
//}