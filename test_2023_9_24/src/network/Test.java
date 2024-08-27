package network;

public class Test {
}


class Solution {
    public int dismantlingAction(String arr) {
        if (arr == null || arr.length() == 0) return 0;
        // 感觉可以用滑动窗口来做
        int count = 1;
        int left = 0;
        int right = 0;
        int len = arr.length();
        Set<Character> set = new HashSet<>();

        while (right < len) {
            while (right < len && !set.contains(arr.charAt(right))) {
                set.add(arr.charAt(right++));
            }
            if (right >= len) {
                break;
            }
            if (set.contains(arr.charAt(right))) {
                // 判断更新
                if (set.size() > count) {
                    count = set.size();
                }
                // 出窗口
                char ch = arr.charAt(right);
                while (left < right && arr.charAt(left) != ch) {
                    set.remove(arr.charAt(left++));
                }
                set.remove(arr.charAt(left++));
                set.add(ch);
                right++;
            }
        }
        if (set.size() > count) count = set.size();
        return count;
    }
}