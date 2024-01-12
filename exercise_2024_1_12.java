
// LeetCode 78. 子集
//class Solution {
//    List<List<Integer>> ret = new ArrayList<>();
//    List<Integer> path = new ArrayList<>();
//
//    public List<List<Integer>> subsets(int[] nums) {
//        dfs(nums, 0);
//        return ret;
//    }
//
//    public void dfs(int[] nums, int i) {
//        if (i >= nums.length) {
//            ret.add(new ArrayList<>(path));
//            return;
//        }
//        path.add(nums[i]);
//        dfs(nums, i + 1);
//        path.remove(path.size() - 1);
//        dfs(nums, i + 1);
//    }
//}