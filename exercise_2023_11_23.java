
// LeetCode 1658. 将 x 减到 0 的最小操作数
//class Solution {
//    public int minOperations(int[] nums, int x) {
//        int all = 0;
//        for (int y : nums) {
//            all += y;
//        }
//        int target = all - x;
//        if (target < 0) return -1;
//
//        int len = -1;
//        for (int left = 0, right = 0, sum = 0, n = nums.length; right < n; right++) {
//            sum += nums[right];
//            while (sum > target) {
//                sum -= nums[left++];
//            }
//            if (sum == target) {
//                len = Math.max(len, right - left + 1);
//            }
//        }
//        return len == -1 ? len : nums.length - len;
//    }
//}


// LeetCode 904. 水果成篮
//class Solution {
//    public int totalFruit(int[] fruits) {
//        int len = 0;
//        int[] hash = new int[fruits.length + 1];
//        for (int left = 0, right = 0, kinds = 0, n = fruits.length; right < n; right++) {
//            int in = fruits[right];
//            if (hash[in] == 0) {
//                kinds++;
//            }
//            hash[in]++;
//            while (kinds > 2) {
//                int out = fruits[left];
//                hash[out]--;
//                if (hash[out] == 0) {
//                    kinds--;
//                }
//                left++;
//            }
//            len = Math.max(len, right - left + 1);
//        }
//        return len;
//    }
//}


// LeetCode 438. 找到字符串中所有字母异位词
//class Solution {
//    public List<Integer> findAnagrams(String s, String p) {
//        List<Integer> ret = new ArrayList<>();
//
//        int[] hash1 = new int[26];
//        for (char c : p.toCharArray()) {
//            hash1[c - 'a']++;
//        }
//
//        int m = p.length();
//        int[] hash2 = new int[26];
//        for (int left = 0, right = 0; right < s.length(); right++) {
//            char in = s.charAt(right);
//            hash2[in - 'a']++;
//            if (right - left + 1 > m) {
//                char out = s.charAt(left++);
//                hash2[out - 'a']--;
//            }
//            if (right - left + 1 == m) {
//                boolean flg = false;
//                for (int i = 0; i < 26; i++) {
//                    if (hash1[i] != hash2[i]) {
//                        flg = true;
//                        break;
//                    }
//                }
//                if (!flg) {
//                    ret.add(left);
//                }
//            }
//        }
//
//        return ret;
//    }
//}
//class Solution {
//    public List<Integer> findAnagrams(String s, String p) {
//        int[] hash1 = new int[26];
//        int[] hash2 = new int[26];
//        for (char c : p.toCharArray()) hash1[c - 'a']++;
//        List<Integer> ret = new ArrayList<>();
//        int m = p.length();
//        for (int left = 0, right = 0, count = 0; right < s.length(); right++) {
//            char in = s.charAt(right);
//            hash2[in - 'a']++;
//            if (hash2[in - 'a'] <= hash1[in - 'a']) count++;
//            if (right - left + 1 > m) {
//                char out = s.charAt(left++);
//                if (hash2[out - 'a'] <= hash1[out - 'a']) count--;
//                hash2[out - 'a']--;
//            }
//            if (count == m) ret.add(left);
//        }
//        return ret;
//    }
//}