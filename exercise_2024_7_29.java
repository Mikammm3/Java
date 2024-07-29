

import java.util.*;

class SubTree {
    String prev;
    String post;

    public SubTree(String prev, String post) {
        this.prev = prev;
        this.post = post;
    }
}

// 牛客网 Pre-Post
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//
//    // 计算 n 的阶乘
//    public static long fac(int n) {
//        int ans = 1;
//        for (int i = 1; i <= n; i++) {
//            ans *= i;
//        }
//        return ans;
//    }
//
//    public static long calcCom(int m, int n) {
//
//        // 组合就是用 m * m-1 * m-2 *... *(m-n + 1)
//        // 在用上面结果除以 n 的阶乘
//        long ans = 1;
//        for (int i = m; i >= m - n + 1; i--) {
//            ans *= i;
//        }
//
//        return ans / fac(n);
//    }
//
//    public static List<SubTree> subTreeFunc(String prev, String post) {
//        // 首先初始化一个 list 来存储返回的子树对象
//        List<SubTree> subTreeList = new ArrayList<>();
//        // 前序遍历：根节点 子树1  子树2 ... 子树n
//        // 后序遍历：子树1  子树2  子树3 ... 根节点
//
//        // 在前序遍历中，子树的开始节点下标
//        int prevFirstIndex = 1;
//        // 在后序遍历中，子树的开始节点下标
//        int postFirstIndex = 0;
//        // 然后从前序遍历中找子树的根节点
//        while (prevFirstIndex < prev.length()) {
//            char root = prev.charAt(prevFirstIndex);
//            // 从后序遍历中找该子树的根节点，并计算出该子树的节点个数
//            int postSubTreeRootIndex = post.indexOf(root);
//            // 子树节点总个数
//            int subTreeCount = postSubTreeRootIndex - postFirstIndex + 1;
//            // 截取子树的前序遍历结果，以及子树的后序遍历结果
//            String subTreePrev = prev.substring(prevFirstIndex,
//                    prevFirstIndex + subTreeCount);
//            String subTreePost = post.substring(postFirstIndex,
//                    postFirstIndex + subTreeCount);
//            // 将子树的前序遍历和后序遍历存到对象中, 并放入 list 里
//            SubTree subTree = new SubTree(subTreePrev, subTreePost);
//            subTreeList.add(subTree);
//
//            // 继续寻找下一个子树
//            prevFirstIndex = prevFirstIndex + subTreeCount;
//            postFirstIndex = postFirstIndex + subTreeCount;
//        }
//
//        return subTreeList;
//
//    }
//
//    // 根据先序遍历和后序遍历，计算所有树的可能性
//    public static long calcTreePossiable(int m, String prev, String post) {
//        // 首先判断，如果节点只有一个，或者没有节点，那可能性为 1
//        if (prev.isEmpty() || prev.length() == 1) {
//            return 1;
//        }
//        // 树非空时
//        // 首先要分离子树, 可以构建个对象来存储子树的前后遍历结果
//        List<SubTree> subTreeList = subTreeFunc(prev, post);
//        // 计算子树的组合
//        long result = calcCom(m, subTreeList.size());
//        for (SubTree e : subTreeList) {
//            // 计算每棵子树的可能性
//            result *= calcTreePossiable(m, e.prev, e.post);
//        }
//        // 然后返回可能性
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int m = in.nextInt();
//            if (m == 0) {
//                // 如果 m 为 0，说明要结束输入
//                break;
//            }
//            String prev = in.next();
//            String post = in.next();
//            // 根据树的前序遍历和后序遍历，计算树的可能性
//            long count = calcTreePossiable(m, prev, post);
//            System.out.println(count);
//        }
//    }
//}