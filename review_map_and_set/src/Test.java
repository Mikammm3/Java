

public class Test {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(70);
        binarySearchTree.insert(59);
        binarySearchTree.insert(90);
        binarySearchTree.insert(37);
        binarySearchTree.insert(63);
        binarySearchTree.insert(83);
        binarySearchTree.insert(120);
        binarySearchTree.insert(85);
        binarySearchTree.insert(84);
        binarySearchTree.remove(90);

        System.out.println();
//        System.out.println(binarySearchTree.search(13));
//        System.out.println(binarySearchTree.search(83));
    }
}
