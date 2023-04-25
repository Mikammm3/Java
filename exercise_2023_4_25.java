//PTA L1-057 PTA使我精神焕发
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("PTA shi3 wo3 jing1 shen2 huan4 fa1 !");
//    }
//}


//PTA L1-061 新胖子公式
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        double weight = scan.nextDouble();
//        double high = scan.nextDouble();
//        double fat = weight / Math.pow(high, 2);
//        System.out.printf("%.01f\n", fat);
//        if (fat > 25.0) {
//            System.out.println("PANG");
//        } else {
//            System.out.println("Hai Xing");
//        }
//        scan.close();
//    }
//}


//PTA L1-062 幸运彩票
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        for (int i = 0; i < N; i++) {
//            int num = scan.nextInt();
//            int q = 0;
//            int h = 0;
//            int count = 0;
//            while (num != 0) {
//                if (count < 3) {
//                    h += num % 10;
//                } else {
//                    q += num % 10;
//                }
//                count++;
//                num /= 10;
//            }
//            if (q == h) {
//                System.out.println("You are lucky!");
//            } else {
//                System.out.println("Wish you good luck.");
//            }
//        }
//        scan.close();
//    }
//}


//PTA L1-063 吃鱼还是吃肉
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        for (int i = 0; i < N; i++) {
//            int gh = 0;
//            int gw = 0;
//            int sex = scan.nextInt();
//            int high = scan.nextInt();
//            int weight = scan.nextInt();
//            if (sex == 1) {
//                gh = 130;
//                gw = 27;
//            } else {
//                gh = 129;
//                gw = 25;
//            }
//            if (high < gh) {
//                System.out.print("duo chi yu!");
//            } else if (high > gh) {
//                System.out.print("ni li hai!");
//            } else {
//                System.out.print("wan mei!");
//            }
//            System.out.print(" ");
//            if (weight < gw) {
//                System.out.print("duo chi rou!");
//            } else if (weight > gw) {
//                System.out.print("shao chi rou!");
//            } else {
//                System.out.print("wan mei!");
//            }
//            System.out.println();
//        }
//    }
//}