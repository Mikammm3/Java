

//LeetCode 面试题 02.01. 移除重复节点
//class Solution {
//    public ListNode removeDuplicateNodes(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        Set<Integer> set = new HashSet<>();
//        ListNode cur = head;
//        while (cur != null && cur.next != null) {
//            set.add(cur.val);//set去重
//            if (cur.next != null && set.contains(cur.next.val)) {
//                cur.next = cur.next.next;//值重复了就跳过这个节点
//            } else {
//                cur = cur.next;
//            }
//        }
//        return head;
//    }
//}