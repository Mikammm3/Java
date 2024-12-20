

// leetcode 148. 排序链表
// class Solution {
//     public ListNode sortList(ListNode head) {
//         if(head == null || head.next == null) return head;
//         List<ListNode> arr = new ArrayList<>();
//         ListNode cur = head;
//         while(cur != null){
//             ListNode curNext = cur.next;
//             cur.next = null;
//             arr.add(cur);
//             cur = curNext;
//         }
//         // 排序
//         Collections.sort(arr, new Comparator<>(){
//             public int compare(ListNode o1, ListNode o2){
//                 return o1.val - o2.val;
//             }
//         });
//         // 交换完了，然后遍历数组即可
//         ListNode dummy = new ListNode();
//         cur = dummy;
//         for(int i = 0; i < arr.size(); i++){
//             cur.next = arr.get(i);
//             cur = cur.next;
//         }
//         return dummy.next;
//     }
// }
//class Solution {
//    public ListNode sortList(ListNode head) {
//        if (head == null || head.next == null) return head;
//        // 使用归并排序
//        // 先将链表成两个，找中间节点
//        ListNode fast = head.next;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        // 此时 slow.next 就是下个链表的头节点
//        // slow 就是第一个链表尾巴节点
//        fast = slow.next;
//        slow.next = null;
//        // 排序两个链表，归
//        ListNode head1 = sortList(head);
//        ListNode head2 = sortList(fast);
//        // 然后再合并链表，并
//        return merge(head1, head2);
//    }
//
//    public ListNode merge(ListNode head1, ListNode head2) {
//        if (head1 == null) return head2;
//        if (head2 == null) return head1;
//        ListNode dummy = new ListNode();
//        ListNode cur = dummy;
//        while (head1 != null && head2 != null) {
//            if (head1.val <= head2.val) {
//                cur.next = head1;
//                head1 = head1.next;
//            } else {
//                cur.next = head2;
//                head2 = head2.next;
//            }
//            cur = cur.next;
//        }
//        if (head1 != null) {
//            cur.next = head1;
//        }
//        if (head2 != null) {
//            cur.next = head2;
//        }
//        return dummy.next;
//    }
//}

// leetcode 23. 合并 K 个升序链表
//class Solution {
//    public ListNode mergeKLists(ListNode[] lists) {
//        if (lists.length == 0) return null;
//        if (lists.length == 1) return lists[0];
//        // 合并
//        ListNode ret = null;
//        for (int i = 0; i < lists.length; i++) {
//            ret = merge(ret, lists[i]);
//        }
//        return ret;
//
//    }
//
//    public ListNode merge(ListNode head1, ListNode head2) {
//        if (head1 == null) return head2;
//        if (head2 == null) return head1;
//        ListNode dummy = new ListNode();
//        ListNode cur = dummy;
//        while (head1 != null && head2 != null) {
//            if (head1.val <= head2.val) {
//                cur.next = head1;
//                head1 = head1.next;
//            } else {
//                cur.next = head2;
//                head2 = head2.next;
//            }
//            cur = cur.next;
//        }
//        if (head1 != null) cur.next = head1;
//        if (head2 != null) cur.next = head2;
//        return dummy.next;
//    }
//}
//class Solution {
//    // 可以用优先级队列来写
//    public ListNode mergeKLists(ListNode[] lists) {
//        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<>() {
//            public int compare(ListNode o1, ListNode o2) {
//                return o1.val - o2.val;
//            }
//        });
//        // 将链表数组的添加到优先级队列中
//        for (ListNode head : lists) {
//            if (head != null) queue.add(head);
//        }
//
//        ListNode dummy = new ListNode();
//        ListNode cur = dummy;
//        // 通过优先级队列来排序
//        while (!queue.isEmpty()) {
//            ListNode head = queue.poll();
//            cur.next = head;
//            cur = cur.next;
//            if (head.next != null) {
//                // 说明还有节点, 添加回优先级队列
//                queue.add(head.next);
//            }
//        }
//        return dummy.next;
//
//    }
//
//    public ListNode merge(ListNode head1, ListNode head2) {
//        if (head1 == null) return head2;
//        if (head2 == null) return head1;
//        ListNode dummy = new ListNode();
//        ListNode cur = dummy;
//        while (head1 != null && head2 != null) {
//            if (head1.val <= head2.val) {
//                cur.next = head1;
//                head1 = head1.next;
//            } else {
//                cur.next = head2;
//                head2 = head2.next;
//            }
//            cur = cur.next;
//        }
//        if (head1 != null) cur.next = head1;
//        if (head2 != null) cur.next = head2;
//        return dummy.next;
//    }
//}