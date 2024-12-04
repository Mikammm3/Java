

// leetcode 1. 两数之和
//// class Solution {
////     public int[] twoSum(int[] nums, int target) {
////         for (int i = 0; i < nums.length; i++) {
////             for (int j = i + 1; j < nums.length; j++) {
////                 if (nums[i] + nums[j] == target) {
////                     return new int[] { i, j };
////                 }
////             }
////         }
////         return new int[] { -1, -1 };
////     }
//// }
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> hash = new HashMap<>();
//        hash.put(nums[0], 0);
//        for (int i = 1; i < nums.length; i++) {
//            int t = target - nums[i];
//            if (hash.containsKey(t)) {
//                return new int[]{i, hash.get(t)};
//            }
//            hash.put(nums[i], i);
//        }
//        return new int[]{-1, -1};
//    }
//}


// leetcode 49. 字母异位词分组
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 字母异位词：单词长度相同，且字母种类对应个数相同
        // 可以将每个单词进行排序，看看单词之间排完序后的 x 是否相同，
        // 如果是，则说明是一组字母异位词。
        // 可以用 hash 表来做，将 x 作为键，同一组的单词作为值(数组)
        // 最后返回哈希表即可
        Map<String, List<String>> hash = new HashMap<>();
        for (String word : strs) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            List<String> tmp = hash.getOrDefault(key, new ArrayList<String>());
            tmp.add(word);
            hash.put(key, tmp);
        }
        return new ArrayList<List<String>>(hash.values());
    }
}