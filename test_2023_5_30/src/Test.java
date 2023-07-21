public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BinaryTree.TreeNode root = binaryTree.createTree();
        System.out.println(binaryTree.nodeSize2(root));
        System.out.println(binaryTree.getLeafSize(root));
        System.out.println(binaryTree.getHeight(root));
    }
}
