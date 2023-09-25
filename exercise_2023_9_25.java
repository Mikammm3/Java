

// 牛客网 排序子序列
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 1.先输入
//        int n = in.nextInt();
//        // 多申请一个，默认为0，防止越界，不影响结果
//        int[] arr = new int[n + 1];
//        int i = 0;
//        while (in.hasNextInt()) {
//            arr[i++] = in.nextInt();
//        }
//        // 2.遍历数组，进入下一段，count++
//        int count = 0;
//        i = 0;
//        while (i < n) {
//            if (arr[i] > arr[i + 1]) {
//                // 大于
//                while (i < n && arr[i] > arr[i + 1]) {
//                    i++;
//                }
//                count++;
//                i++;// i++进入下一段
//            } else if (arr[i] == arr[i + 1]) {
//                // 等于
//                i++;// 如果相等，那么就直接++跳过即可
//            } else {
//                // 小于
//                while (i < n && arr[i] < arr[i + 1]) {
//                    i++;
//                }
//                count++;
//                i++;// 同上
//            }
//        }
//        System.out.println(count);
//    }
//}


// 牛客网 倒置字符串
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
//            String str = in.nextLine();
//            print(str);
//        }
//    }
//
//    public static void print(String str) {
//        char[] arr = str.toCharArray();
//        // 1.整体逆置
//        reverse(arr, 0, arr.length - 1);
//
//        // 2.单词逆置
//        int start = 0;
//        int len = arr.length;
//        while (start < len) {
//            int end = start;
//            while (end < len && arr[end] != ' ') {
//                end++;
//            }
//            // 到达这里，end 一定指向一个空格.或者 end 已经等于 len 了
//            if (end < len) {
//                reverse(arr, start, end - 1);
//                start = end + 1;
//            } else {
//                reverse(arr, start, end - 1);
//                break;
//            }
//        }
//        String s = new String(arr);
//        System.out.println(s);
//
//    }
//
//    public static void reverse(char[] arr, int left, int right) {
//        while (left < right) {
//            char tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//            left++;
//            right--;
//        }
//    }
//}