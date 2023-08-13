

//LeetCode 496. 下一个更大元素 I
//class Solution {
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        //暴力解法
//        //因为是找nums1的更大元素
//        //所以 遍历 nums1
//        //然后 从右向左 遍历 nums2(右边的元素)
//        //来找n1对应于n2的元素的位置pos
//        //然后再从这个位置pos+1处往后遍历
//        //找到比n1大的元素，就保存
//        //没找到就改为-1
//        int[] ans = new int[nums1.length];
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = nums2.length - 1; j >= 0; j--) {
//                if (nums1[i] == nums2[j]) {
//                    boolean flg = false;
//                    for (int k = j + 1; k < nums2.length; k++) {
//                        if (nums2[k] > nums1[i]) {
//                            flg = true;
//                            ans[i] = nums2[k];
//                            break;
//                        }
//                    }
//                    if (!flg) {
//                        ans[i] = -1;
//                    }
//                }
//            }
//        }
//        return ans;
//    }
//}