

//牛客网 BM18 二维数组中的查找
//public class Solution {
//    public boolean Find(int target, int[][] array) {
//        if (array.length == 0) {
//            return false;
//        }
//        if (array[0].length == 0) {
//            return false;
//        }
//        int i = 0;
//        int j = array[0].length - 1;
//        while (i < array.length && j >= 0) {
//            if (array[i][j] < target) {
//                i++;
//            } else if (array[i][j] > target) {
//                j--;
//            } else {
//                return true;
//            }
//        }
//        return false;
//    }
//}