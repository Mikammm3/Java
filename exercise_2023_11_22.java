

// LeetCode 15. 三数之和
//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> ret = new ArrayList<>();
//        int i = 0;
//        int n = nums.length;
//        while (i < n) {
//            if (nums[i] > 0) {
//                break;
//            }
//            int target = -nums[i];
//            int left = i + 1;
//            int right = n - 1;
//            while (left < right) {
//                int sum = nums[left] + nums[right];
//                if (sum > target) {
//                    right--;
//                } else if (sum < target) {
//                    left++;
//                } else {
//                    ret.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[left], nums[right])));
//                    left++;
//                    right--;
//                    while (left < right && nums[left] == nums[left - 1]) left++;
//                    while (left < right && nums[right] == nums[right + 1]) right--;
//                }
//            }
//            i++;
//            while (i < n && nums[i] == nums[i - 1]) i++;
//        }
//        return ret;
//    }
//}


//class Solution {
//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        List<List<Integer>> ret = new ArrayList<>();
//
//        Arrays.sort(nums);
//
//        int n = nums.length;
//        for (int i = 0; i < n; ) {
//            for (int j = i + 1; j < n; ) {
//                int left = j + 1;
//                int right = n - 1;
//                long aim = (long) target - nums[i] - nums[j];
//                while (left < right) {
//                    int sum = nums[left] + nums[right];
//                    if (sum > aim) {
//                        right--;
//                    } else if (sum < aim) {
//                        left++;
//                    } else {
//                        ret.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[left], nums[right])));
//                        left++;
//                        right--;
//                        while (left < right && nums[left] == nums[left - 1]) left++;
//                        while (left < right && nums[right] == nums[right + 1]) right--;
//                    }
//                }
//
//                j++;
//                while (j < n && nums[j] == nums[j - 1]) j++;
//            }
//            i++;
//            while (i < n && nums[i] == nums[i - 1]) i++;
//        }
//        return ret;
//    }
//}


//class Solution {
//    public int strStr(String haystack, String needle) {
//        int i = 0;
//        int j = 0;
//        int len1 = haystack.length();
//        int len2 = needle.length();
//        int index = -1;
//        while (i < len1) {
//            index = i;
//            while (index < len1 && j < len2 && haystack.charAt(index) == needle.charAt(j)) {
//                index++;
//                j++;
//            }
//            if (j >= len2) {
//                return i;
//            }
//            if (i >= len1) {
//                break;
//            }
//            i++;
//            j = 0;
//        }
//        return -1;
//    }
//}


// LeetCode 392. 判断子序列
//class Solution {
//    public boolean isSubsequence(String s, String t) {
//        if ((s == null && t == null) || (s.length() == 0 && t.length() == 0)) return true;
//
//        int j = 0;
//        for (int i = 0; i < t.length(); i++) {
//            if (j < s.length() && t.charAt(i) == s.charAt(j)) {
//                j++;
//            }
//            if (j >= s.length()) {
//                return true;
//            }
//        }
//        return false;
//    }
//}


// LeetCode 80. 删除有序数组中的重复项 II
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        if (nums.length <= 2) return nums.length;
//        int j = 2;
//        for (int i = 2; i < nums.length; i++) {
//            if (nums[i] != nums[j - 2]) {
//                nums[j++] = nums[i];
//            }
//        }
//        return j;
//    }
//}


// LeetCode 167. 两数之和 II - 输入有序数组
//class Solution {
//    public int[] twoSum(int[] numbers, int target) {
//        int left = 0;
//        int right = numbers.length - 1;
//        while (left < right) {
//            int sum = numbers[left] + numbers[right];
//            if (sum > target) {
//                right--;
//            } else if (sum < target) {
//                left++;
//            } else {
//                return new int[]{left + 1, right + 1};
//            }
//        }
//        return new int[]{-1, -1};
//    }
//}


// LeetCode 209. 长度最小的子数组
//class Solution {
//    public int minSubArrayLen(int target, int[] nums) {
//        // 滑动窗口就是同向双指针
//
//        int n = nums.length;
//        int len = Integer.MAX_VALUE;
//        int sum = 0;
//        for (int left = 0, right = 0; right < n; right++) {
//            sum += nums[right];
//            while (sum >= target) {
//                len = Math.min(len, right - left + 1);
//                sum -= nums[left++];
//            }
//
//        }
//        return ((len == Integer.MAX_VALUE) ? 0 : len);
//    }
//}


// LeetCode 3. 无重复字符的最长子串
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        if (s == null || s.length() == 0) return 0;
//        int n = s.length();
//        int len = 0;
//        HashSet<Character> hash = new HashSet<>();
//        for (int left = 0, right = 0; right < n; right++) {
//            if (hash.isEmpty()) {
//                hash.add(s.charAt(right));
//
//            } else {
//                char ch = s.charAt(right);
//                if (hash.contains(ch)) {
//                    while (left < n && s.charAt(left) != ch) {
//                        hash.remove(s.charAt(left));
//                        left++;
//                    }
//                    left++;
//                } else {
//                    hash.add(ch);
//                }
//            }
//            if (hash.size() > len) {
//                len = hash.size();
//            }
//        }
//        return len;
//    }
//}
//
//class Solution {
//    public int lengthOfLongestSubstring(String ss) {
//        int left = 0, right = 0, n = ss.length();
//        int[] hash = new int[128];
//        char[] s = ss.toCharArray();
//        int len = 0;
//        while (right < n) {
//            hash[s[right]]++;
//            while (hash[s[right]] > 1) {
//                hash[s[left++]]--;
//            }
//            len = Math.max(len, right - left + 1);
//            right++;
//        }
//        return len;
//    }
//}


//class Solution {
//    public int longestOnes(int[] nums, int k) {
//        if (k >= nums.length) return nums.length;
//        int len = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int lens = 0;
//            int cur = 0;
//            for (int j = i; j < nums.length; j++) {
//                if (nums[j] == 0) {
//                    if (cur < k) {
//                        lens++;
//                        cur++;
//                    } else {
//                        len = Math.max(len, j - i);
//                        break;
//                    }
//                } else {
//                    lens++;
//                }
//                len = Math.max(len, lens);
//            }
//        }
//        return len;
//    }
//}


// LeetCode 1004. 最大连续1的个数 III
//class Solution {
//    public int longestOnes(int[] nums, int k) {
//        int len = 0;
//        int zero = 0;
//        for (int left = 0, right = 0, n = nums.length; right < n; right++) {
//            if (nums[right] == 0) {
//                zero++;
//            }
//            while (zero > k) {
//                if (nums[left] == 0) {
//                    zero--;
//                }
//                left++;
//            }
//            len = Math.max(len, right - left + 1);
//        }
//        return len;
//    }
//}