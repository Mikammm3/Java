

// 牛客网 求和
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int m = in.nextInt();
//            List<Integer> sumList = new ArrayList<>();
//            print(n, m, 1, 0, sumList);
//        }
//    }
//
//
//    public static void print(int n, int targetSum, int pos, int curSum,
//                             List<Integer> sumList) {
//        // 如果当前和大于目标和，则说明继续往后累加的值也是大于目标和的，所以应该回退
//        if (curSum > targetSum) {
//            return;
//        }
//        // 如果当前和等于目标和，则输出即可。
//        if (curSum == targetSum) {
//            for (int i = 0; i < sumList.size() - 1; i++) {
//                System.out.print(sumList.get(i) + " ");
//            }
//            System.out.println(sumList.get(sumList.size() - 1));
//            return;
//        }
//        // 如果当前和小于目标和，就往后累加
//        for (int i = pos; i <= n; i++) {
//            sumList.add(i);
//            print(n, targetSum, i + 1, curSum + i, sumList);
//            sumList.remove(sumList.size() - 1);
//        }
//    }
//}