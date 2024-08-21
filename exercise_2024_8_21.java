

// leetcode LCR 172. 统计目标成绩的出现次数
//class Solution {
//    public int countTarget(int[] scores, int target) {
//        int count = 0;
//        for (int i = 0; i < scores.length; i++) {
//            if (scores[i] == target) {
//                count++;
//            }
//        }
//        return count;
//    }
//}
//class Solution {
//    public int countTarget(int[] scores, int target) {
//        // 通过二分查找找出 target 的左边界
//        int left = 0, right = scores.length - 1;
//        while (left < right) {
//            int mid = (left + right) / 2;
//            if (scores[mid] >= target) {
//                right = mid;
//            } else {
//                left = mid + 1;
//            }
//        }
//        // 如果没找到，说明数组没有 target
//        if (scores[left] != target) return 0;
//        int l = left;
//
//        // 通过二分查找找出 target 的右边界
//        left = 0;
//        right = scores.length - 1;
//        while (left < right) {
//            int mid = (left + right + 1) / 2;
//            if (scores[mid] <= target) {
//                left = mid;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return right - l + 1;
//    }
//}


// leetcode LCR 170. 交易逆序对的总数
//class Solution {
//    int count = 0;
//
//    public int reversePairs(int[] record) {
//        // 可以用归并排序来做
//        mergeSort(record, 0, record.length - 1);
//        return count;
//    }
//
//    public void mergeSort(int[] arr, int left, int right) {
//        // 只有一个元素，不用排序
//        if (left >= right) return;
//
//        // 二分
//        int mid = (left + right) / 2;
//        // 分割左边
//        mergeSort(arr, left, mid);
//        // 分割右边
//        mergeSort(arr, mid + 1, right);
//        // 合并
//        merge(arr, left, mid, right);
//    }
//
//    public void merge(int[] arr, int left, int mid, int right) {
//        int[] tmpArr = new int[right - left + 1];
//        // 合并有序数组
//        int i = left, j = mid + 1, k = 0;
//        while (i <= mid && j <= right) {
//            if (arr[i] <= arr[j]) {
//                tmpArr[k++] = arr[i++];
//            } else {
//                // 因为 arr[i] > arr[j]
//                // 所以 left 到 mid 区间的所有元素都比 arr[j] 大
//                // [1,3,5,9]  [2,6,7]
//                // 3 > 2, 所以 3,5,9 也大于 2
//                count += (mid - i + 1);
//                tmpArr[k++] = arr[j++];
//            }
//        }
//        while (i <= mid) {
//            tmpArr[k++] = arr[i++];
//        }
//        while (j <= right) {
//            tmpArr[k++] = arr[j++];
//        }
//        // 拷贝回原数组
//        for (i = left; i <= right; i++) {
//            arr[i] = tmpArr[i - left];
//        }
//    }
//}