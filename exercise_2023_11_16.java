// 牛客网 OR44 扑克牌大小
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String str = in.nextLine();
//            print(str);
//        }
//    }
//
//
//    public static void print(String str) {
//        // 依题目来看，优先级最高的是对王
//        // 其次是炸弹，然后再是其他
//        String[] arr = str.split("-");// 将两副牌分开
//        String[] arr1 =
//                arr[0].split(" ");// 获取到第一幅牌的除空格以外的内容
//        String[] arr2 =
//                arr[1].split(" ");// 获取到第二幅牌的除空格以外的内容
//        if ((arr[0].equals("joker JOKER")) || (arr[1].equals("joker JOKER"))) {
//            // 其中一副牌是对王，直接输出对王即可
//            System.out.println("joker JOKER");
//        } else if (arr1.length == arr2.length) {
//            // 长度相等，说明牌型一样，直接比较第一张牌大小即可
//            String card = "34567891JQKA2";// 用 1 来代替 10
//            if (card.indexOf(arr1[0].substring(0, 1)) > card.indexOf(arr2[0].substring(0,
//                    1))) {
//                // 组1第一张牌 比 组2第一张牌 玩出现，说明组1要大
//                System.out.println(arr[0]);
//            } else {
//                System.out.println(arr[1]);
//            }
//
//        } else {
//            // 长度不等，说明牌型不同，看是不是有炸弹，有就炸弹大，没有就说明非法
//            if (arr1.length == 4) {
//                System.out.println(arr[0]);
//            } else if (arr2.length == 4) {
//                System.out.println(arr[1]);
//            } else {
//                System.out.println("ERROR");
//            }
//        }
//    }
//}