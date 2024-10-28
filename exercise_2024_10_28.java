
// leetcode 205. 同构字符串
//class Solution {
//    public boolean isIsomorphic(String s, String t) {
//        Map<Character, Character> hashST = new HashMap<>();
//        Map<Character, Character> hashTS = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char ss = s.charAt(i);
//            char tt = t.charAt(i);
//            if (hashST.containsKey(ss) && hashST.get(ss) != tt ||
//                    hashTS.containsKey(tt) && hashTS.get(tt) != ss) {
//                return false;
//            }
//            hashST.put(ss, tt);
//            hashTS.put(tt, ss);
//        }
//        return true;
//    }
//}