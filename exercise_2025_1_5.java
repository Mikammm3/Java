

// leetcode 240. 搜索二维矩阵 II
//class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        int x = 0, y = n - 1;
//        while (x < m && y >= 0) {
//            if (matrix[x][y] > target) {
//                y--;
//            } else if (matrix[x][y] < target) {
//                x++;
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }
//}

// leetcode 160. 相交链表
//public class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode pL = headA;
//        ListNode pS = headB;
//        int lenA = 0, lenB = 0;
//        ListNode cur = headA;
//        while (cur != null) {
//            lenA++;
//            cur = cur.next;
//        }
//        cur = headB;
//        while (cur != null) {
//            lenB++;
//            cur = cur.next;
//        }
//
//        int len = lenA - lenB;
//        if (len < 0) {
//            pL = headB;
//            pS = headA;
//            len = lenB - lenA;
//        }
//
//        while (len != 0) {
//            pL = pL.next;
//            len--;
//        }
//        while (pS != null && pL != null) {
//            if (pS == pL) return pS;
//            pS = pS.next;
//            pL = pL.next;
//        }
//
//        return null;
//    }
//}


// leetcode 206. 反转链表
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        if (head == null) return null;
//        ListNode cur = head.next;
//        ListNode prev = head;
//        head.next = null;
//        while (cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        return prev;
//    }
//}


// leetcode 234. 回文链表
//class Solution {
//    public boolean isPalindrome(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//
//        // 此时 slow 就是中间节点
//        ListNode prev = slow;
//        ListNode cur = slow.next;
//        while (cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//
//        while (prev != head) {
//            if (prev.val != head.val) {
//                return false;
//            }
//            if (prev == head.next) return true;
//            prev = prev.next;
//            head = head.next;
//        }
//        return true;
//
//    }
//}


// leetcode 141. 环形链表
//public class Solution {
//    public boolean hasCycle(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) return true;
//        }
//        return false;
//    }
//}


// leetcode 142. 环形链表 II
//public class Solution {
//    public ListNode detectCycle(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
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


// leetcode 21. 合并两个有序链表
//class Solution {
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode dummy = new ListNode();
//        ListNode cur = dummy;
//        while (list1 != null && list2 != null) {
//            if (list1.val <= list2.val) {
//                cur.next = list1;
//                list1 = list1.next;
//            } else {
//                cur.next = list2;
//                list2 = list2.next;
//            }
//            cur = cur.next;
//        }
//        if (list1 != null) {
//            cur.next = list1;
//        }
//        if (list2 != null) {
//            cur.next = list2;
//        }
//        return dummy.next;
//
//    }
//}

// leetcode 2. 两数相加
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode();
//        ListNode cur = dummy;
//        int digit = 0;// 表示进位
//        int tmp = 0;
//        while (l1 != null && l2 != null) {
//            int val = digit + l1.val + l2.val;
//            ListNode node = new ListNode(val % 10);
//            cur.next = node;
//            cur = cur.next;
//            digit = val / 10;
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//
//        while (l1 != null) {
//            int val = digit + l1.val;
//            ListNode node = new ListNode(val % 10);
//            cur.next = node;
//            cur = cur.next;
//            digit = val / 10;
//            l1 = l1.next;
//        }
//
//        while (l2 != null) {
//            int val = digit + l2.val;
//            ListNode node = new ListNode(val % 10);
//            cur.next = node;
//            cur = cur.next;
//            digit = val / 10;
//            l2 = l2.next;
//        }
//
//        while (digit != 0) {
//            int val = digit;
//            ListNode node = new ListNode(val % 10);
//            cur.next = node;
//            cur = cur.next;
//            digit = val / 10;
//        }
//
//        return dummy.next;
//    }
//}


// leetcode 19. 删除链表的倒数第 N 个结点
//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if (head == null) return null;
//        ListNode dummy = new ListNode();
//        dummy.next = head;
//        ListNode fast = dummy;
//        ListNode slow = dummy;
//        while (n != 0) {
//            fast = fast.next;
//            n--;
//        }
//        while (fast != null && fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//
//        if (slow != null && slow.next != null) {
//            ListNode next = slow.next.next;
//            slow.next = next;
//        }
//
//        return dummy.next;
//    }
//}


// leetcode 24. 两两交换链表中的节点
//class Solution {
//    public ListNode swapPairs(ListNode head) {
//        if (head == null || head.next == null) return head;
//
//        ListNode newHead = head.next;
//        ListNode tmp = newHead.next;
//        newHead.next = head;
//        head.next = swapPairs(tmp);
//        newHead.next = head;
//        return newHead;
//    }
//}