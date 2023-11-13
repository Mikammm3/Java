
// 牛客网 WY15 幸运的袋子
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        Arrays.sort(arr);
//        System.out.println(count(arr, n, 0, 0, 1));
//    }
//
//    public static int count(int[] arr, int n, int pos, int sum, int muti) {
//        int count = 0;
//        for (int i = pos; i < n; i++) {
//            sum += arr[i];
//            muti *= arr[i];
//            if (sum > muti) {
//                count = count + 1 + count(arr, n, i + 1, sum, muti);
//            } else if (arr[i] == 1) {
//                count = count + count(arr, n, i + 1, sum, muti);
//            } else {
//                break;
//            }
//            while (i < n - 1 && arr[i] == arr[i + 1]) {
//                i++;
//            }
//            sum -= arr[i];
//            muti /= arr[i];
//        }
//        return count;
//    }
//}