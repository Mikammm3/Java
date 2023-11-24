
// LeetCode 串联所有单词的⼦串
//class Solution {
//    public List<Integer> findSubstring(String s, String[] words) {
//        List<Integer> ret = new ArrayList<>();
//        if (words == null || words.length == 0) return ret;
//
//        HashMap<String, Integer> hash1 = new HashMap<>();
//        for (String x : words) hash1.put(x, hash1.getOrDefault(x, 0) + 1);
//
//        for (int i = 0, len = words[0].length(), k1 = hash1.size(), m = words.length; i < words[0].length(); i++) {
//
//            HashMap<String, Integer> hash2 = new HashMap<>();
//            for (int left = i, right = i, n = s.length(), k2 = 0, count = 0; right + len <= n; right += len) {
//
//                String in = s.substring(right, right + len);
//                hash2.put(in, hash2.getOrDefault(in, 0) + 1);
//                if (hash2.getOrDefault(in, 0) <= hash1.getOrDefault(in, 0)) count++;
//                if (right - left + 1 > len * m) {
//                    if (left + len >= s.length()) {
//                        break;
//                    }
//
//                    String out = s.substring(left, left + len);
//                    if (hash2.getOrDefault(out, 0) <= hash1.getOrDefault(out, 0)) count--;
//                    hash2.put(out, hash2.getOrDefault(out, 1) - 1);
//
//                    if (hash2.get(out) == 0) {
//                        hash2.remove(out);
//                    }
//                    left += len;
//                }
//
//                if (k1 == hash2.size() && count == m) {
//                    ret.add(left);
//                }
//            }
//        }
//        return ret;
//    }
//}


// LeetCode 76. 最小覆盖子串
//class Solution {
//    public String minWindow(String s, String t) {
//        if (t.length() > s.length()) return "";
//        int[] hash1 = new int[128];
//        int kinds = 0;
//        for (char x : t.toCharArray()) {
//            hash1[x - 'A']++;
//            if (hash1[x - 'A'] == 1) {
//                kinds++;
//            }
//        }
//        int[] hash2 = new int[128];
//        int index = -1;// 起始地址
//        int len = Integer.MAX_VALUE;// 最短长度
//        for (int left = 0, right = 0, count = 0; right < s.length(); right++) {
//            // 进窗口
//            char in = s.charAt(right);
//            hash2[in - 'A']++;
//            if (hash2[in - 'A'] == hash1[in - 'A']) count++;
//
//            // 判断 出窗口
//            while (count == kinds) {
//                // 更新结果
//                if (right - left + 1 < len) {
//                    index = left;
//                    len = right - left + 1;
//                }
//                char out = s.charAt(left++);
//                if (hash2[out - 'A'] == hash1[out - 'A']) count--;
//                hash2[out - 'A']--;
//            }
//        }
//        if (index == -1) return "";
//        return s.substring(index, index + len);
//    }
//}


// LeetCode 704. 二分查找
//class Solution {
//    public int search(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (nums[mid] < target) {
//                left = mid + 1;
//            } else if (nums[mid] > target) {
//                right = mid - 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//}
