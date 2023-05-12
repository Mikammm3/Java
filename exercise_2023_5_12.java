
//LeetCode 287. 寻找重复数
class Solution {
    public int findDuplicate(int[] nums) {
        int count = 0;
        int num = 0;
        int[] arr = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            arr[tmp]++;
            if (arr[tmp] > count) {
                count = arr[tmp];
                num = tmp;
            }
        }
        return num;
    }
}