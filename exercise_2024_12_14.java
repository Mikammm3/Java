

// leetcode 160. 相交链表
///**
// * Definition for singly-linked list.
// * public class ListNode {
// * int val;
// * ListNode next;
// * ListNode(int x) {
// * val = x;
// * next = null;
// * }
// * }
// */
//public class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode listLong = headA;
//        ListNode listShort = headB;
//        int lenA = 0, lenB = 0;
//        while (listLong != null) {
//            lenA++;
//            listLong = listLong.next;
//        }
//        while (listShort != null) {
//            lenB++;
//            listShort = listShort.next;
//        }
//        listLong = headA;
//        listShort = headB;
//        int size = lenA - lenB;
//        if (size < 0) {
//            size = lenB - lenA;
//            listLong = headB;
//            listShort = headA;
//        }
//        while (size != 0) {
//            listLong = listLong.next;
//            size--;
//        }
//        while (listLong != listShort) {
//            listLong = listLong.next;
//            listShort = listShort.next;
//        }
//        return listLong;
//    }
//}


// leetcode 240. 搜索二维矩阵 II
//class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//        // 右上角
//        int i = 0, j = matrix[0].length - 1;
//        while (i < matrix.length && j >= 0) {
//            int val = matrix[i][j];
//            if (val > target) {
//                j--;
//            } else if (val < target) {
//                i++;
//            } else {
//                return true;
//            }
//        }
//
//        return false;
//    }
//}