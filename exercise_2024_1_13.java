
// LeetCode 1863. 找出所有子集的异或总和再求和
//class Solution {
//    public List<Integer> path = new ArrayList<>();
//    public List<List<Integer>> ret = new ArrayList<>();
//    public int sum = 0;
//
//    public int subsetXORSum(int[] nums) {
//        dfs(nums, 0);
//        return getSum();
//    }
//
//    public int getSum() {
//
//        while (!ret.isEmpty()) {
//            List<Integer> tmp = ret.remove(ret.size() - 1);
//            int t = 0;
//            while (!tmp.isEmpty()) {
//                t ^= tmp.remove(tmp.size() - 1);
//            }
//            sum += t;
//        }
//        return sum;
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