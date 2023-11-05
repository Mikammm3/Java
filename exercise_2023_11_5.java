
// 牛客网 WY28 跳石板
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        print(n, m);
//    }
//
//    public static void print(int n, int m) {
//        int[] step = new int[m + 1]; // 对应石板编号
//        // 初始化石板
//        for (int i = 0; i < step.length; i++) {
//            step[i] = Integer.MAX_VALUE;
//        }
//        step[n] = 0;//跳到 n 编号的石板所需的次数为 step[n]
//        for (int i = n; i < m; i++) {
//            if (step[i] == Integer.MAX_VALUE) {
//                // 说明未被修改过，所以跳过这个石板，该石板不做操作
//                continue;
//            }
//            // 计算 i 的约数
//            List<Integer> list = div(i);
//            // 计算 从 n 到 m 的次数最优解
//            // i 代表当前站在编号为 i 的石板上
//            // j 代表一次能跳 j 个石板
//            for (int j : list) {
//                if (j + i <= m && step[j + i] != Integer.MAX_VALUE) {
//                    step[j + i] = Math.min(step[j + i], step[i] + 1);
//                } else if (j + i <= m) {
//                    step[j + i] = step[i] + 1;
//                }
//            }
//        }
//        // 说明 step[m] 没有被修改过
//        if (step[m] == Integer.MAX_VALUE) {
//            System.out.println(-1);
//        } else {
//            System.out.println(step[m]);
//        }
//    }
//
//    public static List<Integer> div(int n) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                list.add(i);
//                if (n / i != i) {
//                    list.add(n / i);
//                }
//            }
//        }
//        return list;
//    }
//}