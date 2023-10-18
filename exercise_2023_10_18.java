//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String card = in.nextLine();
//            print(card);
//            //System.out.println("joker JOKER");
//        }
//    }
//
//
//    public static void print(String str) {
//        String s1 = "";
//        String s2 = "";
//        int i = 0;
//        int len = str.length();
//        boolean count = false;
//        int s2Start = 0;
//        while (i < len) {
//            while (i < len && str.charAt(i) != '-') {
//                if (str.charAt(i) != ' ') {
//                    if (!count) {
//                        s1 += str.charAt(i) + "";
//                    } else {
//                        s2 += str.charAt(i) + "";
//                    }
//                }
//                i++;
//                if (!count) {
//                    s2Start++;
//                }
//            }
//            i++;
//            if (!count) {
//                s2Start++;
//            }
//            if (i >= len) {
//                break;
//            }
//            count = true;
//        }
//        int flg = 0;
//        if (s1.length() == 1 || s2.length() == 1) {
//            flg = single(s1, s2);
//        } else if (s1.length() == 2 || s2.length() == 2) {
//            flg = duizi(s1, s2);
//        } else if (s1.length() == 5 || s2.length() == 5) {
//            flg = shunzi(s1, s2);
//        } else if (s1.length() == 3 || s2.length() == 3) {
//            flg = sange(s1, s2);
//        } else if (s1.length() == 4 || s2.length() == 4) {
//            flg = sange(s1, s2);
//        }
//        for (; s2Start < str.length(); s2Start++) {
//            System.out.print(str.charAt(s2Start));
//        }
//    }
//
//
//    public static int zhadan(String s1, String s2) {
//        if (s1.equals("jokerJOKER") || s1.equals("JOKERjoker")) {
//            return -1;
//        }
//        if (s2.equals("jokerJOKER") || s2.equals("JOKERjoker")) {
//            return 1;
//        }
//        if (s1.equals("2222")) {
//            return -1;
//        }
//        if (s2.equals("2222")) {
//            return 1;
//        }
//        if (s1.equals("AAAA")) {
//            return -1;
//        }
//        if (s2.equals("AAAA")) {
//            return 1;
//        }
//        if (s1.equals("KKKK")) {
//            return -1;
//        }
//        if (s2.equals("KKKK")) {
//            return 1;
//        }
//        if (s1.equals("QQQQ")) {
//            return -1;
//        }
//        if (s2.equals("QQQQ")) {
//            return 1;
//        }
//        if (s1.equals("JJJJ")) {
//            return -1;
//        }
//        if (s2.equals("JJJJ")) {
//            return 1;
//        }
//        if (s1.equals("10101010")) {
//            return -1;
//        }
//        if (s2.equals("10101010")) {
//            return 1;
//        }
//        return s1.charAt(0) - s2.charAt(0);
//    }
//
//    public static int sange(String s1, String s2) {
//        if (s1.equals("jokerJOKER") || s1.equals("JOKERjoker")) {
//            return -1;
//        }
//        if (s2.equals("jokerJOKER") || s2.equals("JOKERjoker")) {
//            return 1;
//        }
//        if (s1.charAt(2) == '2') {
//            return -1;
//        }
//        if (s2.charAt(2) == '2') {
//            return 1;
//        }
//        if (s1.charAt(2) == 'A') {
//            return -1;
//        }
//        if (s2.charAt(2) == 'A') {
//            return 1;
//        }
//        if (s1.charAt(2) == 'K') {
//            return -1;
//        }
//        if (s2.charAt(2) == 'K') {
//            return 1;
//        }
//        if (s1.charAt(2) == 'K') {
//            return -1;
//        }
//        if (s2.charAt(2) == 'K') {
//            return 1;
//        }
//        if (s1.charAt(2) == 'J') {
//            return -1;
//        }
//        if (s2.charAt(2) == 'J') {
//            return 1;
//        }
//        if (s1.equals("101010")) {
//            return -1;
//        }
//        if (s2.equals("101010")) {
//            return 1;
//        }
//        return s1.charAt(2) - s2.charAt(2);
//    }
//
//    public static int shunzi(String s1, String s2) {
//        if (s1.equals("jokerJOKER") || s1.equals("JOKERjoker")) {
//            return -1;
//        }
//        if (s2.equals("jokerJOKER") || s2.equals("JOKERjoker")) {
//            return 1;
//        }
//        if (s1.charAt(4) == 'A') {
//            return -1;
//        }
//        if (s2.charAt(4) == 'A') {
//            return 1;
//        }
//        if (s1.charAt(4) == 'K') {
//            return -1;
//        }
//        if (s2.charAt(4) == 'K') {
//            return 1;
//        }
//        if (s1.charAt(4) == 'K') {
//            return -1;
//        }
//        if (s2.charAt(4) == 'K') {
//            return 1;
//        }
//        if (s1.charAt(4) == 'J') {
//            return -1;
//        }
//        if (s2.charAt(4) == 'J') {
//            return 1;
//        }
//        if (s1.equals("678910")) {
//            return -1;
//        }
//        if (s2.equals("678910")) {
//            return 1;
//        }
//        return s1.charAt(4) - s2.charAt(4);
//    }
//
//    public static int duizi(String s1, String s2) {
//        if (s1.equals("jokerJOKER") || s1.equals("JOKERjoker")) {
//            return -1;
//        }
//        if (s2.equals("jokerJOKER") || s2.equals("JOKERjoker")) {
//            return 1;
//        }
//        if (s1.equals("22")) {
//            return -1;
//        }
//        if (s2.equals("22")) {
//            return 1;
//        }
//        if (s1.equals("AA")) {
//            return -1;
//        }
//        if (s2.equals("AA")) {
//            return 1;
//        }
//        if (s1.equals("KK")) {
//            return -1;
//        }
//        if (s2.equals("KK")) {
//            return 1;
//        }
//        if (s1.equals("QQ")) {
//            return -1;
//        }
//        if (s2.equals("QQ")) {
//            return 1;
//        }
//        if (s1.equals("JJ")) {
//            return -1;
//        }
//        if (s2.equals("JJ")) {
//            return 1;
//        }
//        if (s1.equals("1010")) {
//            return -1;
//        }
//        if (s2.equals("1010")) {
//            return 1;
//        }
//        return s1.charAt(0) - s2.charAt(0);
//    }
//
//    public static int single(String s1, String s2) {
//        if ((s1.equals("joker") && !s2.equals("JOKER")) || s1.equals("JOKER")) {
//            return -1;
//        }
//        if ((s2.equals("joker") && !s1.equals("JOKER")) || s2.equals("JOKER")) {
//            return 1;
//        }
//        if (s1.equals("2")) {
//            return -1;
//        }
//        if (s2.equals("2")) {
//            return 1;
//        }
//        if (s1.equals("A")) {
//            return -1;
//        }
//        if (s2.equals("A")) {
//            return 1;
//        }
//        if (s1.equals("K")) {
//            return -1;
//        }
//        if (s2.equals("K")) {
//            return 1;
//        }
//        if (s1.equals("Q")) {
//            return -1;
//        }
//        if (s2.equals("Q")) {
//            return 1;
//        }
//        if (s1.equals("J")) {
//            return -1;
//        }
//        if (s2.equals("J")) {
//            return 1;
//        }
//        if (s1.equals("10")) {
//            return -1;
//        }
//        if (s2.equals("10")) {
//            return 1;
//        }
//        return s1.charAt(0) - s2.charAt(0);
//    }
//}


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            int count = getCount(n);
//            System.out.println(count);
//        }
//    }
//
//
//    public static int getCount(int n) {
//        int count = 0;
//        for (int i = 2; i <= n; i++) {
//            if (isPerfect(i)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static boolean isPerfect(int n) {
//        int sum = 1;
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                int tmp = n / i;
//                sum += (tmp + i);
//            }
//        }
//        if (sum == n) {
//            return true;
//        }
//        return false;
//    }
//}