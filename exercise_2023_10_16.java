


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
//
//    }
//
//    public static void print(String str) {
//        char[] arr = str.toCharArray();
//        int year = 0;
//        int mon = 0;
//        int date = 0;
//        int i = 0;
//        int len = arr.length;
//        int count = 0;
//        while (i < len) {
//            int sum = 0;
//            while (i < len && arr[i] != ' ') {
//                sum = sum * 10 + arr[i] - '0';
//                i++;
//            }
//            if (count == 0) {
//                year = sum;
//            } else if (count == 1) {
//                mon = sum;
//            } else {
//                date = sum;
//            }
//            count++;
//            i++;
//            if (i >= len) {
//                break;
//            }
//        }
//        int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        int days = date;
//        for (i = 1; i < mon; i++) {
//            days += day[i];
//        }
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            if (mon > 2) {
//                days += 1;
//            }
//        }
//        System.out.println(days);
//
//    }
//}


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        print(arr);
//    }
//
//    public static void print(int[] arr) {
//        int count = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            int sum = 0;
//            int ji = 1;
//            for (int j = arr.length - i; j >= 0; j--) {
//                sum += arr[j];
//                ji *= arr[j];
//            }
//            if (sum > ji) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}