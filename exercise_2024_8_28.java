

// leetcode LCR 181. 字符串中的单词反转
//class Solution {
//    public String reverseMessage(String message) {
//        char[] arr = message.toCharArray();
//        // 逆序整个字符串
//        reverse(arr, 0, arr.length - 1);
//        // 每个单词逆序
//        int i = 0;
//        while (i < arr.length) {
//            // 跳过空格
//            while (i < arr.length && arr[i] == ' ') {
//                i++;
//            }
//            // 到这里 i 一定是数字或者字母
//            int end = i;
//            while (end < arr.length && arr[end] != ' ') {
//                end++;
//            }
//            // 到这里 end 一定是空格，i 到 end - 1 则是单词
//            reverse(arr, i, end - 1);
//            i = end;
//        }
//        StringBuilder str = new StringBuilder();
//        for (i = 0; i < arr.length; ) {
//            while (i < arr.length && arr[i] != ' ') {
//                str.append(arr[i++]);
//            }
//            while (i < arr.length && arr[i] == ' ') {
//                i++;
//            }
//            // 防止句尾添加多余空格
//            if (i >= arr.length) {
//                break;
//            }
//            if (str.length() != 0) {
//                str.append(' ');
//            }
//        }
//
//        return str.toString();
//
//    }
//
//    public void reverse(char[] arr, int left, int right) {
//        while (left < right) {
//            char tmp = arr[left];
//            arr[left++] = arr[right];
//            arr[right--] = tmp;
//        }
//    }
//}


// leetcode LCR 182. 动态口令
//class Solution {
//    public String dynamicPassword(String password, int target) {
//        String str2 = password.substring(0, target);
//        String str1 = password.substring(target);
//        String ret = str1 + str2;
//        return ret;
//    }
//}
//class Solution {
//    public String dynamicPassword(String password, int t) {
//        // a b c d e  t = 2,len = 5
//        // c d e a b  (2)
//        // e d c b a  (3)
//        // 要从 3 变到 2，需要逆序   (0,len - t)  和 (len - t, len)
//        char[] arr = password.toCharArray();
//        int len = arr.length;
//        reverse(arr, 0, len - 1);
//        reverse(arr, 0, len - 1 - t);
//        reverse(arr, len - t, len - 1);
//        return new String(arr);
//    }
//
//    public void reverse(char[] arr, int left, int right) {
//        while (left < right) {
//            char tmp = arr[left];
//            arr[left++] = arr[right];
//            arr[right--] = tmp;
//        }
//    }
//}