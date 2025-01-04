

// leetcode 239. 滑动窗口最大值
//class Solution {
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        int[] ans = new int[nums.length - k + 1];
//        // 使用队列来做
//        // 保证队列中的节点是按照从大到小来排序
//        LinkedList<Integer> queue = new LinkedList<>();
//        // 遍历每个元素，如果当前元素的值大于等于链表末尾值
//        // 就需要弹出链表末尾值
//        // 链表中存储的是数的下标
//        // 用 L 和 R 来标记窗口范围
//        // 如果队首元素在 L 到 R 之间，则说明元素有效
//        // 如果不在，就需要弹出队首元素
//        // 窗口形成后，最后队首元素就是最大值
//        for (int right = 0, i = 0; right < nums.length; right++) {
//            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[right]) {
//                queue.pollLast();
//            }
//            queue.addLast(right);
//
//            // 判断队首的最大值有效  [L, R] = [right+1-k, right]
//            if (queue.peek() < right + 1 - k) {
//                queue.poll();
//            }
//
//            if (right >= k - 1) {
//                // 更新最大值
//                ans[i++] = nums[queue.peek()];
//            }
//        }
//        return ans;
//    }
//}

// leetcode 76. 最小覆盖子串
//class Solution {
//    public String minWindow(String s, String t) {
//        int[] hashT = new int[128];
//        int[] hashS = new int[128];
//        String ret = "";
//        for (int i = 0; i < t.length(); i++) {
//            char ch = t.charAt(i);
//            hashT[ch]++;
//        }
//        for (int left = 0, right = 0, count = 0; right < s.length(); right++) {
//            char ch = s.charAt(right);
//            hashS[ch]++;
//            if (hashS[ch] <= hashT[ch]) count++;
//            if (count == t.length()) {
//                if (ret.length() == 0 || right - left + 1 < ret.length()) {
//                    ret = s.substring(left, right + 1);
//                }
//                while (left < right && count == t.length()) {
//                    char c = s.charAt(left);
//                    if (hashS[c] <= hashT[c]) {
//                        count--;
//                    }
//                    hashS[c]--;
//                    left++;
//                    if (right - left + 1 < ret.length() && count == t.length()) {
//                        ret = s.substring(left, right + 1);
//                    }
//                }
//            }
//
//        }
//        return ret;
//    }
//}

// leetcode 53. 最大子数组和
//class Solution {
//    public int maxSubArray(int[] nums) {
//        // dp[i] 表示以 i 下标结尾的元素的最大和
//        int[] dp = new int[nums.length];
//        dp[0] = nums[0];
//        int max = dp[0];
//        for (int i = 1; i < nums.length; i++) {
//            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
//            max = Math.max(max, dp[i]);
//        }
//        return max;
//    }
//}


// leetcode 56. 合并区间
//class Solution {
//    public int[][] merge(int[][] intervals) {
//        List<int[]> arr = new ArrayList<>();
//        for (int[] x : intervals) {
//            arr.add(x);
//        }
//        Collections.sort(arr, new Comparator<>() {
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] - o2[0];
//            }
//        });
//        List<int[]> ret = new ArrayList<>();
//        ret.add(arr.get(0));
//        for (int i = 1; i < arr.size(); i++) {
//            int[] tmp = ret.get(ret.size() - 1);
//            int[] cur = arr.get(i);
//            if (tmp[1] >= cur[0]) {
//                tmp[1] = Math.max(cur[1], tmp[1]);
//            } else {
//                ret.add(cur);
//            }
//        }
//        int[][] ans = new int[ret.size()][2];
//        int i = 0;
//        for (int[] x : ret) {
//            ans[i++] = x;
//        }
//        return ans;
//    }
//}


// leetcode 189. 轮转数组
//class Solution {
//    public void rotate(int[] nums, int k) {
//        k %= nums.length;
//        reverse(nums, 0, nums.length - 1);
//        reverse(nums, 0, k - 1);
//        reverse(nums, k, nums.length - 1);
//    }
//
//
//    public void reverse(int[] arr, int left, int right) {
//        while (left < right) {
//            int tmp = arr[left];
//            arr[left++] = arr[right];
//            arr[right--] = tmp;
//        }
//    }
//}


// leetcode 238. 除自身以外数组的乘积
//class Solution {
//    public int[] productExceptSelf(int[] nums) {
//        int[] left = new int[nums.length];
//        int[] right = new int[nums.length];
//        left[0] = 1;
//        right[nums.length - 1] = 1;
//        for (int i = 1; i < nums.length; i++) {
//            left[i] = left[i - 1] * nums[i - 1];
//        }
//        for (int i = nums.length - 2; i >= 0; i--) {
//            right[i] = right[i + 1] * nums[i + 1];
//        }
//        int[] ret = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            ret[i] = left[i] * right[i];
//        }
//        return ret;
//    }
//}


// leetcode 41. 缺失的第一个正数
//class Solution {
//    public int firstMissingPositive(int[] nums) {
//        int n = nums.length;
//        // 将负数置为 n + 1
//        int ret = 1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < 1) {
//                nums[i] = n + 1;
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int index = Math.abs(nums[i]);
//            if (index <= n) {
//                nums[index - 1] = -Math.abs(nums[index - 1]);
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (nums[i] > 0) {
//                return i + 1;
//            }
//        }
//        return nums.length + 1;
//    }
//}


// leetcode 73. 矩阵置零
//class Solution {
//    public void setZeroes(int[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        boolean[] col = new boolean[m];
//        boolean[] row = new boolean[n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (matrix[i][j] == 0) {
//                    col[i] = true;
//                    row[j] = true;
//                }
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (col[i] || row[j]) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//    }
//}

// leetcode 54. 螺旋矩阵
//class Solution {
//    public List<Integer> spiralOrder(int[][] matrix) {
//        List<Integer> ret = new ArrayList<>();
//        int x1 = 0, y1 = 0;
//        int x2 = matrix.length - 1, y2 = matrix[0].length - 1;
//        while (x1 <= x2 && y1 <= y2) {
//            for (int i = y1; i <= y2; i++) {
//                ret.add(matrix[x1][i]);
//            }
//            for (int i = x1 + 1; i <= x2; i++) {
//                ret.add(matrix[i][y2]);
//            }
//            if (x1 < x2) {
//                for (int i = y2 - 1; i >= y1; i--) {
//                    ret.add(matrix[x2][i]);
//                }
//            }
//            if (y1 < y2) {
//                for (int i = x2 - 1; i >= x1 + 1; i--) {
//                    ret.add(matrix[i][y1]);
//                }
//            }
//            x1++;
//            y1++;
//            x2--;
//            y2--;
//        }
//        return ret;
//    }
//}

// leetcode 48. 旋转图像
//class Solution {
//    public void rotate(int[][] matrix) {
//        // 对角线翻转，每行逆序
//        int n = matrix.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                int tmp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = tmp;
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            int left = 0, right = n - 1;
//            int[] arr = matrix[i];
//            while (left < right) {
//                int tmp = arr[left];
//                arr[left++] = arr[right];
//                arr[right--] = tmp;
//
//            }
//        }
//    }
//}