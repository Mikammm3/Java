
// 牛客网 简单错误记录

//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Map<String, Integer> map = new LinkedHashMap<>();
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            // 包括了 文件路径以及 行号
//            String tmp = in.nextLine();
//            if (tmp == null || "".equals(tmp)) break;
//            String[] str = tmp.substring(tmp.lastIndexOf("\\") + 1).split(" ");
//
//            // 行号
//            String num = str[1];
//            // 文件名
//            String file = str[0];
//            // 文件后缀名 + 行号
//            file += " " + num;
//            int value = map.getOrDefault(file, 0);
//
//            // 预处理，将所有错误记录的出现次数放入 map 中
//            // 累加
//            map.put(file, value + 1);
//        }
//
//        List<Map.Entry<String, Integer>> ans = new LinkedList<>(map.entrySet());
//        Collections.sort(ans, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1,
//                               Map.Entry<String, Integer> o2) {
//                return o2.getValue().compareTo(o1.getValue());
//            }
//        });
//        for (int i = 0; i < Math.min(8, ans.size()); i++) {
//            Map.Entry<String, Integer> entry = ans.get(i);
//            String[] arr = entry.getKey().split(" ");
//            if (arr[0].length() > 16) {
//                arr[0] = arr[0].substring(arr[0].length() - 16);
//            }
//            System.out.println(arr[0] + " " + arr[1] + " " + entry.getValue());
//        }
//
//    }
//}