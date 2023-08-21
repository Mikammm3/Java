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


    //中序遍历 左根右
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
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
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        //结构不同
//        if (p == null && q != null || p != null && q == null) {
//            return false;
//        }
//        if (p == null && q == null) {
//            return true;
//        }
//        //值不同
//        if (p.val != q.val) {
//            return false;
//        }
//        //左树和右树都得相同
//        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//    }
//}


//class Solution {
//    public boolean CheckPermutation(String s1, String s2) {
//        if (s1.length() != s2.length()) {
//            return false;
//        }
//        char[] arr1 = s1.toCharArray();
//        char[] arr2 = s2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        return new String(arr1).equals(new String(arr2));
//    }
//}

//class Solution {
//    public int lastStoneWeight(int[] stones) {
//        //将所有石头的重量放入最大堆中。
//        // 每次依次从队列中取出最重的两块石头 a和 b，必有 a≥b
//        // 如果 a>b，则将新石头 a−b 放回到最大堆中；
//        //如果 a=b，两块石头完全被粉碎，因此不会产生新的石头。
//        // 重复上述操作，直到剩下的石头少于 2 块。
//        // 最终可能剩下 1 块石头，该石头的重量即为最大堆中剩下的元素，返回该元素；
//        // 也可能没有石头剩下，此时最大堆为空，返回 0。
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);
//        for (Integer x : stones) {
//            priorityQueue.add(x);
//        }
//        while (priorityQueue.size() > 1) {
//            int a = priorityQueue.poll();
//            int b = priorityQueue.poll();
//            if (a > b) {
//                priorityQueue.add(a - b);
//            }
//        }
//        return priorityQueue.isEmpty() ? 0 : priorityQueue.poll();
//    }
//}


//class Solution {
//    public int countCharacters(String[] words, String chars) {
//        int length = 0;
//        for (int i = 0; i < words.length; i++) {
//            int[] arr = new int[26];
//            for (int j = 0; j < chars.length(); j++) {
//                arr[chars.charAt(j) - 'a']++;
//            }
//            boolean flg = true;
//            for (int j = 0; j < words[i].length(); j++) {
//                char ch = words[i].charAt(j);
//                if (arr[ch - 'a'] > 0) {
//                    arr[ch - 'a']--;
//                } else {
//                    flg = false;
//                    break;
//                }
//            }
//            if (flg) {
//                length += words[i].length();
//            }
//        }
//        return length;
//    }
//}


//class Solution {
//    public int dayOfYear(String date) {
//        int days = 0;
//        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        String[] arr = date.split("-");
//        int y = Integer.valueOf(arr[0]);//年
//        int m = Integer.valueOf(arr[1]);//月
//        int d = Integer.valueOf(arr[2]);//日
//        //闰年
//        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
//            month[1]++;
//        }
//        //每一年的第一天从1月1号开始
//        for (int i = 0; i < m - 1; i++) {
//            days += month[i];
//        }
//        return days + d;
//    }
//}


//class Solution {
//    public ArrayList<Integer> arrayList = new ArrayList<>();
//
//    public int[] reversePrint(ListNode head) {
//        revserseAdd(head);
//        int[] ans = new int[arrayList.size()];
//        for (int i = 0; i < ans.length; i++) {
//            ans[i] = arrayList.get(i);
//        }
//        return ans;
//    }
//
//    public static void revserseAdd(ListNode head) {
//        //遍历完了就说明递归结束了
//        if (head == null) {
//            return;
//        }
//        //利用递归先遍历完链表，然后再返回增加元素
//        revserseAdd(head.next);
//        arrayList.add(head.val);
//    }
//}

//class MyQueue {
//    //定义两个栈
//    private Stack<Integer> s1;
//    private Stack<Integer> s2;
//
//    public MyQueue() {
//        s1 = new Stack<>();
//        s2 = new Stack<>();
//    }
//
//    public void push(int x) {
//        s1.push(x);
//    }
//
//    public int pop() {
//        if (empty()) {
//            return -1;
//        }
//        if (s2.empty()) {
//            int size = s1.size();
//            while (size != 0) {
//                int tmp = s1.pop();
//                s2.push(tmp);
//                size--;
//            }
//        }
//
//        return s2.pop();
//    }
//
//    public int peek() {
//        if (empty()) {
//            return -1;
//        }
//        if (s2.empty()) {
//            int size = s1.size();
//            while (size != 0) {
//                int tmp = s1.pop();
//                s2.push(tmp);
//                size--;
//            }
//        }
//
//        return s2.peek();
//    }
//
//    public boolean empty() {
//        if (s1.empty() && s2.empty()) {
//            return true;
//        }
//        return false;
//    }
//}


