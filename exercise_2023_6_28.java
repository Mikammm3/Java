

//牛客网 JZ6 从尾到头打印链表
//import java.util.*;
///**
// *    public class ListNode {
// *        int val;
// *        ListNode next = null;
// *
// *        ListNode(int val) {
// *            this.val = val;
// *        }
// *    }
// *
// */
//import java.util.ArrayList;
//
//public class Solution {
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        if (listNode == null) {
//            return new ArrayList<>();
//        }
//        ArrayList<Integer> ans = new ArrayList<>();
//        while (listNode != null) {
//            int tmp = listNode.val;
//            ans.add(tmp);
//            listNode = listNode.next;
//        }
//        int left = 0;
//        int right = ans.size() - 1;
//        while (left < right) {
//            int tmp = ans.get(left);//a
//            ans.set(left, ans.get(right));//a = b;
//            ans.set(right, tmp);//b = tmp;
//            left++;
//            right--;
//        }
//        return ans;
//    }
//}