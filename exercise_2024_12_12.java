
// leetcode 41. 缺失的第一个正数
//class Solution {
//    public int firstMissingPositive(int[] nums) {
//        // 求的是没有出现过的最小的正数
//        // 数组长度是 N，则最小正数范围就是 [1, N]
//        // 所以我们只关注 1 ~ N 范围的正数
//        // 那么我们就可以遍历数组，将所有 1~N 范围外的数字全部改成大于 N 的数字
//        // 然后再次遍历数组，将范围 1~N 的数字，如果出现了的话，那么就给它标记起来
//        // 比如说，出现了 2，那么就将 2-1 下标的值改为负数，将负数作为标记
//        // 最后再次遍历数组，如果遇到了负数，就返回下标+1
//        // 如果遍历完数组都没有返回，那就直接返回 N+1
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            // 在 [1, N] 范围外，就将范围外的数字标记成大于 N 的数
//            if (nums[i] < 1) {
//                nums[i] = n + 1;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            // 在 [1, N] 范围内，就可以将对应的下标改为负数，标记该数字为出现过的正数
//            int tmp = Math.abs(nums[i]);
//            if (tmp <= n) {
//                nums[tmp - 1] = -Math.abs(nums[tmp - 1]);
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            // 如果该数字是正数，则说明该数字没有被标记过，就需要返回对应下标 + 1
//            if (nums[i] > 0) {
//                return i + 1;
//            }
//        }
//        return n + 1;
//    }
//}

// leetcode 73. 矩阵置零
//class Solution {
//    public void setZeroes(int[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        boolean[] row = new boolean[m];
//        boolean[] col = new boolean[n];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                // 将 0 所对应的行和列都标记一下，后续再次遍历数组，如果对应行或者列为真
//                // 则将值赋为 0
//                if (matrix[i][j] == 0) {
//                    row[i] = true;
//                    col[j] = true;
//                }
//            }
//        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (row[i] || col[j]) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//
//    }
//}