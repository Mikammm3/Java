
//牛客网 BM20 数组中的逆序对
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param nums int整型一维数组
//     * @return int整型
//     */
//    public int InversePairs(int[] nums) {
//        //逆序对 太多，可能会溢出，所以用long
//        long count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] > nums[j]) {
//                    count++;
//                }
//            }
//        }
//        return Math.abs((int) (count % 1000000007));
//    }
//}