
// LeetCode 34. 在排序数组中查找元素的第一个和最后一个位置
//class Solution {
//    public int[] searchRange(int[] nums, int target) {
//        if (nums == null || nums.length == 0) return new int[]{-1, -1};
//        int begin = -1, end = -1;
//        // 求左端点
//        int left = 0, right = nums.length - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        if (nums[left] == target) begin = left;
//        left = 0;
//        right = nums.length - 1;
//        while (left < right) {
//            int mid = left + (right - left + 1) / 2;
//            if (nums[mid] > target) {
//                right = mid - 1;
//            } else {
//                left = mid;
//            }
//        }
//        if (nums[left] == target) end = left;
//        return new int[]{begin, end};
//    }
//}


// LeetCode 69. x 的平方根
//class Solution {
//    public int mySqrt(int x) {
//        if (x < 1) return 0;
//        long left = 1, right = x;
//        while (left < right) {
//            // 1 2 3 4 5    x = 4, x = 5
//            // 1 4 9 16 25
//            long mid = left + (right - left + 1) / 2;
//            if (mid * mid > x) {
//                right = mid - 1;
//            } else {
//                left = mid;
//            }
//        }
//        return (int) left;
//    }
//}


// LeetCode 35. 搜索插入位置
//class Solution {
//    public int searchInsert(int[] nums, int target) {
//        int left = 0, right = nums.length - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        if (nums[left] < target) return left + 1;
//        return left;
//    }
//}


// LeetCode 852. 山脉数组的峰顶索引
//class Solution {
//    public int peakIndexInMountainArray(int[] arr) {
//        int left = 1, right = arr.length - 2;
//        while (left < right) {
//            int mid = left + (right - left + 1) / 2;
//            if (arr[mid] > arr[mid - 1]) {
//                left = mid;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return left;
//    }
//}


// LeetCode 162. 寻找峰值
//class Solution {
//    public int findPeakElement(int[] nums) {
//        int left = 0, right = nums.length - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] > nums[mid + 1]) {
//                right = mid;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return left;
//    }
//}


// LeetCode 153. 寻找旋转排序数组中的最小值
//class Solution {
//    public int findMin(int[] nums) {
//        if (nums.length == 1) return nums[0];
//        int rs = nums[0];
//        int left = 1, right = nums.length - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] >= rs) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        int min = nums[left];
//        return Math.min(rs, min);
//    }
//}
//class Solution {
//    public int findMin(int[] nums) {
//        int rs = nums[nums.length - 1];// 参照物
//        int left = 0, right = nums.length - 2;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] > rs) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        return Math.min(nums[left], rs);
//    }
//}


// LeetCode LCR 173. 点名
//class Solution {
//    public int takeAttendance(int[] records) {
//        // int[] hash = new int[records.length + 1];
//        // for(int x : records) hash[x]++;
//        // for(int i = 0; i < hash.length; i++){
//        //     if(hash[i] == 0) return i;
//        // }
//        // return 0;
//
//        // for(int i = 0; i < records.length; i++){
//        //     if(i != records[i]) return i;
//        // }
//        // return records.length;
//
//        // int ret = 0;
//        // for(int i = 0; i < records.length; i++){
//        //     ret ^= records[i];
//        // }
//        // for(int i = 0; i < records.length + 1;i++){
//        //     ret ^= i;
//        // }
//        // return ret;
//
//        // int n = records.length;
//        // int sum = n * (n + 1) / 2;
//        // for(int x : records) sum -= x;
//        // return sum;
//
//        int left = 0, right = records.length - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (mid == records[mid]) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        // 0 1 2 3 4
//        if (records[left] == left) return left + 1;
//        return left;
//
//    }
//}


// LeetCode 74. 搜索二维矩阵
//class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int m = matrix.length;// 行
//        int n = matrix[0].length;// 列
//        // 两次二分查找
//        // 找出行和列
//        int left = -1, right = m - 1;
//        while (left < right) {
//            int mid = left + (right - left + 1) / 2;
//            if (matrix[mid][0] <= target) {
//                left = mid;
//            } else {
//                right = mid - 1;
//            }
//        }
//        if (left == -1) return false;
//        int c = left;
//        left = 0;
//        right = n - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (matrix[c][mid] > target) {
//                right = mid - 1;
//            } else if (matrix[c][mid] < target) {
//                left = mid + 1;
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }
//}


// LeetCode 33. 搜索旋转排序数组
//class Solution {
//    public int search(int[] nums, int target) {
//        int rs = nums[nums.length - 1];
//        int left = 0, right = nums.length - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] > rs) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//
//        int c = left, d = nums.length - 1;
//        int a = 0, b = c - 1;
//        while (c <= d) {
//            int mid = c + (d - c) / 2;
//            if (nums[mid] > target) {
//                d = mid - 1;
//            } else if (nums[mid] < target) {
//                c = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        while (a <= b) {
//            int mid = a + (b - a) / 2;
//            if (nums[mid] > target) {
//                b = mid - 1;
//            } else if (nums[mid] < target) {
//                a = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
//}


// LeetCode 4. 寻找两个正序数组的中位数
//class Solution {
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int i = 0, len1 = nums1.length, j = 0, len2 = nums2.length;
//        int k = 0;
//        int[] arr = new int[len1 + len2];
//        while (i < len1 && j < len2) {
//            if (nums1[i] < nums2[j]) {
//                arr[k++] = nums1[i++];
//            } else {
//                arr[k++] = nums2[j++];
//            }
//            // if(k > n) break;
//        }
//        while (i < len1) {
//            arr[k++] = nums1[i++];
//        }
//        while (j < len2) {
//            arr[k++] = nums2[j++];
//        }
//        if (arr.length % 2 == 0) {
//            return (arr[k / 2 - 1] + arr[k / 2]) / 2.0;
//        } else {
//            return arr[k / 2];
//        }
//    }
//}