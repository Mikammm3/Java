


//牛客网 JZ12 矩阵中的路径
//import java.util.*;
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param matrix char字符型二维数组
//     * @param word   string字符串
//     * @return bool布尔型
//     */
//    public boolean hasPath(char[][] matrix, String word) {
//        char[] arr = word.toCharArray();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (dfs(matrix, arr, i, j, 0)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public boolean dfs(char[][] matrix, char[] word, int i, int j, int index) {
//        //越界
//        if (i >= matrix.length || i < 0 || j >= matrix[0].length || j < 0
//                || matrix[i][j] != word[index]) {
//            return false;
//        }
//        if (word.length - 1 == index) {
//            return true;
//        }
//        char tmp = matrix[i][j];
//        matrix[i][j] = '.';
//        boolean flg = (dfs(matrix, word, i - 1, j, index + 1) ||
//                dfs(matrix, word, i + 1, j, index + 1) ||
//                dfs(matrix, word, i, j - 1, index + 1) ||
//                dfs(matrix, word, i, j + 1, index + 1));
//
//        matrix[i][j] = tmp;
//        return flg;
//    }
//}