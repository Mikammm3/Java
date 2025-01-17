
// leetcode 4. 寻找两个正序数组的中位数
//class Solution {
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        // 找第 k 大
//        int len = nums1.length + nums2.length;
//        int k = len / 2 + 1;
//        if (len % 2 == 0) {
//            // 偶数
//            long a = findKth(nums1, nums2, k);
//            long b = findKth(nums1, nums2, k - 1);
//            return (a + b) / 2.0;
//        } else {
//            // 奇数
//            return findKth(nums1, nums2, k) * 1.0;
//        }
//    }
//
//
//    public int findKth(int[] nums1, int[] nums2, int k) {
//        if (nums1 == null || nums1.length == 0) return nums2[k - 1];
//        if (nums2 == null || nums2.length == 0) return nums1[k - 1];
//        if (k == 1) return Math.min(nums1[0], nums2[0]);
//        int k1 = Math.min(k / 2, nums1.length);
//        int k2 = Math.min(k - k1, nums2.length);
//        if (nums1[k1 - 1] > nums2[k2 - 1]) {
//            return findKth(nums1, Arrays.copyOfRange(nums2, k2, nums2.length), k - k2);
//        } else {
//            return findKth(Arrays.copyOfRange(nums1, k1, nums1.length), nums2, k - k1);
//        }
//    }
//
//}