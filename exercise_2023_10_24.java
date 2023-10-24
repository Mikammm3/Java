


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        int group = in.nextInt();
//        for (int i = 0; i < group; i++) {
//            int n = in.nextInt();
//            int k = in.nextInt();
//            int[] arr = new int[2 * n];
//            for (int j = 0; j < 2 * n; j++) {
//                arr[j] = in.nextInt();
//            }
//
//            print(arr, k, n);
//        }
//    }
//
//
//    public static void print(int[] arr, int k, int n) {
//        int[] cards = null;
//        for (int i = 0; i < k; i++) {
//            // 洗牌一次
//            if (i == 0) {
//                cards = washCard(arr, n);
//            } else {
//                cards = washCard(cards, n);
//            }
//        }
//        for (int i = 0; i < cards.length; i++) {
//            if (i == cards.length - 1) {
//                System.out.print(cards[i]);
//            } else {
//                System.out.print(cards[i] + " ");
//            }
//        }
//        System.out.println();
//    }
//
//
//    public static int[] washCard(int[] arr, int n) {
//        int[] ans = new int[2 * n];
//        int l = n - 1;
//        int r = 2 * n - 1;
//        int k = 0;
//        while (n > 0) {
//            ans[k++] = arr[r--];
//            ans[k++] = arr[l--];
//            n--;
//        }
//        int left = 0;
//        int right = ans.length - 1;
//        while (left < right) {
//            int tmp = ans[left];
//            ans[left++] = ans[right];
//            ans[right--] = tmp;
//
//        }
//        return ans;
//    }
//}


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        int n = in.nextInt();
//        String s = in.next();
//        print(n, s);
//    }
//
//
//    public static void print(int n, String s) {
//        if (n <= 4) {
//            int count = 1;
//            for (int i = 0; i < s.length(); i++) {
//                char ch = s.charAt(i);
//                if (count == 1 && ch == 'U') {
//                    count = n;
//                } else if (count == n && ch == 'D') {
//                    count = 1;
//                } else {
//                    if (ch == 'U') {
//                        count--;
//                    } else {
//                        count++;
//                    }
//                }
//            }
//            for (int i = 1; i <= n; i++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//            System.out.println(count);
//        } else {
//            int count = 1;
//            for (int i = 0; i < s.length(); i++) {
//                char ch = s.charAt(i);
//                if (count == 1 && ch == 'U') {
//                    count = n;
//                } else if (count == n && ch == 'D') {
//                    count = 1;
//                } else {
//                    if (ch == 'U') {
//                        count--;
//                    } else {
//                        count++;
//                    }
//                }
//            }
//            for (int i = count; i <= n; i++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//            System.out.println(count);
//        }
//    }
//}