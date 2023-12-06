

// LeetCode 912. 排序数组
//class Solution {
//
//    public int[] sortArray(int[] nums) {
//        sort(nums, 0, nums.length - 1);
//        return nums;
//    }
//
//
//    public void sort(int[] nums, int l, int r) {
//        if (l >= r) return;
//
//        // 数组分三块
//        int left = l - 1, right = r + 1;
//        int rand = nums[new Random().nextInt(r - l + 1) + l];
//        for (int i = l; i < right; ) {
//            if (nums[i] < rand) {
//                swap(nums, ++left, i++);
//            } else if (nums[i] == rand) {
//                i++;
//            } else {
//                swap(nums, --right, i);
//            }
//        }
//        // [l, left] [left + 1, right - 1]  [right, r]
//        // 递归左边
//        sort(nums, l, left);
//
//        // 递归右边
//        sort(nums, right, r);
//    }
//
//    public void swap(int[] nums, int left, int right) {
//        int tmp = nums[left];
//        nums[left] = nums[right];
//        nums[right] = tmp;
//    }
//}


// LeetCode 215. 数组中的第K个最大元素
//class Solution {
//    public int findKthLargest(int[] nums, int k) {
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        for (int i = 0; i < k; i++) {
//            queue.offer(nums[i]);
//        }
//        for (int i = k; i < nums.length; i++) {
//            int top = queue.peek();
//            if (nums[i] >= top) {
//                queue.poll();
//                queue.offer(nums[i]);
//            }
//        }
//        // for(int i = 0; i < k - 1;i++) queue.poll();
//        return queue.poll();
//    }
//}


// LeetCode 215. 数组中的第K个最大元素
//class Solution {
//    public int findKthLargest(int[] nums, int k) {
//        int n = qsort(nums, 0, nums.length - 1, k);
//        return n;
//    }
//
//    public int qsort(int[] nums, int l, int r, int k) {
//        if (l >= r) return nums[l];
//        int left = l - 1, right = r + 1;
//        int rand = nums[new Random().nextInt(r - l + 1) + l];
//        for (int i = l; i < right; ) {
//            if (nums[i] < rand) swap(nums, ++left, i++);
//            else if (nums[i] == rand) i++;
//            else swap(nums, --right, i);
//        }
//        // [l, left]  [left + 1, right - 1]  [right, r]
//        int c = r - right + 1, b = right - 1 - left, a = left - l + 1;
//        if (c >= k) return qsort(nums, right, r, k);
//        else if (b + c >= k) return nums[left + 1];
//        else return qsort(nums, l, left, k - c - b);
//    }
//
//    public void swap(int[] nums, int i, int j) {
//        int t = nums[i];
//        nums[i] = nums[j];
//        nums[j] = t;
//    }
//}


// LeetCode LCR 159. 库存管理 III
//class Solution {
//    public int[] inventoryManagement(int[] stock, int k) {
//
//        qsort(stock, 0, stock.length - 1, k);
//        int[] ret = new int[k];
//        for (int i = 0; i < k; i++) ret[i] = stock[i];
//        return ret;
//    }
//
//
//    public void qsort(int[] nums, int l, int r, int k) {
//        if (l >= r) return;
//
//        int rand = nums[new Random().nextInt(r - l + 1) + l];
//        int left = l - 1, right = r + 1;
//        for (int i = l; i < right; ) {
//            if (nums[i] < rand) swap(nums, ++left, i++);
//            else if (nums[i] == rand) i++;
//            else swap(nums, --right, i);
//        }
//        // [l, left] [left + 1, right - 1] [right, r]
//        int a = left - l + 1, b = right - left - 1;
//        if (a > k) qsort(nums, l, left, k);
//        else if (a + b >= k) {
//            return;
//        } else qsort(nums, right, r, k - a - b);
//    }
//
//
//    public void swap(int[] nums, int i, int j) {
//        int t = nums[i];
//        nums[i] = nums[j];
//        nums[j] = t;
//    }
//}