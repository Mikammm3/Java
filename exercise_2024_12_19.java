
// leetcode 25. K 个一组翻转链表
//class Solution {
//    public ListNode reverseKGroup(ListNode head, int k) {
//        if (head == null || head.next == null) return head;
//        int count = 0;
//        // 新的头节点
//        ListNode newHead = head;
//        // 下一次需要翻转的开始节点
//        ListNode n = head;
//        while (count < k && n != null) {
//            newHead = n;
//            n = n.next;
//            count++;
//        }
//        // 判断是否够 K 个
//        if (count < k) {
//            return head;
//        }
//        // 翻转链表
//        ListNode prev = head;
//        ListNode cur = head.next;
//        while (cur != n) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        // 连接
//        head.next = reverseKGroup(n, k);
//        return newHead;
//    }
//}

// leetcode 138. 随机链表的复制
//class Solution {
//    public Node copyRandomList(Node head) {
//        if (head == null) return null;
//        // 存储了老节点-> 新节点
//        Map<Node, Node> hash = new HashMap<>();
//        Node dummy = new Node(-1);
//        Node cur = head;
//        while (cur != null) {
//            Node node = new Node(cur.val);
//            hash.put(cur, node);
//            cur = cur.next;
//        }
//        cur = head;
//        dummy.next = hash.get(head);
//        while (cur != null) {
//            Node node = hash.get(cur);
//            node.next = hash.get(cur.next);
//            node.random = hash.get(cur.random);
//            cur = cur.next;
//        }
//        return dummy.next;
//    }
//}