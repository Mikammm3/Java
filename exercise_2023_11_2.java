

//import java.util.*;
//
//public class Solution {
//    /**
//     * 正数数组中的最小不可组成和
//     * 输入：正数数组arr
//     * 返回：正数数组中的最小不可组成和
//     */
//    public int getFirstUnFormedNum(int[] arr) {
//        int min = arr[0];
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            max = getMax(max + arr[i], arr[i]);
//            min = getMin(min + arr[i], arr[i]);
//        }
//
//        System.out.println(min);
//        System.out.println(max);
//
//        int[] round = new int[max - min + 1];
//        round[0] = 1;
//        round[max - min] = 1;
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int num = arr[i];
//            if (num - min >= 0) {
//                round[num - min]++;
//            }
//            sum += num;
//            if (sum - min >= 0) {
//                round[sum - min]++;
//            }
//        }
//        for (int i = 0; i < round.length; i++) {
//            if (round[i] == 0) {
//                // System.out.println(i + min);
//                //return i + min;
//            }
//        }
//        return max + 1;
//    }
//
//    public static int getMax(int a, int b) {
//        return a > b ? a : b;
//    }
//
//    public static int getMin(int a, int b) {
//        return a < b ? a : b;
//    }
//}


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            if (n == 0) {
//                break;
//            }
//            print(n);
//        }
//    }
//
//    public static void print(int n) {
//        int count = 0;
//        while (n != 1) {
//            n /= 2;
//            count++;
//        }
//        System.out.println(count);
//    }
//}