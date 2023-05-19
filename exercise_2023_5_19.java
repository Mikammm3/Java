//public class exercise_2023_5_19 {
//}


//LeetCode 118. 杨辉三角
//class Solution {
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> ret = new ArrayList<>();
//        ret.add(1);
//        ans.add(ret);
//        //上面代码完成第一行
//        for (int i = 1; i < numRows; i++) {
//            List<Integer> curRow = new ArrayList<>();
//            curRow.add(1);//每一行的第一个
//
//            //处理每一行的中间
//            //1
//            //1 1
//            //1 2 1
//            //1 3 3 1
//            //1 4 6 4 1
//            //前一行
//            List<Integer> pervRow = ans.get(i - 1);
//            for (int j = 1; j < i; j++) {
//                int x = pervRow.get(j - 1) + pervRow.get(j);
//                curRow.add(x);
//            }
//
//            curRow.add(1);//每一行的最后一个
//            ans.add(curRow);
//        }
//        return ans;
//    }
//}


//LeetCode 27. 移除元素
//class Solution {
//    public int removeElement(int[] nums, int val) {
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == val) {
//                continue;
//            }
//            nums[j++] = nums[i];
//        }
//        return j;
//    }
//}


//LeetCode 26. 删除有序数组中的重复项
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int k = 0;
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] == nums[j]) {
//                    for (int k = j; k < n - 1; k++) {
//                        nums[k] = nums[k + 1];
//                    }
//                    n--;
//                    j--;
//                }
//            }
//        }
//        return n;
//    }
//}


//LeetCode 88. 合并两个有序数组
//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = m - 1;
//        int j = n - 1;
//        int k = m + n - 1;
//        while (i >= 0 && j >= 0) {
//            if (nums1[i] > nums2[j]) {
//                nums1[k--] = nums1[i--];
//            } else {
//                nums1[k--] = nums2[j--];
//            }
//        }
//        while (i >= 0) {
//            nums1[k--] = nums1[i--];
//        }
//        while (j >= 0) {
//            nums1[k--] = nums2[j--];
//        }
//    }
//}