
// leetcode 39. 组合总和
//class Solution {
//
//    List<List<Integer>> ret = new ArrayList<>();
//    List<Integer> path = new ArrayList<>();
//    int sum = 0;
//
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        combinationSum(candidates, target, 0);
//        return ret;
//    }
//
//    public void combinationSum(int[] candidates, int target, int index) {
//        if (sum > target)
//            return;
//        if (sum == target) {
//            ret.add(new ArrayList<>(path));
//            return;
//        }
//
//        for (int i = index; i < candidates.length; i++) {
//            path.add(candidates[i]);
//            combinationSum(candidates, target - candidates[i], i);
//            path.remove(path.size() - 1);
//        }
//    }
//}

// leetcode 22. 括号生成
//class Solution {
//
//    List<String> ret = new ArrayList<>();
//    StringBuilder path = new StringBuilder();
//
//    public List<String> generateParenthesis(int n) {
//        generateParenthesis(n, 0, 0, 0);
//        return ret;
//    }
//
//    public void generateParenthesis(int n, int index, int leftCount, int rightCount) {
//        if (rightCount > leftCount) return;
//        if (index == 2 * n) {
//            ret.add(new String(path));
//            return;
//        }
//
//        if (leftCount < n) {
//            path.append('(');
//            generateParenthesis(n, index + 1, leftCount + 1, rightCount);
//            path.delete(path.length() - 1, path.length());
//        }
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
//        int n = board.length;
//        int m = board[0].length;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (exist(board, word, 0, new boolean[n][m], i, j, n, m))
//                    return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean exist(char[][] board, String word, int index, boolean[][] flg, int i, int j, int n, int m) {
//        if (index == word.length())
//            return true;
//        if (i < 0 || i >= n || j < 0 || j >= m || flg[i][j])
//            return false;
//        if (board[i][j] == word.charAt(index)) {
//            flg[i][j] = true;
//            boolean flg1 = exist(board, word, index + 1, flg, i + 1, j, n, m);
//            boolean flg2 = exist(board, word, index + 1, flg, i - 1, j, n, m);
//            boolean flg3 = exist(board, word, index + 1, flg, i, j - 1, n, m);
//            boolean flg4 = exist(board, word, index + 1, flg, i, j + 1, n, m);
//            flg[i][j] = false;
//            return flg1 || flg2 || flg3 || flg4;
//        } else {
//            return false;
//        }
//
//    }
//}

// leetcode 131. 分割回文串
//class Solution {
//    List<List<String>> ret = new ArrayList<>();
//    List<String> path = new ArrayList<>();
//
//    public List<List<String>> partition(String s) {
//        partition(s, 0);
//        return ret;
//    }
//
//    public void partition(String s, int index) {
//        if (index >= s.length()) {
//            ret.add(new ArrayList<>(path));
//            return;
//        }
//        for (int i = index; i < s.length(); i++) {
//            String str = s.substring(index, i + 1);
//            if (judge(str)) {
//                path.add(str);
//                partition(s, i + 1);
//                path.remove(path.size() - 1);
//            }
//        }
//    }
//
//    public boolean judge(String str) {
//        int left = 0, right = str.length() - 1;
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right)) return false;
//            left++;
//            right--;
//        }
//        return true;
//    }
//}

// leetcode 51. N 皇后
//class Solution {
//
//    List<List<String>> ret = new ArrayList<>();
//    List<String> path = new ArrayList<>();
//    char[][] arr;
//
//    public List<List<String>> solveNQueens(int n) {
//        arr = new char[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = '.';
//            }
//        }
//        solveNQueens(n, 0);
//
//        return ret;
//    }
//
//    public void solveNQueens(int n, int index) {
//        if (index == n) {
//            ret.add(new ArrayList<>(path));
//            return;
//        }
//        for (int i = 0; i < n; i++) {
//            if (judge(index, i, n)) {
//                arr[index][i] = 'Q';
//                path.add(new String(arr[index]));
//                solveNQueens(n, index + 1);
//                arr[index][i] = '.';
//                path.remove(path.size() - 1);
//            }
//        }
//    }
//
//    public boolean judge(int x, int y, int n) {
//        for (int i = 0; i < n; i++) {
//            if (arr[x][i] == 'Q' || arr[i][y] == 'Q') return false;
//            for (int j = 0; j < n; j++) {
//                if (i - x == j - y && arr[i][j] == 'Q') return false;
//                if (i + j == x + y && arr[i][j] == 'Q') return false;
//            }
//        }
//        return true;
//    }
//}