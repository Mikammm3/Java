
// leetcode 62. 不同路径
//class Solution {
//    public int uniquePaths(int m, int n) {
//        // 这道题可以用动态规划来做
//        // dp[i][j] 表示从 (0,0) 到达 (i,j) 有多少条不同的路径
//        // dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
//        int[][] dp = new int[m][n];
//        // 初始化，由于递推公式由左边和上边决定，
//        // 所以需要初始化最上边一行和最左边一列
//        for (int i = 0; i < m; i++) {
//            dp[i][0] = 1;
//        }
//        for (int i = 0; i < n; i++) {
//            dp[0][i] = 1;
//        }
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                if (i - 1 >= 0) dp[i][j] += dp[i - 1][j];
//                if (j - 1 >= 0) dp[i][j] += dp[i][j - 1];
//            }
//        }
//        return dp[m - 1][n - 1];
//    }
//}


// leetcode 64. 最小路径和
//class Solution {
//    public int minPathSum(int[][] grid) {
//        int m = grid.length;
//        int n = grid[0].length;
//        int[][] dp = new int[m][n];
//        // 用动态规划，dp[i][j] 表示从 (0,0) 到 (i,j) 的最小路径和
//        // dp[i][j] = Math.min(dp[i-1][j], dp[i][j - 1]) + grid[i][j]
//        dp[0][0] = grid[0][0];
//        for (int i = 1; i < m; i++) {
//            Arrays.fill(dp[i], Integer.MAX_VALUE);
//            dp[i][0] = grid[i][0] + dp[i - 1][0];
//        }
//        for (int i = 1; i < n; i++) {
//            dp[0][i] = grid[0][i] + dp[0][i - 1];
//        }
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                if (i - 1 >= 0) {
//                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + grid[i][j]);
//                }
//                if (j - 1 >= 0) {
//                    dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + grid[i][j]);
//                }
//            }
//        }
//        return dp[m - 1][n - 1];
//    }
//}


// leetcode 5. 最长回文子串
//class Solution {
//    String ret = "";
//
//    public String longestPalindrome(String s) {
//        // 用中心扩散法，直接 for 循环遍历，
//        // 从当前位置开始往两边扩散，然后再根据扩散出来的字符串更新结果
//        // aba abba
//        ret = s.substring(0, 1);
//        for (int i = 0; i < s.length(); i++) {
//            // aba 型回文字符串
//            isPalindrome(s, i, i);
//            // abba 型
//            isPalindrome(s, i, i + 1);
//        }
//        return ret;
//
//    }
//
//    // 从中间，向两边扩散
//    public void isPalindrome(String s, int left, int right) {
//        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
//            left--;
//            right++;
//        }
//        if (right - left - 1 > ret.length()) {
//            ret = s.substring(left + 1, right);
//        }
//    }
//}


// leetcode 1143. 最长公共子序列
//class Solution {
//    public int longestCommonSubsequence(String text1, String text2) {
//        // 动态规划来做
//        // dp[i][j] 表示 str1 的第 i 字符结尾的字符串 跟 str2 的第 j 字符结尾的字符串的最长公共子序列
//        // dp[i][j] = ?   str[i] == str2[j], dp[i][j] = dp[i-1][j-1] + 1
//        // str1[i] != str2[j], dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1])
//        int m = text1.length();
//        int n = text2.length();
//        int[][] dp = new int[m + 1][n + 1];
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
//                    dp[i][j] = dp[i - 1][j - 1] + 1;
//                } else {
//                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
//                }
//            }
//        }
//        return dp[m][n];
//    }
//}


// leetcode 72. 编辑距离
//class Solution {
//    public int minDistance(String word1, String word2) {
//        // 这道题用动态规划来做
//        // dp[i][j] 就是 str1 以第 i 字符结尾的字符串和 str2 以第 j 字符结尾的字符串的最少操作数
//        // dp[i][j] =    str1[i - 1] == str2[j - 1], dp[i][j] = dp[i-1][j-1]
//        // str1[i - 1] != str2[j - 1], 分三个操作：插入删除替换:
//        // 当进行替换操作时, str1[i - 1] == str2[j - 1] 了，所以会回到上一步 = dp[i-1][j-1] + 1
//        // 当进行添加/删除时, dp[i][j] = min(dp[i-1][j], dp[i][j-1]) + 1
//        // 初始化
//        int m = word1.length();
//        int n = word2.length();
//        int[][] dp = new int[m + 1][n + 1];
//        for (int i = 0; i <= m; i++) {
//            // str2 为空串, str1 有 i 个字符
//            dp[i][0] = i;
//        }
//        for (int i = 0; i <= n; i++) {
//            // str1 为空串, str2 有 i 个字符
//            dp[0][i] = i;
//        }
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
//                    dp[i][j] = dp[i - 1][j - 1];
//                } else {
//                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
//                    dp[i][j] = Math.min(dp[i - 1][j - 1] + 1, dp[i][j]);
//                }
//            }
//        }
//
//        return dp[m][n];
//    }
//}


// leetcode 136. 只出现一次的数字
//class Solution {
//    public int singleNumber(int[] nums) {
//        int ret = 0;
//        for (int x : nums) {
//            ret ^= x;
//        }
//        return ret;
//    }
//}


// leetcode 169. 多数元素
//class Solution {
//    public int majorityElement(int[] nums) {
//        quickSort(nums, 0, nums.length - 1);
//        return nums[nums.length / 2];
//    }
//
//    public void quickSort(int[] nums, int left, int right) {
//        if (left >= right)
//            return;
//
//        int pivot = partition(nums, left, right);
//        quickSort(nums, left, pivot - 1);
//        quickSort(nums, pivot + 1, right);
//    }
//
//    public int partition(int[] nums, int left, int right) {
//        if (left >= right)
//            return -1;
//        int key = nums[left];
//        int i = left;
//        while (left < right) {
//            while (left < right && nums[right] >= key) {
//                right--;
//            }
//            while (left < right && nums[left] <= key) {
//                left++;
//            }
//            swap(nums, left, right);
//        }
//        swap(nums, i, left);
//        return left;
//    }
//
//    public void swap(int[] arr, int i, int j) {
//        int tmp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = tmp;
//    }
//
//}


// leetcode 75. 颜色分类
//class Solution {
//    public void sortColors(int[] nums) {
//        mergeSort(nums, 0, nums.length - 1);
//    }
//
//    public void mergeSort(int[] nums, int left, int right) {
//        if (left >= right)
//            return;
//        int mid = (left + right) / 2;
//        mergeSort(nums, left, mid);
//        mergeSort(nums, mid + 1, right);
//        merge(nums, left, mid, right);
//    }
//
//    public void merge(int[] nums, int left, int mid, int right) {
//        int i = left, j = mid + 1, k = 0;
//        int[] arr = new int[right - left + 1];
//        while (i <= mid && j <= right) {
//            if (nums[i] <= nums[j]) {
//                arr[k++] = nums[i++];
//            } else {
//                arr[k++] = nums[j++];
//            }
//        }
//        while (i <= mid) {
//            arr[k++] = nums[i++];
//        }
//        while (j <= right) {
//            arr[k++] = nums[j++];
//        }
//        for (i = left; i <= right; i++) {
//            nums[i] = arr[i - left];
//        }
//    }
//}