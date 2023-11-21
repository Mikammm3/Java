
// LeetCode 206. 反转链表
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode newHead = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }
//}


// LeetCode 11. 盛最多水的容器
//class Solution {
//    public int maxArea(int[] height) {
//        int left = 0;
//        int right = height.length - 1;
//        int vmax = 0;
//        while (left < right) {
//            int v = Math.min(height[left], height[right]) * (right - left);
//            if (v > vmax) {
//                vmax = v;
//            }
//            if (height[left] > height[right]) {
//                right--;
//            } else {
//                left++;
//            }
//        }
//        return vmax;
//    }
//}


// LeetCode 611. 有效三角形的个数
//class Solution {
//    public int triangleNumber(int[] nums) {
//        int count = 0;
//        Arrays.sort(nums);
//        for (int i = nums.length - 1; i >= 2; i--) {
//            int left = 0;
//            int right = i - 1;
//            while (left < right) {
//                if (nums[left] + nums[right] > nums[i]) {
//                    count += (right - left);
//                    right--;
//                } else {
//                    left++;
//                }
//            }
//        }
//        return count;
//    }
//}


// LeetCode LCR 179. 查找总价格为目标值的两个商品
//class Solution {
//    public int[] twoSum(int[] price, int target) {
//        int left = 0;
//        int right = price.length - 1;
//        while (left < right) {
//            if (price[left] + price[right] > target) {
//                right--;
//            } else if (price[left] + price[right] < target) {
//                left++;
//            } else {
//                return new int[]{price[left], price[right]};
//            }
//        }
//        return new int[]{0, 0};
//    }
//}