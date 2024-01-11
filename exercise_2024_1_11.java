
// LeetCode 46. 全排列
//class Solution {
//    public List<List<Integer>> ret = new ArrayList<>();
//    public List<Integer> path = new ArrayList<>();
//    public boolean[] check;
//
//    public List<List<Integer>> permute(int[] nums) {
//        check = new boolean[nums.length];
//        dfs(nums);
//        return ret;
//    }
//
//    public void dfs(int[] nums) {
//        if (path.size() == nums.length) {
//            ret.add(new ArrayList<>(path));
//            return;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (check[i] == false) {
//                path.add(nums[i]);
//                check[i] = true;
//                dfs(nums);
//                path.remove(path.size() - 1);
//                check[i] = false;
//            }
//        }
//    }
//}