
// 牛客网 JZ8 二叉树的下一个结点
//class Solution {
//
//    public ArrayList<TreeLinkNode> list = new ArrayList<>();
//
//    public TreeLinkNode GetNext(TreeLinkNode pNode) {
//        // pNode 是尾巴节点
//        // 先找到根节点
//        TreeLinkNode root = pNode;
//        while (root.next != null) {
//            root = root.next;
//        }
//        // 然后进行中序遍历，将遍历结果存入数组中，然后再取出下一个元素
//        inorder(root);
//
//        // 遍历数组
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) == pNode) {
//                return (i + 1) == list.size() ? null : list.get(i + 1);
//            }
//        }
//        return null;
//    }
//
//    public void inorder(TreeLinkNode root) {
//        if (root == null) {
//            return;
//        }
//        // 左 根 右
//        inorder(root.left);
//        list.add(root);
//        inorder(root.right);
//    }
//
//}