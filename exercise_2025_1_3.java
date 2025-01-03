


//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> hash = new HashMap<>();
//        hash.put(nums[0], 0);
//        for (int i = 1; i < nums.length; i++) {
//            int t = target - nums[i];
//            if (hash.containsKey(t)) {
//                return new int[]{i, hash.get(t)};
//            }
//            hash.put(nums[i], i);
//        }
//        return new int[]{-1, -1};
//    }
//}

//class Solution {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        // 字母异位词：单词长度相同，且字母种类对应个数相同
//        // 可以将每个单词进行排序，看看单词之间排完序后的 x 是否相同，
//        // 如果是，则说明是一组字母异位词。
//        // 可以用 hash 表来做，将 x 作为键，同一组的单词作为值(数组)
//        // 最后返回哈希表即可
//        Map<String, List<String>> hash = new HashMap<>();
//        for (String word : strs) {
//            char[] arr = word.toCharArray();
//            Arrays.sort(arr);
//            String key = String.valueOf(arr);
//            List<String> tmp = hash.getOrDefault(key, new ArrayList<String>());
//            tmp.add(word);
//            hash.put(key, tmp);
//        }
//        return new ArrayList<List<String>>(hash.values());
//    }
//}

//class Solution {
//    public int longestConsecutive(int[] nums) {
//        if (nums == null || nums.length == 0) return 0;
//        Arrays.sort(nums);
//        // 最低至少有 1 连续
//        int count = 1;
//        int maxCount = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == nums[i - 1] + 1) {
//                // 连续就 count++
//                count++;
//            } else if (nums[i] == nums[i - 1]) {
//                // 如果是相同就不管
//                // 0 1 1 2
//                continue;
//            } else {
//                // 如果不连续，重置 count
//                count = 1;
//            }
//            // 比一下
//            if (count > maxCount) {
//                maxCount = count;
//            }
//        }
//        return maxCount;
//    }
//}

//class Solution {
//    public void moveZeroes(int[] nums) {
//        int count = 0;
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[j++] = nums[i];
//            }
//        }
//        for (; j < nums.length; j++) {
//            nums[j] = 0;
//        }
//    }
//}


//class Solution {
//    public int maxArea(int[] height) {
//        int left = 0, right = height.length - 1;
//        int maxArea = 0;
//        while (left < right) {
//            int curArea = Math.min(height[left], height[right]) * (right - left);
//            maxArea = Math.max(maxArea, curArea);
//            if (height[left] < height[right]) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//        return maxArea;
//
//    }
//}

//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> ret = new ArrayList<>();
//        Arrays.sort(nums);
//        int i = 0, n = nums.length;
//
//        // -4 -1 -1 0 1 2
//        while (i < n) {
//            if (nums[i] > 0) break;
//
//            int target = -nums[i];
//            int left = i + 1, right = n - 1;
//
//            while (left < right) {
//                int sum = nums[left] + nums[right];
//                if (sum > target) {
//                    right--;
//                } else if (sum < target) {
//                    left++;
//                } else {
//                    ret.add(new ArrayList<>(Arrays.asList(nums[left], nums[right], nums[i])));
//                    left++;
//                    right--;
//                    // 去重
//                    while (left < right && nums[left] == nums[left - 1]) left++;
//                    while (left < right && nums[right] == nums[right + 1]) right--;
//
//                }
//            }
//
//            i++;
//            // 去重
//            while (i < n && nums[i] == nums[i - 1]) i++;
//        }
//        return ret;
//    }
//}


//class Solution {
//    public int trap(int[] height) {
//        int[] leftWall = new int[height.length];
//        int[] rightWall = new int[height.length];
//        for (int i = 1; i < height.length; i++) {
//            leftWall[i] = Math.max(leftWall[i - 1], height[i - 1]);
//        }
//        for (int i = height.length - 2; i >= 0; i--) {
//            rightWall[i] = Math.max(rightWall[i + 1], height[i + 1]);
//        }
//        int ret = 0;
//        for (int i = 1; i < height.length - 1; i++) {
//            int minWall = Math.min(leftWall[i], rightWall[i]);
//            if (minWall > height[i]) {
//                ret += minWall - height[i];
//            }
//        }
//        return ret;
//    }
//}


//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        // if(s.length() == 0 || s.length() == 1) return s.length();
//        int[] hash = new int[200];
//        int maxCount = 0;
//        int left = 0, right = 0;
//        for (; right < s.length(); right++) {
//            hash[(int) s.charAt(right)]++;
//            if (hash[(int) s.charAt(right)] > 1) {
//                maxCount = Math.max(maxCount, right - left);
//                while (left < right && hash[(int) s.charAt(right)] > 1) {
//                    hash[(int) s.charAt(left)]--;
//                    left++;
//                }
//            }
//        }
//        maxCount = Math.max(maxCount, right - left);
//        return maxCount;
//    }
//}


//class Solution {
//    public List<Integer> findAnagrams(String s, String p) {
//        int[] hashP = new int[26];
//        for (int i = 0; i < p.length(); i++) {
//            hashP[p.charAt(i) - 'a']++;
//        }
//        int[] hashS = new int[26];
//
//        List<Integer> ret = new ArrayList<>();
//        for (int left = 0, right = 0, count = 0; right < s.length(); right++) {
//            char ch = s.charAt(right);
//            hashS[ch - 'a']++;
//            if (hashS[ch - 'a'] <= hashP[ch - 'a']) {
//                count++;
//            }
//            if (right - left + 1 > p.length()) {
//                char c = s.charAt(left++);
//                if (hashS[c - 'a'] <= hashP[c - 'a']) {
//                    count--;
//                }
//                hashS[c - 'a']--;
//            }
//            if (count == p.length()) {
//                ret.add(left);
//            }
//        }
//        return ret;
//    }
//}

//class Solution {
//    public List<Integer> findAnagrams(String s, String p) {
//        int[] hashP = new int[26];
//        for (int i = 0; i < p.length(); i++) {
//            hashP[p.charAt(i) - 'a']++;
//        }
//        int[] hashS = new int[26];
//
//        List<Integer> ret = new ArrayList<>();
//        for (int left = 0, right = 0, count = 0; right < s.length(); right++) {
//            char ch = s.charAt(right);
//            hashS[ch - 'a']++;
//            if (hashS[ch - 'a'] <= hashP[ch - 'a']) {
//                count++;
//            }
//            if (right - left + 1 > p.length()) {
//                char c = s.charAt(left++);
//                if (hashS[c - 'a'] <= hashP[c - 'a']) {
//                    count--;
//                }
//                hashS[c - 'a']--;
//            }
//            if (count == p.length()) {
//                ret.add(left);
//            }
//        }
//        return ret;
//    }
//}

//class Solution {
//    public int subarraySum(int[] nums, int k) {
//        // 前缀和
//        int sum = 0;
//        int count = 0;
//        Map<Integer, Integer> hash = new HashMap<>();
//        hash.put(0, 1);
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            int target = sum - k;
//            count += hash.getOrDefault(target, 0);
//            hash.put(sum, hash.getOrDefault(sum, 0) + 1);
//        }
//        return count;
//    }
//}