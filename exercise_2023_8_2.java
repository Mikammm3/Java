

//LeetCode 面试题 01.02. 判定是否互为字符重排
//class Solution {
//    public boolean CheckPermutation(String s1, String s2) {
//        if (s1.length() != s2.length()) {
//            return false;
//        }
//        char[] arr1 = s1.toCharArray();
//        char[] arr2 = s2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        return new String(arr1).equals(new String(arr2));
//    }
//}