import java.util.Scanner;

public class exercise_2023_4_28 {
    public static void main(String[] args) {

    }
}


//PTA L1-069 胎压监测
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int[] arr = new int[4];
//        int max = 0;
//        for (int i = 0; i < 4; i++) {
//            arr[i] = scan.nextInt();
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        int mintaiya = scan.nextInt();
//        int fazhi = scan.nextInt();
//        int count = 0;
//        int pos = -1;
//        for (int i = 0; i < 4; i++) {
//            if ((max - arr[i]) > fazhi || arr[i] < mintaiya) {
//                count++;
//                pos = i;
//            }
//        }
//        if (count >= 2) {
//            System.out.println("Warning: please check all the tires!");
//        } else if (count == 1) {
//            System.out.printf("Warning: please check #%d!\n", pos + 1);
//        } else {
//            System.out.println("Normal");
//        }
//        scan.close();
//    }
//}


//PTA L1-073 人与神
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("To iterate is human, to recurse divine.");
//    }
//}


//PTA L1-074 两小时学完C语言
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        int K = scan.nextInt();
//        int M = scan.nextInt();
//        System.out.println(N - K * M);
//        scan.close();
//    }
//}