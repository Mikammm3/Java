

//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNext()) { // 注意 while 处理多个 case
//            String s = in.next();
//            String[] arr = s.split("_");
//            System.out.print(arr[0]);
//            for (int i = 1; i < arr.length; i++) {
//                String str = arr[i];
//                for (int j = 0; j < str.length(); j++) {
//                    char c = str.charAt(j);
//                    if (j == 0) {
//                        System.out.print((char) (str.charAt(0) - 32));
//                    } else {
//                        System.out.print(str.charAt(j));
//                    }
//                }
//            }
//            System.out.println();
//
//        }
//    }
//}


//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextLine()) { // 注意 while 处理多个 case
//            String s = in.nextLine();
//            print(s);
//        }
//    }
//
//
//    public static void print(String str) {
//        char[] arr = reverse(str.toCharArray(), 0, str.length() - 1);
//        int j = 0;
//        for (int i = 0; i < arr.length;) {
//            while (j < arr.length && ((arr[j] >= 'a' && arr[j] <= 'z') || (arr[j] >= 'A' && arr[j] <= 'z'))) {
//                j++;
//            }
//            reverse(arr, i, j - 1);
//            while (j < arr.length && !((arr[j] >= 'a' && arr[j] <= 'z') || (arr[j] >= 'A' && arr[j] <= 'z'))) {
//                j++;
//            }
//            i = j;
//        }
//        for(int i = 0; i < arr.length; ){
//            char c = arr[i];
//            while(i < arr.length && ((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'z'))){
//                System.out.print(arr[i]);
//                i++;
//            }
//            System.out.print(" ");
//            while (i < arr.length && !((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'z'))) {
//                i++;
//            }
//        }
//    }
//
//    public static char[] reverse(char[] arr, int l, int r) {
//        while (l < r) {
//            char tmp = arr[l];
//            arr[l] = arr[r];
//            arr[r] = tmp;
//            l++;
//            r--;
//        }
//        return arr;
//    }
//}