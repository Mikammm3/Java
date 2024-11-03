

// leetcode 290. 单词规律
//class Solution {
//    public boolean wordPattern(String pattern, String s) {
//        List<String> arr = Arrays.asList(s.split(" "));
//        // 判断第一次出现位置，不同返回 false
//        if (arr.size() != pattern.length()) return false;
//        for (int i = 0; i < pattern.length(); i++) {
//            if (pattern.indexOf(pattern.charAt(i)) != arr.indexOf(arr.get(i))) {
//                return false;
//            }
//        }
//        return true;
//    }
//}