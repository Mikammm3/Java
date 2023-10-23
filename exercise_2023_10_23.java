

//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNext()) { // 注意 while 处理多个 case
//            String str = in.next();
//            print(str);
//        }
//    }
//
//
//    public static void print(String str) {
//        int left = 0;
//        int right = str.length() - 1;
//        char[] arr = str.toCharArray();
//        while (left < right) {
//            char tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//            left++;
//            right--;
//        }
//        String ret = new String(arr);
//        System.out.println(ret);
//    }
//}


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        String s1 = in.next();
//        String s2 = in.next();
//        print(s1, s2);
//    }
//
//
//    public static void print(String s1, String s2) {
//        int count = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            int k = i;
//            int j = 0;
//            while (k < s1.length()) {
//                int cur = 0;
//                while (j < s2.length() && s2.charAt(j) != s1.charAt(k)) {
//                    j++;
//                }
//                if (j >= s2.length()) {
//                    if (cur > count) {
//                        count = cur;
//                    }
//                    break;
//                } else {
//                    while (k < s1.length() && j < s2.length() && s1.charAt(k) == s2.charAt(j)) {
//                        cur++;
//                        k++;
//                        j++;
//                    }
//                    if (cur > count) {
//                        count = cur;
//                    }
//                    if (k >= s1.length() || j >= s2.length()) {
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}