//class MinStack {
//    Stack<Integer> stack;
//    Stack<Integer> minStack;
//
//    public MinStack() {
//        stack = new Stack<>();
//        minStack = new Stack<>();
//    }
//
//    public void push(int val) {
//        stack.push(val);
//        if (minStack.empty()) {
//            minStack.push(val);
//        } else {
//            int tmp = minStack.peek();
//            if (val <= tmp) {
//                minStack.push(val);
//            }
//        }
//    }
//
//    public void pop() {
//        if (stack.empty()) {
//            return;
//        }
//        int tmp = stack.pop();
//        if (!minStack.empty() && tmp == minStack.peek()) {
//            minStack.pop();
//        }
//    }
//
//    public int top() {
//        if (stack.empty()) {
//            return -1;
//        }
//        return stack.peek();
//    }
//
//    public int getMin() {
//        if (minStack.empty()) {
//            return -1;
//        }
//        return minStack.peek();
//    }
//}


//class Solution {
//    public List<String> buildArray(int[] target, int n) {
//        List<String> ans = new ArrayList<>();
//        //用i来遍历1-n，用j来遍历target
//        for (int i = 1, j = 0; i <= n && j < target.length; i++) {
//            ans.add("Push");
//            if (i != target[j]) {
//                ans.add("Pop");//就是说i不存在于target中
//            } else {
//                j++;//存在的话j就往后走
//            }
//        }
//        return ans;
//    }
//}


//class Solution {
//    //判断两棵树是否相同
//    public boolean isSamTree(TreeNode p, TreeNode q) {
//        if (p == null && q != null || p != null && q == null) {
//            return false;
//        }
//        if (p == null && q == null) {
//            return true;
//        }
//        if (p.val != q.val) {
//            return false;
//        }
//        return isSamTree(p.left, q.left) && isSamTree(p.right, q.right);
//    }
//
//    //每一个节点都要判断
//    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//        //空树
//        if (root == null) {
//            return false;
//        }
//        //根节点
//        if (isSamTree(root, subRoot)) {
//            return true;
//        }
//        //左右子树判断
//        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//    }
//}


//class Solution {
//    public TreeNode invertTree(TreeNode root) {
//        //前序遍历每一个节点，翻转左右孩子即可
//        //空树就不需要翻转了
//        if (root == null) {
//            return null;
//        }
//        //交换左右孩子的地址
//        TreeNode tmp = root.left;
//        root.left = root.right;
//        root.right = tmp;
//        invertTree(root.left);
//        invertTree(root.right);
//        return root;
//    }
//}


//class Solution {
//    //只有当每一颗子树都是平衡的，
//    //整棵树才是平衡的
//    public boolean isBalanced(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        //前序遍历
//        //判断根节点是否平衡
//        int leftHeight = getHeight(root.left);
//        int rightHeight = getHeight(root.right);
//        //Math.abs()求绝对值
//        //高度差大于1
//        if (Math.abs(leftHeight - rightHeight) > 1) {
//            return false;
//        }
//
//        return isBalanced(root.left) && isBalanced(root.right);
//    }
//
//    public int getHeight(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int left = getHeight(root.left);
//        int right = getHeight(root.right);
//        return ((left > right) ? (left + 1) : (right + 1));
//    }
//}


//class Solution {
//    //只有当每一颗子树都是平衡的，
//    //整棵树才是平衡的
//    public boolean isBalanced(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        //getHeight 在计算高度的同时也判断是否平衡
//        //不平衡就返回-1
//        return getHeight(root) >= 0;
//    }
//
//    public int getHeight(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int left = getHeight(root.left);
//        int right = getHeight(root.right);
//        //Math.abs()求绝对值
//        //在求高度的同时判断是否平衡,
//        //要保证lh和rh都要大于等于0
//        //不然两边都不平衡就有可能导致高度差<=1
//        if (left >= 0 && right >= 0 && Math.abs(left - right) <= 1) {
//            //正常求得的高度
//            return Math.max(left, right) + 1;
//        } else {
//            //如果不平衡返回-1
//            return -1;
//        }
//    }
//}


//class Solution {
//    //判断是否对称，就要看结构对称和值对称
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) {
//            return true;
//        }
//        return isSymmetricChild(root.left, root.right);
//    }
//
//    //判断子树是否对称
//    public boolean isSymmetricChild(TreeNode leftTree, TreeNode rightTree) {
//        if (leftTree == null && rightTree == null) {
//            return true;
//        }
//        if (leftTree == null && rightTree != null || leftTree != null && rightTree == null) {
//            return false;
//        }
//        if (leftTree.val != rightTree.val) {
//            return false;
//        }
//        //孩子对称
//        return isSymmetricChild(leftTree.left, rightTree.right) &&
//                isSymmetricChild(leftTree.right, rightTree.left);
//    }
//}