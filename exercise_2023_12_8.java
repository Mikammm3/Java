

// LeetCode LCR 170. 交易逆序对的总数
//class Solution {
//    int[] arr;
//
//    public int reversePairs(int[] nums) {
//        arr = new int[nums.length];
//        return merge(nums, 0, nums.length - 1);
//    }
//
//
//    public int merge(int[] nums, int left, int right) {
//        if (left >= right) return 0;
//        int mid = (left + right) / 2;
//
//        int ret = 0;
//        ret += merge(nums, left, mid);
//        ret += merge(nums, mid + 1, right);
//
//        int cur1 = left, cur2 = mid + 1, i = 0;
//        while (cur1 <= mid && cur2 <= right) {
//            if (nums[cur1] > nums[cur2]) {
//                ret += mid - cur1 + 1;
//                arr[i++] = nums[cur2++];
//            } else {
//                arr[i++] = nums[cur1++];
//            }
//        }
//        while (cur1 <= mid) {
//            arr[i++] = nums[cur1++];
//        }
//        while (cur2 <= right) {
//            arr[i++] = nums[cur2++];
//        }
//        for (i = left; i <= right; i++) {
//            nums[i] = arr[i - left];
//        }
//        return ret;
//    }
//}
//class Solution {
//    int[] arr;
//
//    public int reversePairs(int[] nums) {
//        arr = new int[nums.length];
//        return merge(nums, 0, nums.length - 1);
//    }
//
//
//    public int merge(int[] nums, int left, int right) {
//        if (left >= right) return 0;
//        int mid = (left + right) / 2;
//        int ret = merge(nums, left, mid);
//        ret += merge(nums, mid + 1, right);
//        int cur1 = left, cur2 = mid + 1, i = 0;
//
//        while (cur1 <= mid && cur2 <= right) {
//            if (nums[cur1] > nums[cur2]) {
//                ret += right - cur2 + 1;
//                arr[i++] = nums[cur1++];
//            } else {
//                arr[i++] = nums[cur2++];
//            }
//        }
//        while (cur1 <= mid) {
//            arr[i++] = nums[cur1++];
//        }
//        while (cur2 <= right) {
//            arr[i++] = nums[cur2++];
//        }
//        for (i = left; i <= right; i++) {
//            nums[i] = arr[i - left];
//        }
//        return ret;
//    }
//}


// LeetCode 315. 计算右侧小于当前元素的个数
//class Solution {
//    int[] ret;
//    int[] index;
//    int[] tmp;
//    int[] tmpIndex;
//
//    public List<Integer> countSmaller(int[] nums) {
//        int n = nums.length;
//        tmp = new int[n];
//        tmpIndex = new int[n];
//        ret = new int[n];
//        index = new int[n];
//        for (int i = 0; i < n; i++) {
//            index[i] = i;
//        }
//
//        mergeSort(nums, 0, n - 1);
//        List<Integer> list = new ArrayList<>();
//        for (int x : ret) {
//            list.add(x);
//        }
//        return list;
//    }
//
//
//    public void mergeSort(int[] nums, int left, int right) {
//        if (left >= right) return;
//        int mid = (left + right) / 2;
//        mergeSort(nums, left, mid);
//        mergeSort(nums, mid + 1, right);
//
//
//        int cur1 = left, cur2 = mid + 1, i = 0;
//        while (cur1 <= mid && cur2 <= right) {
//            if (nums[cur1] > nums[cur2]) {
//                ret[index[cur1]] += right - cur2 + 1;
//                tmpIndex[i] = index[cur1];
//                tmp[i++] = nums[cur1++];
//            } else {
//                tmpIndex[i] = index[cur2];
//                tmp[i++] = nums[cur2++];
//            }
//        }
//        while (cur1 <= mid) {
//            tmpIndex[i] = index[cur1];
//            tmp[i++] = nums[cur1++];
//        }
//        while (cur2 <= right) {
//            tmpIndex[i] = index[cur2];
//            tmp[i++] = nums[cur2++];
//        }
//        for (i = left; i <= right; i++) {
//            nums[i] = tmp[i - left];
//            index[i] = tmpIndex[i - left];
//        }
//
//    }
//}