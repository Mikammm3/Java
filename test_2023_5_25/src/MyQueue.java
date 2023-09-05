import java.util.*;

class MyQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s2.empty()) {
            while (!s1.empty()) {
                int tmp = s1.pop();
                s2.push(tmp);
            }
        }
        return s2.pop();
    }

    public int peek() {

        return -1;
    }

    public boolean empty() {
        return false;
    }


}


class BinaryTree {
    static class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }


    public TreeNode createTree() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }

    public void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.print(cur.val + " ");
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
        System.out.println();
    }

//    public List<List<TreeNode>> levelOrder(TreeNode root) {
//        List<List<TreeNode>> ret = new ArrayList<>();
//        if (root == null) {
//            return ret;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            int tmp = queue.size();
//            //求一下当前队列的大小  4
//            // 出队列4次 相当于把 这一层的节点都 出队了
//            List<TreeNode> tmp2 = new ArrayList<>();
//            while (tmp != 0) {
//                TreeNode cur = queue.poll();
//                tmp2.add(cur);
//                tmp--;
//                System.out.print(cur.val + " ");
//                if (cur.left != null) {
//                    queue.offer(cur.left);
//                }
//                if (cur.right != null) {
//                    queue.offer(cur.right);
//                }
//            }
//            ret.add(tmp2);
//        }
//        return ret;
//    }

//    public List<TreeNode> preOrder2(TreeNode root) {
//        if (root == null) {
//            return null;
//        }
//        List<TreeNode> list = new LinkedList<>();
//
//        System.out.print(root.val + " ");
//        preOrder2(root.left);
//        preOrder2(root.right);
//    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }


    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }


//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ret = new ArrayList<>();
//        if (root == null) {
//            return ret;
//        }
//        List<Integer> left = inorderTraversal(root.left);
//        ret.addAll(left);
//        ret.add(root.val);
//        List<Integer> right = inorderTraversal(root.right);
//        ret.addAll(right);
//        return ret;
//    }
//
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> ret = new ArrayList<>();
//        if (root == null) {
//            return ret;
//        }
//        List<Integer> left = postorderTraversal(root.left);
//        ret.addAll(left);
//        List<Integer> right = postorderTraversal(root.right);
//        ret.addAll(right);
//        ret.add(root.val);
//        return ret;
//    }

    public int getLeafSize2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int left = getLeafSize2(root.left);
        int right = getLeafSize2(root.right);
        return left + right;
    }


    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return ((getHeight(root.left) > getHeight(root.right)) ? getHeight(root.left) : getHeight(root.right)) + 1;
    }
}


    /*int left = getHeight(root.left);
    int right = getHeight(root.right);
    int max = left > right ? left : right;
        return max + 1;*/