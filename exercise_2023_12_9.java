

// LeetCode 493. 翻转对
//class Solution {
//    int[] tmp;
//
//    public int reversePairs(int[] nums) {
//        tmp = new int[nums.length];
//        return mergeSort(nums, 0, nums.length - 1);
//    }
//
//    public int mergeSort(int[] nums, int left, int right) {
//        if (left >= right) return 0;
//        int mid = (left + right) / 2;
//        int ret = 0;
//        ret += mergeSort(nums, left, mid);
//        ret += mergeSort(nums, mid + 1, right);
//        // 计算翻转对
//        int cur1 = left, cur2 = mid + 1, i = 0;
//        while (cur1 <= mid) {
//            while (cur2 <= right && nums[cur1] / 2.0 <= nums[cur2]) {
//                cur2++;
//            }
//            if (cur2 > right) break;
//            ret += right - cur2 + 1;
//            cur1++;
//        }
//        cur1 = left;
//        cur2 = mid + 1;
//        while (cur1 <= mid && cur2 <= right) {
//            if (nums[cur1] > nums[cur2]) tmp[i++] = nums[cur1++];
//            else tmp[i++] = nums[cur2++];
//        }
//        while (cur1 <= mid) tmp[i++] = nums[cur1++];
//        while (cur2 <= right) tmp[i++] = nums[cur2++];
//
//        for (i = left; i <= right; i++) nums[i] = tmp[i - left];
//        return ret;
//    }
//}
//class Solution {
//    int[] tmp;
//
//    public int reversePairs(int[] nums) {
//        tmp = new int[nums.length];
//        return mergeSort(nums, 0, nums.length - 1);
//    }
//
//    public int mergeSort(int[] nums, int left, int right) {
//        if (left >= right) return 0;
//        int mid = (left + right) / 2;
//        int ret = 0;
//        ret += mergeSort(nums, left, mid);
//        ret += mergeSort(nums, mid + 1, right);
//        // 计算翻转对
//        int cur1 = left, cur2 = mid + 1, i = 0;
//        while (cur1 <= mid && cur2 <= right) {
//            if (nums[cur1] <= 2.0 * nums[cur2]) {
//                cur2++;
//            } else {
//                ret += right - cur2 + 1;
//                cur1++;
//            }
//        }
//        cur1 = left;
//        cur2 = mid + 1;
//        while (cur1 <= mid && cur2 <= right) {
//            if (nums[cur1] > nums[cur2]) tmp[i++] = nums[cur1++];
//            else tmp[i++] = nums[cur2++];
//        }
//        while (cur1 <= mid) tmp[i++] = nums[cur1++];
//        while (cur2 <= right) tmp[i++] = nums[cur2++];
//
//        for (i = left; i <= right; i++) nums[i] = tmp[i - left];
//        return ret;
//    }
//}
//class Solution {
//    int[] tmp;
//
//    public int reversePairs(int[] nums) {
//        tmp = new int[nums.length];
//        return mergeSort(nums, 0, nums.length - 1);
//    }
//
//    public int mergeSort(int[] nums, int left, int right) {
//        if (left >= right) return 0;
//        int mid = (left + right) / 2;
//        int ret = 0;
//        ret += mergeSort(nums, left, mid);
//        ret += mergeSort(nums, mid + 1, right);
//        // 计算翻转对
//        int cur1 = left, cur2 = mid + 1, i = 0;
//        while (cur1 <= mid && cur2 <= right) {
//            if (nums[cur1] / 2.0 > nums[cur2]) {
//                ret += mid - cur1 + 1;
//                cur2++;
//            } else {
//                cur1++;
//            }
//        }
//        cur1 = left;
//        cur2 = mid + 1;
//        while (cur1 <= mid && cur2 <= right) {
//            if (nums[cur1] > nums[cur2]) tmp[i++] = nums[cur2++];
//            else tmp[i++] = nums[cur1++];
//        }
//        while (cur1 <= mid) tmp[i++] = nums[cur1++];
//        while (cur2 <= right) tmp[i++] = nums[cur2++];
//
//        for (i = left; i <= right; i++) nums[i] = tmp[i - left];
//        return ret;
//    }
//}


// 牛客网 链表中倒数第k个结点
//public class Solution {
//    public ListNode FindKthToTail(ListNode head, int k) {
//        if (k <= 0 || head == null) return null;
//        ListNode fast = head, slow = head;
//        while (k - 1 != 0) {
//            fast = fast.next;
//            if (fast == null) {
//                return null;
//            }
//            k--;
//        }
//        while (fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return slow;
//    }
//}


