

// 排序子序列
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            // 多初始化一个是为了防止数组越界
//            int[] arr = new int[n + 1];
//            for (int i = 0; i < n; i++) {
//                arr[i] = in.nextInt();
//            }
//            // 用 long 防止溢出
//            int ret = getCount(arr, n);
//            System.out.println(ret);
//        }
//    }
//
//    public static int getCount(int[] arr, int n) {
//        int count = 0;
//        int i = 0;
//        while (i < n) {
//            if (arr[i] < arr[i + 1]) {
//                while (i < n - 1 && arr[i] < arr[i + 1]) {
//                    i++;
//                }
//                count++;
//                i++;
//            }else if (arr[i] > arr[i + 1]) {
//                while (i < n - 1 && arr[i] > arr[i + 1]) {
//                    i++;
//                }
//                count++;
//                i++;
//            }else {
//                i++;
//            }
//        }
//        return count;
//    }
//}






