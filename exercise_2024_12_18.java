
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
//        slow.next = slow.next.next;
//        return dummy.next;
//    }
//}


// leetcode 24. 两两交换链表中的节点
//class Solution {
//    public ListNode swapPairs(ListNode head) {
//        if (head == null) return head;
//        ListNode dummy = new ListNode();
//        dummy.next = head;
//        ListNode prev = dummy;
//        while (prev.next != null && prev.next.next != null) {
//            ListNode cur = prev.next;
//            ListNode curNext = cur.next;
//            ListNode curNextNext = curNext.next;
//            // 交换
//            curNext.next = cur;
//            cur.next = curNextNext;
//            prev.next = curNext;
//            // 往下走
//            prev = cur;
//        }
//        return dummy.next;
//    }
//}

//class Solution {
//    public ListNode swapPairs(ListNode head) {
//        if (head == null || head.next == null) return head;
//        ListNode newHead = head.next;
//        // 完成后续链表的节点交换
//        head.next = swapPairs(newHead.next);
//        // 连接
//        newHead.next = head;
//        return newHead;
//    }
//}