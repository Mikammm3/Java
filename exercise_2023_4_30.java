import java.util.Scanner;

public class exercise_2023_4_30 {
    public static void main(String[] args) {

    }
}


//PTA L1-071 前世档案
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        int M = scan.nextInt();
//        scan.nextLine();
//        for (int i = 0; i < M; i++) {
//            char[] ch = scan.nextLine().toCharArray();
//            int k = 1;
//            for (int j = 0; j < ch.length; j++) {
//                if (ch[j] == 'y') {
//                    k *= 2;
//                } else {
//                    k = k * 2 + 1;
//                }
//            }
//            System.out.println((int) (k - (Math.pow(2, N) - 1)));
//        }
//    }
//}


//PTA L1-075 强迫症
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        char[] arr = scan.nextLine().toCharArray();
//        if (arr.length == 6) {
//            for (int i = 0; i < arr.length; i++) {
//                if (i == 4) {
//                    System.out.print("-");
//                }
//                System.out.print(arr[i]);
//            }
//        } else {
//            int ret = (int) (arr[0] - '0') * 10 + (int) (arr[1] - '0');
//            if (ret < 22) {
//                System.out.print("20");
//                for (int i = 0; i < arr.length; i++) {
//                    if (i == 2) {
//                        System.out.print("-");
//                    }
//                    System.out.print(arr[i]);
//                }
//            } else {
//                System.out.print("19");
//                for (int i = 0; i < arr.length; i++) {
//                    if (i == 2) {
//                        System.out.print("-");
//                    }
//                    System.out.print(arr[i]);
//                }
//            }
//        }
//    }
//}