
// leetcode 236. 二叉树的最近公共祖先
//class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if (root == null) return null;
//        // 记录 p 的路径
//        Stack<TreeNode> stackP = new Stack<>();
//        getPath(root, p, stackP);
//        // 记录 q 的路径
//        Stack<TreeNode> stackQ = new Stack<>();
//        getPath(root, q, stackQ);
//
//        // 求相交节点
//        int sizeP = stackP.size();
//        int sizeQ = stackQ.size();
//        if (sizeP > sizeQ) {
//            int size = sizeP - sizeQ;
//            while (size != 0) {
//                stackP.pop();
//                size--;
//            }
//        } else {
//            int size = sizeQ - sizeP;
//            while (size != 0) {
//                stackQ.pop();
//                size--;
//            }
//        }
//        while (!stackP.isEmpty() && !stackQ.isEmpty()) {
//            TreeNode n1 = stackP.pop();
//            TreeNode n2 = stackQ.pop();
//            if (n1 == n2) {
//                return n1;
//            }
//        }
//        return null;
//    }
//
//    public boolean getPath(TreeNode root, TreeNode node, Stack<TreeNode> stack) {
//        if (root == null) return false;
//        // 根左右
//        stack.push(root);
//        if (root == node) return true;
//        boolean left = getPath(root.left, node, stack);
//        if (left == true) {
//            return true;
//        }
//        boolean right = getPath(root.right, node, stack);
//        if (right == true) {
//            return true;
//        }
//        // 到了这里，说明 root 不是路径上的节点，直接弹出，返回 false
//        stack.pop();
//        return false;
//
//    }
//}


//class Solution {
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        return buildTree(preorder, inorder, 0, inorder.length - 1);
//    }
//
//    // pi 为前序遍历的下标
//    public int pi;
//
//    // ib 是中序遍历的开始下标， ie 是中序遍历的结束下标
//    public TreeNode buildTree(int[] preorder, int[] inorder, int ib, int ie) {
//        if (ib > ie) {
//            // 说明此时没节点
//            return null;
//        }
//        // 根左右
//        TreeNode root = new TreeNode(preorder[pi]);
//        // 此时需要从中序遍历中找到对应的根的下标 ri
//        int ri = findIndex(inorder, ib, ie, preorder[pi]);
//        if (ri < 0) {
//            // 说明没有对应的 ri
//            return null;
//        }
//        // 遍历过 pi 对应的节点，pi 就需要继续往后遍历
//        pi++;
//        root.left = buildTree(preorder, inorder, ib, ri - 1);
//        root.right = buildTree(preorder, inorder, ri + 1, ie);
//
//        return root;
//    }
//
//
//    public int findIndex(int[] inorder, int ib, int ie, int key) {
//        for (int i = ib; i <= ie; i++) {
//            if (inorder[i] == key) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//}


//class Solution {
//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        // 先初始化
//        pi = postorder.length - 1;
//        return buildTree(postorder, inorder, 0, inorder.length - 1);
//    }
//
//    // pi 为后序遍历的下标
//    public int pi;
//
//    // ib 是中序遍历的开始下标， ie 是中序遍历的结束下标
//    public TreeNode buildTree(int[] postorder, int[] inorder, int ib, int ie) {
//        if (ib > ie) {
//            // 说明此时没节点
//            return null;
//        }
//        // 左右根 逆着来： 根右左
//        TreeNode root = new TreeNode(postorder[pi]);
//        // 此时需要从中序遍历中找到对应的根的下标 ri
//        int ri = findIndex(inorder, ib, ie, postorder[pi]);
//        if (ri < 0) {
//            // 说明没有对应的 ri
//            return null;
//        }
//        // 遍历过 pi 对应的节点，pi 就需要继续往前遍历
//        pi--;
//        root.right = buildTree(postorder, inorder, ri + 1, ie);
//        root.left = buildTree(postorder, inorder, ib, ri - 1);
//
//        return root;
//    }
//
//
//    public int findIndex(int[] inorder, int ib, int ie, int key) {
//        for (int i = ib; i <= ie; i++) {
//            if (inorder[i] == key) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}


//class Solution {
//    public String tree2str(TreeNode root) {
//        StringBuilder str = new StringBuilder();
//        tree2str(root, str);
//        return str.toString();
//    }
//
//    public void tree2str(TreeNode root, StringBuilder str) {
//        if (root == null) return;
//        str.append(root.val);
//        // 左边不为空
//        if (root.left != null) {
//            str.append("(");
//            tree2str(root.left, str);
//            str.append(")");
//        } else {
//            if (root.right != null) {
//                str.append("()");
//            }
//        }
//
//        // 右边不为空
//        if (root.right != null) {
//            str.append("(");
//            tree2str(root.right, str);
//            str.append(")");
//        } else {
//            return;
//        }
//    }
//}


//class Solution {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> ret = new ArrayList<>();
//        if (root == null) return ret;
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode cur = root;
//        TreeNode top = null;
//
//        // 根左右
//        while (cur != null || !stack.isEmpty()) {
//            // 一直往左边走
//            while (cur != null) {
//                stack.push(cur);
//                ret.add(cur.val);
//                cur = cur.left;
//            }
//            // 此时说明来到了左边的尽头，需要往右边走了
//            top = stack.pop();
//            cur = top.right;
//        }
//        return ret;
//    }
//}


//class Solution {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> ret = new ArrayList<>();
//        if (root == null) return ret;
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode cur = root;
//        TreeNode top = null;
//
//        // 左根右
//        while (cur != null || !stack.isEmpty()) {
//            // 一直往左边走
//            while (cur != null) {
//                stack.push(cur);
//                cur = cur.left;
//            }
//            // 此时说明来到了左边的尽头，需要往右边走了
//            top = stack.pop();
//            ret.add(top.val);
//            cur = top.right;
//        }
//        return ret;
//    }
//}


//class Solution {
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> ret = new ArrayList<>();
//        if (root == null) return ret;
//
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode cur = root;
//        TreeNode top = null;
//        TreeNode prev = null;
//        // 左右根
//        while (cur != null || !stack.isEmpty()) {
//            // 一直向左
//            while (cur != null) {
//                stack.push(cur);
//                cur = cur.left;
//            }
//
//            top = stack.peek();
//            // 未访问过的新节点
//            if (top.right == null || top.right == prev) {
//                ret.add(top.val);
//                stack.pop();
//                prev = top;// 更新 prev
//
//            } else {
//                // 右边还有节点，继续去右边遍历
//                cur = top.right;
//            }
//        }
//
//        return ret;
//
//    }
//}