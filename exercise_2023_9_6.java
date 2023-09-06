
//牛客网 JZ7 重建二叉树
//import java.util.*;
//
///*
// * public class TreeNode {
// *   int val = 0;
// *   TreeNode left = null;
// *   TreeNode right = null;
// *   public TreeNode(int val) {
// *     this.val = val;
// *   }
// * }
// */
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param preOrder int整型一维数组
//     * @param vinOrder int整型一维数组
//     * @return TreeNode类
//     */
//    public TreeNode reConstructBinaryTree(int[] pre, int[] vin) {
//        if (pre.length == 0 || vin.length == 0) {
//            return null;
//        }
//        //递归创建左右子树
//        //创建根节点，根的左边是左子树，根的右边是右子树
//        TreeNode root = new TreeNode(pre[0]);
//        for (int i = 0; i < vin.length; i++) {
//            if (vin[i] == pre[0]) {
//                // 左子树, 当 i 等于 in 序列时，说明 左子树有 i 个节点
//                // 左子树，注意 copyOfRange 函数，左闭右开
//                root.left = reConstructBinaryTree(
//                        Arrays.copyOfRange(pre, 1, i + 1),
//                        Arrays.copyOfRange(vin, 0, i));
//                // 右子树，注意 copyOfRange 函数，左闭右开
//                root.right = reConstructBinaryTree(
//                        Arrays.copyOfRange(pre, i + 1, pre.length),
//                        Arrays.copyOfRange(vin, i + 1, vin.length));
//
//
//                break;
//            }
//        }
//        return root;
//    }
//}