

//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        double[] arr1 = new double[21];
//        arr1[0] = 0;
//        arr1[1] = 0;// 一封信不可能错排
//        arr1[2] = 1;
//        double[] arr2 = new double[21];
//        arr2[0] = arr2[1] = 1;
//        arr2[2] = 2;
//        for (int i = 3; i <= 20; i++) {
//            arr1[i] = (i - 1) * (arr1[i - 1] + arr1[i - 2]);
//            arr2[i] = i * arr2[i - 1];
//        }
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            System.out.printf("%.02f%%\n", arr1[n] * 100.0 / arr2[n]);
//        }
//    }
//}