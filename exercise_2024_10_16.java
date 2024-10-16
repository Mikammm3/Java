
// leetcode 151. 反转字符串中的单词
//class Solution {
//    public String reverseWords(String s) {
//        // 去除头尾空格
//        s = s.trim();
//        char[] arr = s.toCharArray();
//        reverse(arr, 0, arr.length - 1);
//        int i = 0;
//        int len = arr.length;
//        while (i < len) {
//            int end = i;
//            while (end < len && arr[end] != ' ') {
//                end++;
//            }
//            reverse(arr, i, end - 1);
//            i = end;
//            while (i < len && arr[i] == ' ') {
//                i++;
//            }
//        }
//        StringBuilder ans = new StringBuilder();
//        i = 0;
//        while (i < len) {
//            while (i < len && arr[i] != ' ') {
//                ans.append(arr[i]);
//                i++;
//            }
//            ans.append(' ');
//            while (i < len && arr[i] == ' ') {
//                i++;
//            }
//        }
//        return ans.toString().trim();
//
//    }
//
//    public void reverse(char[] arr, int left, int right) {
//        while (left < right) {
//            char tmp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = tmp;
//            left++;
//            right--;
//        }
//    }
//}