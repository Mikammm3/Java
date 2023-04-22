import java.util.Arrays;

public class Test {

//    public static void transform(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//        while (left < right) {
//            while (arr[left] % 2 != 0 && left < right) {
//                left++;
//            }
//            while (arr[right] % 2 == 0 && left < right) {
//                right--;
//            }
//            int tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//        }
//    }

//    public static int[] sum(int[] arr, int target) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{-1, -1};
//    }

//    public static int[] twoSingleDog(int[] arr) {
//        int ret = 0;
//        for (int i = 0; i < arr.length; i++) {
//            ret ^= arr[i];
//        }
//        int pos = 0;
//        for (int i = 0; i < 32; i++) {
//            if (((ret >> i) & 1) == 1) {
//                pos = i;
//                break;
//            }
//        }
//        int a = 0;
//        int b = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (((arr[i] >> pos) & 1) == 1) {
//                a ^= arr[i];
//            } else {
//                b ^= arr[i];
//            }
//        }
//        return new int[]{a, b};
//    }

    //    public static int maxTime(int[] arr) {
//        Arrays.sort(arr);
//        return arr[arr.length / 2];
//    }
//    public static boolean lastingOdd(int[] arr) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                count++;
//                if (count == 3) {
//                    return true;
//                } else {
//                    count = 0;
//                }
//            }
//        }
//        return false;
//    }

//    public static void reverse(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//        while (left < right) {
//            int tmp = arr[left];
//            arr[left++] = arr[right];
//            arr[right--] = tmp;
//        }
//    }


    public static void main(String[] args) {

//        int[][] arr = new int[2][];//当没有列的时候，就是不规则数组
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        //上面代码运行会发生什么？
//        arr[0] = new int[]{1, 2, 3, 4};
//        arr[1] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
//        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5, 6}};
//        int[][] arr3 = new int[2][3];//0
        //reverse(arr);
        //System.out.println(Arrays.toString(arr));
        //int[] ret = twoSingleDog(arr);
        //System.out.println(Arrays.toString(ret));
        //transform(arr);
        //int[] ret = sum(arr, 90);
        //System.out.println(Arrays.toString(ret));
        //System.out.println(Arrays.toString(arr));
    }
}
