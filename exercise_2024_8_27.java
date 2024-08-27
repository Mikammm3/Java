

// leetcode LCR 169. 招式拆解 II
//class Solution {
//    public char dismantlingAction(String arr) {
//        int[] hash = new int[26];
//        for (int i = 0; i < arr.length(); i++) {
//            char ch = arr.charAt(i);
//            hash[ch - 'a']++;
//        }
//        for (int i = 0; i < arr.length(); i++) {
//            char ch = arr.charAt(i);
//            if (hash[ch - 'a'] == 1) {
//                return ch;
//            }
//        }
//        char c = ' ';
//        return c;
//    }
//}


// leetcode LCR 167. 招式拆解 I
//class Solution {
//    public int dismantlingAction(String arr) {
//        if (arr == null || arr.length() == 0) return 0;
//        // 感觉可以用滑动窗口来做
//        int count = 1;
//        int left = 0;
//        int right = 0;
//        int len = arr.length();
//        Set<Character> set = new HashSet<>();
//
//        while (right < len) {
//            while (right < len && !set.contains(arr.charAt(right))) {
//                set.add(arr.charAt(right++));
//            }
//            if (right >= len) {
//                break;
//            }
//            if (set.contains(arr.charAt(right))) {
//                // 判断更新
//                if (set.size() > count) {
//                    count = set.size();
//                }
//                // 出窗口
//                char ch = arr.charAt(right);
//                while (left < right && arr.charAt(left) != ch) {
//                    set.remove(arr.charAt(left++));
//                }
//                set.remove(arr.charAt(left++));
//                set.add(ch);
//                right++;
//            }
//        }
//        if (set.size() > count) count = set.size();
//        return count;
//    }
//}