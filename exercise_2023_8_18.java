
//LeetCode 1441. 用栈操作构建数组
//class Solution {
//    public List<String> buildArray(int[] target, int n) {
//        List<String> ans = new ArrayList<>();
//        //用i来遍历1-n，用j来遍历target
//        for (int i = 1, j = 0; i <= n && j < target.length; i++) {
//            ans.add("Push");
//            if (i != target[j]) {
//                ans.add("Pop");//就是说i不存在于target中
//            } else {
//                j++;//存在的话j就往后走
//            }
//        }
//        return ans;
//    }
//}