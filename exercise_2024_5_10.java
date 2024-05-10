//
//
//
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int t = in.nextInt();
//            for (int i = 0; i < t; i++) {
//                int h = in.nextInt();
//                int a = in.nextInt();
//                int H = in.nextInt();
//                int A = in.nextInt();
//                print(h, a, H, A);
//            }
//        }
//    }
//
//
//    public static void print(int h, int a, int H, int A) {
//        if (A <= 0) {
//            System.out.println(-1);
//            return;
//        }
//        int count = 0;
//        int nH = H;
//        while (h > 0) {
//            H -= a;
//            if (H <= 0) {
//                count++;
//                H = nH;
//                continue;
//            }
//            h -= A;
//        }
//        System.out.println(count);
//    }
//}


//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            String[] arr = new String[n];
//            in.nextLine();
//            for (int i = 0; i < n; i++) {
//                arr[i] = in.nextLine();
//            }
//            print(n, arr);
//        }
//    }
//
//
//    public static void print(int n, String[] arr) {
//        Map<Character, Integer> hash = new HashMap<>();
//        for (char c : arr[0].toCharArray()) {
//            int cnt = hash.getOrDefault(c, 0);
//            hash.put(c, cnt + 1);
//        }
//        int kinds = 1;
//        ArrayList<Map<Character, Integer>> list = new ArrayList<>();
//        list.add(hash);
//        for (int i = 1; i < arr.length; i++) {
//            Map<Character, Integer> tmp = new HashMap<>();
//            for (char c : arr[i].toCharArray()) {
//                int cnt = tmp.getOrDefault(c, 0);
//                tmp.put(c, cnt + 1);
//            }
//            boolean flg = true;// 看看是否要开新类
//            for (Map<Character, Integer> x : list) {
//                if (x.size() != tmp.size()) {
//                    continue;
//                }
//                boolean cur = true;// 看看是否与当前类相同
//                for (char c : arr[i].toCharArray()) {
//                    int cnt = tmp.getOrDefault(c, 0);
//                    int cnt2 = x.getOrDefault(c, 0);
//                    if (cnt != cnt2) {
//                        cur = false;
//                        break;
//                    }
//                }
//                if (cur == true) {
//                    flg = false;
//                    break;
//                }
//            }
//            if (flg) {
//                list.add(tmp);
//            }
//
//        }
//
//        System.out.println(list.size());
//
//    }
//}