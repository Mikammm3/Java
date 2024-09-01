

// leetcode LCR 171. 训练计划 V
//class Solution {
//    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if (headA == null || headB == null) return null;
//        int countA = 0;
//        int countB = 0;
//        ListNode fast = headA;
//        ListNode slow = headB;
//        while (fast != null) {
//            fast = fast.next;
//            countA++;
//        }
//        while (slow != null) {
//            slow = slow.next;
//            countB++;
//        }
//        fast = headA;
//        slow = headB;
//        int len = countA - countB;
//        if (len < 0) {
//            len = countB - countA;
//            fast = headB;
//            slow = headA;
//        }
//        while (len != 0) {
//            fast = fast.next;
//            len--;
//        }
//        while (fast != slow) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return fast;
//
//    }
//}


// leetcode LCR 154. 复杂链表的复制
//class Solution {
//    public Node copyRandomList(Node head) {
//        if (head == null) return null;
//        Node dummy = new Node(-1);
//        Node tmp = dummy;
//        Node cur = head;
//        Map<Node, Node> hash = new HashMap<>();
//        // 将老节点与新节点的关系存起来
//        while (cur != null) {
//            Node node = new Node(cur.val);
//            hash.put(cur, node);
//            cur = cur.next;
//        }
//        cur = head;
//        while (cur != null) {
//            hash.get(cur).next = hash.get(cur.next);
//            hash.get(cur).random = hash.get(cur.random);
//            cur = cur.next;
//        }
//
//        return hash.get(head);
//
//    }
//}