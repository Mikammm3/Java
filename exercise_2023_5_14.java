

//LeetCode387. 字符串中的第一个唯一字符
//class Solution {
//    public int firstUniqChar(String s) {
//        int[] arr = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            arr[ch - 'a']++;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (arr[ch - 'a'] == 1) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}


//牛客网 HJ1 字符串最后一个单词的长度
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        String[] arr = str.split(" ");
//        int len = arr.length - 1;
//        System.out.println(arr[len].length());
//
//    }
//}


//LeetCode125. 验证回文串
//class Solution {
//    public static boolean isLegal(char ch) {
//        if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean isPalindrome(String str) {
//        str = str.toLowerCase();
//        char[] arr = str.toCharArray();
//        int left = 0;
//        int right = arr.length - 1;
//        while (left < right) {
//            while (left < right && !isLegal(arr[left])) {
//                left++;
//            }
//            while (left < right && !isLegal(arr[right])) {
//                right--;
//            }
//            if (arr[left] != arr[right]) {
//                return false;
//            } else {
//                left++;
//                right--;
//            }
//        }
//        return true;
//    }
//}

//LeetCode 434. 字符串中的单词数
//class Solution {
//    public int countSegments(String s) {
//        if (s.isEmpty()) {
//            return 0;
//        }
//        String[] str = s.split(" ");
//        int len = str.length;
//        for (int i = 0; i < str.length; i++) {
//            boolean flag = false;
//            for (int j = 0; j < str[i].length(); j++) {
//                if (str[i].charAt(j) != ' ') {
//                    flag = true;
//                    break;
//                }
//            }
//            if (!flag) {
//                len--;
//            }
//        }
//        return len;
//    }
//}


//LeetCode 709. 转换成小写字母
//class Solution {
//    public String toLowerCase(String s) {
//        s = s.toLowerCase();
//        return s;
//    }
//}