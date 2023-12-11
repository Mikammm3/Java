
// LeetCode 24. 两两交换链表中的节点
//class Solution {
//    public ListNode swapPairs(ListNode head) {
//        if (head == null) return null;
//        ListNode newHead = new ListNode(-1);
//        newHead.next = head;
//        ListNode prev = newHead, cur = head, next = cur.next;
//        while (cur != null && next != null) {
//
//            ListNode nnext = null;
//            if (next != null) nnext = next.next;
//            prev.next = next;
//            next.next = cur;
//            cur.next = nnext;
//            prev = cur;
//            cur = nnext;
//            if (cur == null) break;
//            next = cur.next;
//        }
//        return newHead.next;
//    }
//}


// LeetCode 143. 重排链表
//class Solution {
//    public void reorderList(ListNode head) {
//        if (head == null || head.next == null || head.next.next == null) return;
//        // 1. 找中间节点
//        ListNode fast = head, slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//
//        // 2. 翻转
//        // prev 就是新头
//        ListNode prev = slow, cur = slow.next;
//        // 防止形成循环
//        slow.next = null;
//        while (cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//
//        // 3. 合并链表
//        ListNode newHead = new ListNode(-1);
//        newHead.next = head;
//        cur = newHead; // cur 可以理解为 head
//        while (prev != null && cur != null && head != prev) {
//            ListNode headNext = head.next, prevNext = prev.next;
//            // 先加头
//            cur.next = head;
//            // 往后走加 prev
//            cur = cur.next;
//            cur.next = prev;
//            // 往后走
//            cur = cur.next;
//            head = headNext;
//            prev = prevNext;
//        }
//        head = newHead.next;
//    }
//}