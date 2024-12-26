
// leetcode 46. 全排列
//class Solution {
//    public List<List<Integer>> permute(int[] nums) {
//        // 找的是不重复的数字，所以需要一个布尔数组来确认当前元素是否已经遍历过
//        // index 代表已经挑选好了 index 个元素
//        permute(nums, new boolean[nums.length], 0);
//        return ret;
//    }
//
//    // 用来放置遍历到的子数组
//    List<Integer> arr = new ArrayList<>();
//    List<List<Integer>> ret = new ArrayList<>();
//
//    public void permute(int[] nums, boolean[] flg, int index) {
//        if (index == nums.length) {
//            ret.add(new ArrayList<>(arr));
//            return;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (!flg[i]) {
//                flg[i] = true;
//                arr.add(nums[i]);
//                // 去生成下一个元素
//                permute(nums, flg, index + 1);
//                // 回溯
//                flg[i] = false;
//                arr.remove(arr.size() - 1);
//            }
//        }
//    }
//}


// leetcode 78. 子集
//class Solution {
//    public List<List<Integer>> subsets(int[] nums) {
//        // 空集
//        ret.add(new ArrayList<>());
//        subsets(nums, 0);
//        return ret;
//    }
//
//    public void subsets(int[] nums, int index) {
//        if (index >= nums.length)
//            return;
//        for (int i = index; i < nums.length; i++) {
//            path.add(nums[i]);
//            // 由于是子集，遍历到了元素直接添加进来
//            ret.add(new ArrayList<>(path));
//            // 然后再递归去生成下一个元素
//            subsets(nums, i + 1);
//            // 遍历完以 nums[i] 开头的子集后，回溯，继续去寻找另一个元素开头的子集
//            path.remove(path.size() - 1);
//        }
//    }
//
//    // 记录答案
//    List<List<Integer>> ret = new ArrayList<>();
//    // path 为子数组
//    List<Integer> path = new ArrayList<>();
//}