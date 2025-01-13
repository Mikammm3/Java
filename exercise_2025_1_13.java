

// leetcode 78. 子集
//class Solution {
//    List<List<Integer>> ret = new ArrayList<>();
//    List<Integer> path = new ArrayList<>();
//
//    public List<List<Integer>> subsets(int[] nums) {
//        ret.add(new ArrayList<>());
//        dfs(nums, 0);
//        return ret;
//    }
//
//    public void dfs(int[] nums, int index) {
//        if (index >= nums.length)
//            return;
//
//        for (int i = index; i < nums.length; i++) {
//
//            path.add(nums[i]);
//            ret.add(new ArrayList<>(path));
//            dfs(nums, i + 1);
//            path.remove(path.size() - 1);
//
//        }
//    }
//
//}