

//LeetCode 1816. 截断句子
//class Solution {
//    public String truncateSentence(String s, int k) {
//        int count = 0;
//        String str = "";
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (ch == ' ') {
//                count++;
//            }
//            if (count == k) {
//                break;
//            }
//            str += ch;
//        }
//        return str;
//    }
//}