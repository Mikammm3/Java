

// 错误的代码
//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String str = in.nextLine();
//            print(str);
//        }
//    }
//
//    public static void print(String str) {
//        char[] arr = str.toCharArray();
//        Map<Integer, Integer> map = new HashMap<>();
//        int j = 0;
//        Set<Character> set = new HashSet<>();
//        int i = 0;
//        int maxIndex = -1;
//        int maxCount = 0;
//        while (i < arr.length) {
//            // 如果是字母，那就一直跳过
//            while (i < arr.length && !judge(arr[i])) {
//                i++;
//            }
//            // 到这里就是数字
//            int tmpIndex = i;
//            int count = 0;
//            while (i < arr.length && judge(arr[i++])) {
//                count++;
//            }
//            if (count > maxCount) {
//                maxCount = count;// 更新
//                maxIndex = tmpIndex;// 更新
//            }
//        }
//        for (int k = maxIndex; k < arr.length; k++) {
//            System.out.print(arr[k]);
//        }
//
//    }
//
//    public static boolean judge(char c) {
//        if (c >= '0' && c <= '9') {
//            return true;
//        }
//        return false;
//    }
//}


//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param numbers int整型一维数组
//     * @return int整型
//     */
//    public int MoreThanHalfNum_Solution(int[] numbers) {
//        Arrays.sort(numbers);
//        return numbers[numbers.length / 2];
//    }
//}