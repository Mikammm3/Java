

//LeetCode 1160. 拼写单词
//class Solution {
//    public int countCharacters(String[] words, String chars) {
//        int length = 0;
//        for (int i = 0; i < words.length; i++) {
//            int[] arr = new int[26];
//            for (int j = 0; j < chars.length(); j++) {
//                arr[chars.charAt(j) - 'a']++;
//            }
//            boolean flg = true;
//            for (int j = 0; j < words[i].length(); j++) {
//                char ch = words[i].charAt(j);
//                if (arr[ch - 'a'] > 0) {
//                    arr[ch - 'a']--;
//                } else {
//                    flg = false;
//                    break;
//                }
//            }
//            if (flg) {
//                length += words[i].length();
//            }
//        }
//        return length;
//    }
//}