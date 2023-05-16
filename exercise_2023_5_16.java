/*
public class exercise_2023_5_16 {

}
*/


//LeetCode 面试题 17.04. 消失的数字
//class Solution {
//    public int missingNumber(int[] nums) {
//        int[] arr = new int[nums.length + 1];
//        for (int i = 0; i < nums.length; i++) {
//            int tmp = nums[i];
//            arr[tmp]++;
//        }
//        int i = 0;
//        for (i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                break;
//            }
//        }
//        return i;
//    }
//}


//LeetCode 189. 轮转数组
//class Solution {
//    public static void reverse(int start, int end, int[] arr) {
//        while (start < end) {
//            int tmp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = tmp;
//            start++;
//            end--;
//        }
//    }
//
//    public void rotate(int[] nums, int k) {
//        k %= nums.length;
//        reverse(0, nums.length - 1, nums);
//        reverse(0, k - 1, nums);
//        reverse(k, nums.length - 1, nums);
//        String ans = Arrays.toString(nums);
//        System.out.println(ans);
//    }
//}
