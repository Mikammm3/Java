import sun.util.resources.cldr.en.TimeZoneNames_en_NZ;

import java.util.*;

public class BinaryTree {
    static class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    public TreeNode root;//根节点

    //前序遍历 根左右
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    //将前序遍历的结果存储到list当中
    public List<TreeNode> preOrder2(TreeNode root) {
        List<TreeNode> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        ret.add(root);
        //System.out.print(root.val + " ");
        List<TreeNode> left = preOrder2(root.left);
        ret.addAll(left);
        List<TreeNode> right = preOrder2(root.right);
        ret.addAll(right);
        return ret;
    }

    //非递归实现(迭代实现)
    public void preOrderNor(TreeNode root) {
        //非递归利用栈实现前序遍历
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return;
        }
        //用cur来遍历二叉树
        TreeNode cur = root;

        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                System.out.print(cur.val + " ");
                cur = cur.left;
            }
            //当循环结束的时候，cur必定为null
            //则需要弹出栈顶元素，遍历右边
            TreeNode top = stack.pop();
            cur = top.right;
        }
    }

    //中序遍历 左根右
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    //非递归实现(迭代实现)
    public void inOrderNor(TreeNode root) {
        //非递归利用栈实现前序遍历
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return;
        }
        //用cur来遍历二叉树
        TreeNode cur = root;

        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            //当循环结束的时候，cur必定为null
            //则需要弹出栈顶元素，遍历右边
            TreeNode top = stack.pop();
            System.out.print(top.val + " ");
            cur = top.right;
        }
    }

    //后序遍历 左右根
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    //非递归实现(迭代实现)
    public void postOrderNor(TreeNode root) {
        //非递归利用栈实现前序遍历
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return;
        }
        //用cur来遍历二叉树
        TreeNode cur = root;
        TreeNode prev = null;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            //当循环结束的时候，cur必定为null
            //则需要弹出栈顶元素，遍历右边
            TreeNode top = stack.pop();
            if (top.right == null || top.right == prev) {
                //说明已经遍历完左边和右边了
                stack.pop();
                System.out.print(top.val + " ");
                prev = top;//表示当前节点已经被打印过了
            } else {
                cur = top.right;
            }
        }
    }


    //获取结点个数
    //思路1：使用前中后序遍历二叉树，
    //遇到不为空的结点就计数器++
    //思路2：总结点数 = 左子树结点个数 + 右子树结点个数 + 1
    public int nodeSize(TreeNode root) {
        int count = 0;
        if (root == null) {
            return count;
        }
        count++;
        int left = nodeSize(root.left);
        count += left;
        int right = nodeSize(root.right);
        count += right;
        return count;
    }


    public int nodeSize2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + nodeSize2(root.left) + nodeSize2(root.right);
    }


    //获取叶子结点个数
    //叶子结点：左边为空&&右边为空
    //root左树的叶子 + root右树的叶子 = 整棵树的叶子
    public int getLeafSize(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return ((root.left == null && root.right == null) ? 1 : 0) + getLeafSize(root.left) + getLeafSize(root.right);
    }

    //获取第K层结点个数
    //思路：root这棵树的第k层 = root.left第k-1层 + root.right第k-1层
    public int getKLevelNodeCount(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        //root不为空说明结点存在所以返回1，k最低为第一层
        if (k == 1) {
            return 1;
        }
        return getKLevelNodeCount(root.left, k - 1)
                + getKLevelNodeCount(root.right, k - 1);
    }


    //获取树的高度
    //思路：整棵树的高度 = MAX(左树的高度,右树的高度) + 1
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }


    //检测值为key的元素是否存在,相当于遍历二叉树
    public boolean find(TreeNode root, char key) {
        if (root == null) {
            return false;
        }
        if (root.val == key) {
            return true;
        }
        boolean left = find(root.left, key);
        if (left == true) {
            return true;
        }

        boolean right = find(root.right, key);
        if (right == true) {
            return true;
        }
        return false;
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


    //层序遍历
    public void levelOrder(TreeNode root) {
        //空树
        if (root == null) {
            return;
        }
        //用队列实现层序遍历
        //先放左子树，再放右子树，先进先出
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
    }


    //层序遍历带有返回值版本
    public List<List<TreeNode>> levelOrder2(TreeNode root) {
        //相当于一个二维数组
        List<List<TreeNode>> ret = new ArrayList<>();
        //空树
        if (root == null) {
            return ret;
        }
        //用队列实现层序遍历
        //先放左子树，再放右子树，先进先出
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            ////代码执行到这里能知道这一层有多少个元素
            List<TreeNode> tmp = new ArrayList<>();
            int size = queue.size();//这一层含有的元素个数
            while (size != 0) {
                TreeNode cur = queue.poll();
                tmp.add(cur);//添加到数组里
                size--;//等到 size = 0 时，这一层的元素就添加完了
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            ret.add(tmp);//将一维数组添加进二维数组中
        }
        return ret;
    }

    // 判断一棵树是不是完全二叉树
    public boolean isCompleteTree(TreeNode root) {
        //空树
        if (root == null) {
            return true;
        }
        //完全二叉树是从左到右连续存放的二叉树
        //利用队列实现，弹出队头元素cur，如果cur元素是null，
        //则判断队列里的元素是否全是null，如果含有不为空的元素，则说明不是完全二叉树
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur != null) {
                queue.add(cur.left);
                queue.add(cur.right);
            } else {
                //证明此时遇到了null
                break;
            }

        }
        //不能用isEmpty()来判断队列里面是否全是null
        //得一个个手动判断
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur != null) {
                //说明二叉树不是连续存放的
                return false;
            }
        }
        return true;
    }

    public boolean judge(String str) {
        if (str == null) {
            return true;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


//class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        //空树没有公共祖先
//        if (root == null) {
//            return null;
//        }
//        //p是根节点或者q是根节点
//        if (root == p || root == q) {
//            return root;
//        }
//        //如果没找到就去左子树和右子树找
//        TreeNode leftTree = lowestCommonAncestor(root.left, p, q);
//        TreeNode rightTree = lowestCommonAncestor(root.right, p, q);
//        //分三种情况
//        if (leftTree != null && rightTree != null) {
//            return root;
//        } else if (leftTree != null) {
//            //说明p和q都在左子树
//            return leftTree;
//        } else {
//            //说明p和q都在右子树
//            return rightTree;
//        }
//    }
//}


//class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        //空树
//        if (root == null) {
//            return null;
//        }
//        //用来存储root到p的路径中所有的节点
//        Stack<TreeNode> stackP = new Stack<>();
//        getPath(root, p, stackP);
//
//        ////用来存储root到q的路径中所有的节点
//        Stack<TreeNode> stackQ = new Stack<>();
//        getPath(root, q, stackQ);
//
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
//
//        while (!stackQ.empty() && !stackP.empty()) {
//            if (stackQ.peek() == stackP.peek()) {
//                return stackQ.pop();
//            }
//            stackQ.pop();
//            stackP.pop();
//        }
//        //没找到
//        return null;
//    }
//
//    //在root中找node的路径并且将路径存储在stack中
//    public boolean getPath(TreeNode root, TreeNode node, Stack<TreeNode> stack) {
//        //空树
//        if (root == null || node == null) {
//            return false;
//        }
//        //先假设root是node路径的一部分
//        stack.push(root);
//        if (root == node) {
//            return true;
//        }
//        //没找到就去左子树和右子树中找
//        boolean leftTree = getPath(root.left, node, stack);
//        if (leftTree == true) {
//            return true;
//        }
//        boolean rightTree = getPath(root.right, node, stack);
//        if (rightTree == true) {
//            return true;
//        }
//        //都没找到就说明root不是node路径的一部分
//        stack.pop();
//        return false;
//    }
//}


//class Solution {
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        //主要依靠前序遍历来创建二叉树
//        //所以要确定左子树和右子树的范围
//        //所以得再创建一个方法来构造二叉树
//        TreeNode root = buildTreeChild(preorder,/*0,*/inorder, 0, inorder.length - 1);
//        return root;
//    }
//
//    //因为希望创建一个节点，就priIndex++，方便创建下一个节点
//    //所以priIndex就不能定义在方法内部，得定义成成员变量
//    public int priIndex;//成员变量不初始化默认为0
//
//    //因为prIndex是成员变量，所以不再需要方法传参也能使用
//    public TreeNode buildTreeChild(int[] preorder,/*int priIndex,*/ int[] inorder, int inbegin, int inend) {
//        //1.确定左子树和右子树是否存在
//        //相当于 leftTreeIndex > rightTreeIndex
//        //就不存在左子树或者右子树
//        if (inbegin > inend) {
//            return null;
//        }
//
//        //2.创建根节点
//        TreeNode root = new TreeNode(preorder[priIndex]);
//
//        //3.找到根节点在中序遍历对应的下标,来确定左子树和右子树的范围
//        int rootIndex = findIndex(inorder, inbegin, inend, preorder[priIndex]);
//        if (rootIndex == -1) {
//            //如果根节点不存在，说明出问题了
//            return null;
//        }
//        priIndex++;
//
//        //4.创建左子树和右子树(根据前序遍历递归实现)
//        root.left = buildTreeChild(preorder,/*priIndex,*/inorder, inbegin, rootIndex - 1);
//        root.right = buildTreeChild(preorder,/*priIndex,*/inorder, rootIndex + 1, inend);
//
//        //5.返回创建好的二叉树
//        return root;
//    }
//
//    public int findIndex(int[] inorder, int inbegin, int inend, int key) {
//        for (int i = inbegin; i <= inend; i++) {
//            if (inorder[i] == key) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}


//class Solution {
//
//    //因为希望创建一个节点，就postIndex--，方便创建下一个节点
//    //所以postIndex就不能定义在方法内部，得定义成成员变量
//    public int postIndex;////成员变量不初始化默认为0
//
//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        //主要依靠后序遍历来创建二叉树
//        //所以要确定右子树和左子树的范围
//        //所以得再创建一个方法来构造二叉树
//        this.postIndex = postorder.length - 1; //初始化
//
//        TreeNode root = buildTreeChild(inorder, 0, inorder.length - 1, postorder);
//
//        return root;
//    }
//
//    //因为postIndex是成员变量，所以不再需要方法传参也能使用
//    public TreeNode buildTreeChild(int[] inorder, int inbegin, int inend, int[] postorder) {
//
//        //1.确定左子树和右子树是否存在
//        //相当于 leftTreeIndex > rightTreeIndex
//        //就不存在左子树或者右子树
//        if (inbegin > inend) {
//            return null;
//        }
//
//        //2.创建根节点
//        TreeNode root = new TreeNode(postorder[postIndex]);
//
//        //3.找到根节点在中序遍历对应的下标,来确定左子树和右子树的范围
//        int rootIndex = findIndex(inorder, inbegin, inend, postorder[postIndex]);
//        if (rootIndex == -1) {
//            //如果根节点不存在，说明出问题了
//            return null;
//        }
//        postIndex--;////找完根节点下标再--，不然范围不对
//
//        //4.创建右子树和左子树(根据后序遍历递归实现)
//        //左 右 根，倒着来
//        root.right = buildTreeChild(inorder, rootIndex + 1, inend, postorder);
//        root.left = buildTreeChild(inorder, inbegin, rootIndex - 1, postorder);
//
//        //5.返回创建好的二叉树
//        return root;
//    }
//
//    public int findIndex(int[] inorder, int inbegin, int inend, int key) {
//        for (int i = inbegin; i <= inend; i++) {
//            if (inorder[i] == key) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}


//class Solution {
//    public String tree2str(TreeNode root) {
//        //创建另一个方法来完成
//        StringBuilder stringBuilder = new StringBuilder();
//        tree2strChild(root, stringBuilder);
//        return stringBuilder.toString();
//    }
//
//    public void tree2strChild(TreeNode t, StringBuilder stringBuilder) {
//        //空树
//        if (t == null) {
//            return;
//        }
//        //不是空树
//        //添加根节点
//        stringBuilder.append(t.val);
//
//        //大致分为四种情况
//        if (t.left != null) {
//            //左边不为空，先添加(
//            //然后递归左边，最后再添加)
//            stringBuilder.append("(");
//            tree2strChild(t.left, stringBuilder);
//            stringBuilder.append(")");
//        } else {
//            //左边为空
//            //如果右边不为空，那就得添加()
//            if (t.right != null) {
//                stringBuilder.append("()");
//            } else {
//                //右边也为空，那就啥也不做
//                return;
//            }
//        }
//
//
//        if (t.right != null) {
//            //如果右边不为空，先添加(
//            //然后递归右边，再来添加)
//            stringBuilder.append("(");
//            tree2strChild(t.right, stringBuilder);
//            stringBuilder.append(")");
//        } else {
//            return;//右边为空，啥也不做
//        }
//    }
//}