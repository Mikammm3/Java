
// leetcode 22. 括号生成
//class Solution {
//    public List<String> generateParenthesis(int n) {
//        generateParenthesis(n, 0, 0, 0);
//        return ret;
//    }
//
//    // leftCount 是左括号的总个数
//    // rightCount 是右括号的总个数
//    List<String> ret = new ArrayList<>();
//    StringBuilder path = new StringBuilder();
//
//    public void generateParenthesis(int n, int index, int leftCount, int rightCount) {
//        // path 的长度一定是 2*n
//        if (index == 2 * n) {
//            ret.add(new String(path));
//            return;
//        }
//        // 左括号小于 n，就添加左括号
//        if (leftCount < n) {
//            path.append('(');
//            generateParenthesis(n, index + 1, leftCount + 1, rightCount);
//            path.delete(path.length() - 1, path.length());
//        }
//        // 如果左括号数量大于右括号，说明需要添加右括号了(目标是左括号数量与右括号数量一致)
//        if (leftCount > rightCount) {
//            path.append(')');
//            generateParenthesis(n, index + 1, leftCount, rightCount + 1);
//            path.delete(path.length() - 1, path.length());
//        }
//    }
//}


// leetcode 79. 单词搜索
//class Solution {
//    public boolean exist(char[][] board, String word) {
//        int m = board.length;
//        int n = board[0].length;
//        boolean ret = false;
//        boolean[][] flg = new boolean[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (dfs(board, flg, i, j, m, n, word, 0)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public boolean dfs(char[][] board, boolean[][] flg, int i, int j, int m, int n, String word, int index) {
//        if (index == word.length())
//            return true;
//        if (i < 0 || i >= m || j < 0 || j >= n || flg[i][j])
//            return false;
//        char ch = word.charAt(index);
//        if (ch == board[i][j]) {
//            flg[i][j] = true;
//            boolean flg1 = dfs(board, flg, i - 1, j, m, n, word, index + 1);
//            boolean flg2 = dfs(board, flg, i + 1, j, m, n, word, index + 1);
//            boolean flg3 = dfs(board, flg, i, j - 1, m, n, word, index + 1);
//            boolean flg4 = dfs(board, flg, i, j + 1, m, n, word, index + 1);
//            flg[i][j] = false;
//            return flg1 || flg2 || flg3 || flg4;
//        } else {
//            return false;
//        }
//    }
//}