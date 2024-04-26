//
//
//
//
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
//
//    public static void print(String str) {
//        char[] arr = str.toCharArray();
//        reverse(0, arr.length - 1, arr);
//        int start = 0;
//        int len = arr.length;
//        while (start < len) {
//            int end = start;
//            while (end < len && arr[end] != ' ') {
//                end++;
//            }
//            if (end >= len) {
//                reverse(start, end - 1, arr);
//                break;
//            }
//            reverse(start, end - 1, arr);
//            end++;
//            start = end;
//        }
//        for (char c : arr) {
//            System.out.print(c);
//        }
//        System.out.println();
//    }
//
//
//    public static void reverse(int left, int right, char[] arr) {
//        while (left < right) {
//            char tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//            left++;
//            right--;
//        }
//    }
//}

