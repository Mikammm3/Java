

////L1-051 打折
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int price = scan.nextInt();
//        int dis = scan.nextInt();
//        double cost = price * dis / 10.0;
//        System.out.printf("%.02f\n", cost);
//        scan.close();
//    }
//}

//L1-052 2018我们要赢
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("2018");
//        System.out.println("wo3 men2 yao4 ying2 !");
//    }
//}


//L1-053 电子汪
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        for (int i = 0; i < a + b; i++) {
//            System.out.print("Wang!");
//        }
//        System.out.println();
//        scan.close();
//    }
//}


//L1-055 谁是赢家
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int[] arr = {0, 0};
//        for (int i = 0; i < 3; i++) {
//            int tmp = scan.nextInt();
//            if (tmp == 0) {
//                arr[0]++;
//            } else if (tmp == 1) {
//                arr[1]++;
//            }
//        }
//        if (arr[0] == 3) {
//            System.out.printf("The winner is a: %d + 3\n", a);
//        } else if (arr[1] == 3) {
//            System.out.printf("The winner is b: %d + 3\n", b);
//        } else if (a > b && arr[0] != 0) {
//            System.out.printf("The winner is a: %d + %d\n", a, arr[0]);
//        } else if (a < b && arr[1] != 0) {
//            System.out.printf("The winner is b: %d + %d\n", b, arr[1]);
//        }
//        scan.close();
//    }
//}