
// 牛客网 马戏团
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//// 可以定义一个对象来存放员工的身高体重信息
//class Person {
//    public int num;
//    public int height;
//    public int weight;
//
//    public Person(int num, int weight, int height) {
//        this.num = num;
//        this.height = height;
//        this.weight = weight;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            List<Person> list = new ArrayList<>();
//            // dp[i] 表示以数组 i 下标结尾的最长身高升序子序列长度
//            int[] dp = new int[n];
//            for (int i = 0; i < n; i++) {
//                int num = in.nextInt();
//                int weight = in.nextInt();
//                int height = in.nextInt();
//                Person p = new Person(num, weight, height);
//                list.add(p);
//                // 顺便初始化 dp[i]
//                dp[i] = 1;
//            }
//            // 排序 list 数组
//            Collections.sort(list, new Comparator<Person>() {
//                @Override
//                public int compare(Person p1, Person p2) {
//                    if (p1.weight == p2.weight) {
//                        // 体重相同，按身高逆序排序
//                        return p2.height - p1.height;
//                    } else {
//                        // 体重不同，按体重升序排序
//                        return p1.weight - p2.weight;
//                    }
//                }
//            });
//
//
//            for (int i = 0; i < list.size(); i++) {
//                Person pi = list.get(i);
//                for (int j = i - 1; j >= 0; j--) {
//                    Person pj = list.get(j);
//                    if (pj.height <= pi.height) {
//                        dp[i] = Math.max(dp[i], dp[j] + 1);
//                    }
//                }
//            }
//
//            // 遍历 dp 数组，求出最大值后输出
//            int max = 1;
//            for (int i = 0; i < dp.length; i++) {
//                if (dp[i] > max) {
//                    max = dp[i];
//                }
//            }
//            System.out.println(max);
//        }
//    }
//}