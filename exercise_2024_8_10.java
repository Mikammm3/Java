
// 牛客网 简单错误记录
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();
//        Map<String, Integer> map = new HashMap<>();
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNext()) { // 注意 while 处理多个 case
//
//            // 文件路径
//            String filePath = in.next();
//            // 行号
//            String num = in.next();
//            // 文件名
//             String file = filePath.substring(filePath.lastIndexOf("\\") + 1);
//            if (file.length() > 16) {
//                file = file.substring(file.length() - 16);
//            }
//            // 文件后缀名 + 行号
//            file += " " + num;
//            int value = map.getOrDefault(file, 0);
//            // 预处理，将所有错误记录的出现次数放入 map 中
//            if (value == 0) {
//                list.add(file);
//            }
//            // 累加
//            map.put(file, value + 1);
//        }
//
//        // 按顺序打印顺序表最后 8 条数据
//        int start = 0;
//        if (list.size() > 8) {
//            start = list.size() - 8;
//        }
//        for (int i = start; i < list.size(); i++) {
//            System.out.println(list.get(i) + " " + map.get(list.get(i)));
//        }
//
//    }
//}