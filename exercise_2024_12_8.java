

// leetcode  438. 找到字符串中所有字母异位词
//class Solution {
//    public List<Integer> findAnagrams(String s, String p) {
//        List<Integer> ret = new ArrayList<>();
//        int[] hashP = new int[26];
//        for (int i = 0; i < p.length(); i++) {
//            hashP[p.charAt(i) - 'a']++;
//        }
//        int[] hashS = new int[26];
//        for (int left = 0, right = 0, count = 0, m = p.length(); right < s.length(); right++) {
//            char ch = s.charAt(right);
//            hashS[ch - 'a']++;
//            // 判断是否是有效字符
//            if (hashS[ch - 'a'] <= hashP[ch - 'a']) count++;
//            // 出窗口
//            if (right - left + 1 > m) {
//                char c = s.charAt(left++);
//                if (hashS[c - 'a'] <= hashP[c - 'a']) count--;
//                hashS[c - 'a']--;
//            }
//            if (count == m) ret.add(left);
//        }
//        return ret;
//    }
//}


// leetcode 560. 和为 K 的子数组
//class Solution {
//    public int subarraySum(int[] nums, int k) {
//        // 利用前缀和 + hash 表
//        // 第一个 int 表示前缀和，第二个 int 表示该前缀和出现次数
//        HashMap<Integer, Integer> hash = new HashMap<>();
//        hash.put(0, 1);// 防止数组越界
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum = sum + nums[i];// 统计当前位置的前缀和
//            int target = sum - k;
//            count += hash.getOrDefault(target, 0);// 统计结果
//            hash.put(sum, hash.getOrDefault(sum, 0) + 1);// 把当前前缀和丢到哈希表中
//        }
//        return count;
//    }
//}