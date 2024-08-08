
// 牛客网 单词倒排
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
//    public static void print(String str) {
//        char[] arr = str.toCharArray();
//        // 先整句进行逆序，然后再每个单词都进行逆序
//        reverse(arr, 0, arr.length - 1);
//        int start = 0;
//        int len = arr.length;
//        while (start < len) {
//            // 先找到单词的首字母
//            while (start < len && !isApha(arr[start])) {
//                start++;
//            }
//            // 此时 start 一定是单词首字母
//            int end = start;
//            // 再找到该单词的最后一个字母
//            while (end < len && isApha(arr[end])) {
//                end++;
//            }
//            if (end >= len) {
//                // 越界了，先逆序再退出循环
//                reverse(arr, start, end - 1);
//                break;
//            }
//            // 如果代码来到这里说明 end - 1 一定是该单词的最后一个字母
//            // 逆序
//            reverse(arr, start, end - 1);
//            // 跳过这一串连续的间隔符
//            while (end < len && !isApha(arr[end])) {
//                end++;
//            }
//            if (end >= len) {
//                // 越界了，因为这里前面已经找到并逆序过一个单词了，
//                // 现在是跳过一连串的间隔符，如果直接就跳到了字符串末尾
//                // 说明从单词往后就全是间隔符，没有单词了(示例2)
//                // 所以不用再逆序，直接跳出循环即可
//                break;
//            }
//            // 来到这里说明 end 一定是下一个单词的首字母
//            start = end;
//        }
//
//        // 最后按题目要求输出即可
//        for (int i = 0; i < len; ) {
//            if (isApha(arr[i])) {
//                System.out.print(arr[i]);
//                i++;
//            } else {
//                System.out.print(' ');
//                // 然后跳过后面连续的间隔符
//                while (i < len && !isApha(arr[i])) {
//                    i++;
//                }
//            }
//        }
//        System.out.println();
//
//    }
//
//    public static boolean isApha(char c) {
//        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
//            return true;
//        }
//        return false;
//    }
//
//    public static void reverse(char[] arr, int left, int right) {
//        while (left < right) {
//            char tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//            left++;
//            right--;
//        }
//    }
//}


//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String str = in.nextLine();
//            StringBuilder s = new StringBuilder();
//            // 把所有的间隔符替换成空格
//            for (int i = 0; i < str.length(); i++) {
//                char c = str.charAt(i);
//                if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
//                    s.append(c);
//                } else {
//                    s.append(' ');
//                }
//            }
//            str = s.toString();
//            // 然后利用 split 切割函数来根据空格切割，
//            // 最后从后往前输出单词即可
//            String[] arr = str.split(" ");
//            for (int i = arr.length - 1; i >= 0; i--) {
//                if (i > 0) {
//                    System.out.print(arr[i] + " ");
//                } else {
//                    System.out.println(arr[i]);
//                }
//            }
//        }
//    }
//}