// LeetCode 142. 环形链表 II
//public class Solution {
//    public ListNode detectCycle(ListNode head) {
//        if (head == null) return null;
//        ListNode fast = head, slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) {
//                fast = head;
//                while (fast != slow) {
//                    fast = fast.next;
//                    slow = slow.next;
//                }
//                return fast;
//            }
//        }
//        return null;
//    }
//}


// LeetCode LCR 021. 删除链表的倒数第 N 个结点
//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode fast = head, slow = head, prev = head;
//        while (n - 1 != 0) {
//            fast = fast.next;
//            n--;
//        }
//        while (fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        while (prev != null && prev.next != slow) {
//            prev = prev.next;
//        }
//        if (prev == null) return head.next;
//        prev.next = slow.next;
//        return head;
//    }
//}
//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode fast = head, slow = head, prev = null;
//        while (n - 1 != 0) {
//            fast = fast.next;
//            n--;
//        }
//        while (fast.next != null) {
//            if (fast.next.next == null) {
//                prev = slow;
//            }
//            fast = fast.next;
//            slow = slow.next;
//        }
//        // 此时 slow 就是倒数第 n 个节点
//        // while (prev != null && prev.next != slow) {
//        //     prev = prev.next;
//        // }
//        if (prev == null) return head.next;
//        prev.next = slow.next;
//        return head;
//    }
//}


// LeetCode 2. 两数相加
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode newHead = new ListNode();
//        ListNode cur1 = l1, cur2 = l2, cur = newHead;
//        int t = 0;// 进位
//        while (cur1 != null || cur2 != null) {
//            if (cur1 != null) {
//                t += cur1.val;
//                cur1 = cur1.next;
//            }
//            if (cur2 != null) {
//                t += cur2.val;
//                cur2 = cur2.next;
//            }
//            ListNode node = new ListNode(t % 10);
//            cur.next = node;
//            cur = cur.next;
//            t /= 10;
//        }
//        while (t != 0) {
//            ListNode node = new ListNode(t % 10);
//            cur.next = node;
//            cur = cur.next;
//            t /= 10;
//        }
//        return newHead.next;
//    }
//}
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode newHead = new ListNode();
//        ListNode cur1 = l1, cur2 = l2, cur = newHead;
//        int t = 0;// 进位
//        while (cur1 != null || cur2 != null || t != 0) {
//            if (cur1 != null) {
//                t += cur1.val;
//                cur1 = cur1.next;
//            }
//            if (cur2 != null) {
//                t += cur2.val;
//                cur2 = cur2.next;
//            }
//            ListNode node = new ListNode(t % 10);
//            cur.next = node;
//            cur = cur.next;
//            t /= 10;
//        }
//        return newHead.next;
//    }
//}


// 牛客网 BM11 链表相加(二)
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param head1 ListNode类
//     * @param head2 ListNode类
//     * @return ListNode类
//     */
//    public ListNode addInList(ListNode head1, ListNode head2) {
//        if (head1 == null) return head2;
//        if (head2 == null) return head1;
//        ListNode cur1 = head1.next, prev1 = head1;
//        ListNode cur2 = head2.next, prev2 = head2;
//
//        // 逆序
//        while (cur1 != null) {
//            ListNode cur1Next = cur1.next;
//            cur1.next = prev1;
//            prev1 = cur1;
//            cur1 = cur1Next;
//        }
//        head1.next = null;
//
//        while (cur2 != null) {
//            ListNode cur2Next = cur2.next;
//            cur2.next = prev2;
//            prev2 = cur2;
//            cur2 = cur2Next;
//        }
//        head2.next = null;
//
//        // 模拟加法
//        cur1 = prev1;
//        cur2 = prev2;
//        ListNode newHead = new ListNode(-1), cur = newHead;
//        int t = 0;
//        while (cur1 != null || cur2 != null || t != 0) {
//            if (cur1 != null) {
//                t += cur1.val;
//                cur1 = cur1.next;
//            }
//            if (cur2 != null) {
//                t += cur2.val;
//                cur2 = cur2.next;
//            }
//            cur.next = new ListNode(t % 10);
//            cur = cur.next;
//            t /= 10;
//        }
//        // 逆置
//        ListNode prev = newHead.next;
//        cur = prev.next;
//        while (cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        newHead.next.next = null;
//        return prev;
//    }
//}