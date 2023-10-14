
// 牛客网 另类加法
//import java.util.*;
//
//public class UnusualAdd {
//    public int addAB(int A, int B) {
//        if (B == 0) {
//            return A;
//        }
//        int carry = 0;// 看看是否进位
//        int sum = 0;// 这里记录 A+B 的和
//        while (B != 0) {
//            sum = A ^ B;
//            carry = (A & B) << 1;
//            A = sum;
//            B = carry;// 当 carry 为 0 时，说明A+B不进位，则 A^B 就是和
//        }
//        return sum;
//    }
//}


// 牛客网 走方格的方案数
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int a = in.nextInt();
//            int b = in.nextInt();
//            print(a, b);
//        }
//    }
//
//    public static void print(int n, int m) {
//        int count = cul(n, m);
//        System.out.println(count);
//    }
//
//    public static int cul(int n, int m) {
//        if (n == 1 || m == 1) {
//            return n + m;
//        } else {
//            return cul(n - 1, m) + cul(n, m - 1);
//        }
//    }
//}