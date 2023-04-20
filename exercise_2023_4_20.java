//public class exercise_2023_4_20 {
//
//}


//L1-040 最佳情侣身高差
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        char sex = '0';
//        int n = scan.nextInt();
//        for (int i = 0; i < n; i++) {
//            sex = scan.next().charAt(0);
//            double h = scan.nextDouble();
//            if (sex == 'M') {
//                System.out.printf("%.2f\n", h / 1.09);
//            } else if (sex == 'F') {
//                System.out.printf("%.2f\n", h * 1.09);
//            }
//        }
//    }
//}

//L1-041 寻找250
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int[] nums = new int[1000000];
//        int i = 1;
//        while (scan.hasNextInt()) {
//            nums[i++] = scan.nextInt();
//            if (nums[i - 1] == 250) {
//                System.out.println(i - 1);
//                break;
//            }
//        }
//    }
//}