

// LeetCode 912. 排序数组
//class Solution {
//    public int[] sortArray(int[] nums) {
//        merge(nums, 0, nums.length - 1);
//        return nums;
//    }
//
//
//    public void merge(int[] nums, int left, int right) {
//        if (left >= right) return;
//        int mid = left + (right - left) / 2;
//        merge(nums, left, mid);
//        merge(nums, mid + 1, right);
//
//        int i = left, j = mid + 1, k = 0;
//        int[] arr = new int[right - left + 1];
//        while (i <= mid && j <= right) {
//            if (nums[i] < nums[j]) arr[k++] = nums[i++];
//            else arr[k++] = nums[j++];
//        }
//        while (i <= mid) arr[k++] = nums[i++];
//        while (j <= right) arr[k++] = nums[j++];
//        for (i = 0; i < k; i++) nums[i + left] = arr[i];
//    }
//}
//class Solution {
//
//    int[] arr;
//
//    public int[] sortArray(int[] nums) {
//        arr = new int[nums.length];
//        merge(nums, 0, nums.length - 1);
//        return nums;
//    }
//
//
//    public void merge(int[] nums, int left, int right) {
//        if (left >= right) return;
//        int mid = left + (right - left) / 2;
//        merge(nums, left, mid);
//        merge(nums, mid + 1, right);
//
//        int i = left, j = mid + 1, k = 0;
//        while (i <= mid && j <= right) {
//            arr[k++] = nums[i] <= nums[j] ? nums[i++] : nums[j++];
//        }
//        while (i <= mid) arr[k++] = nums[i++];
//        while (j <= right) arr[k++] = nums[j++];
//        for (i = 0; i < k; i++) nums[i + left] = arr[i];
//    }
//}