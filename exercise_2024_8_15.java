

// leetcode LCR 120. 寻找文件副本
//class Solution {
//    public int findRepeatDocument(int[] documents) {
//        for (int i = 0; i < documents.length - 1; i++) {
//            for (int j = i + 1; j < documents.length; j++) {
//                if (documents[i] == documents[j]) {
//                    return documents[i];
//                }
//            }
//        }
//        return -1;
//    }
//}
//class Solution {
//    public int findRepeatDocument(int[] documents) {
//        Arrays.sort(documents);
//        for (int i = 0; i < documents.length - 1; i++) {
//            if (documents[i] == documents[i + 1]) {
//                return documents[i];
//            }
//        }
//        return -1;
//    }
//}
//class Solution {
//    public int findRepeatDocument(int[] documents) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < documents.length; i++) {
//            int x = documents[i];
//            if (set.contains(x)) {
//                return x;
//            } else {
//                set.add(x);
//            }
//        }
//        return -1;
//    }
//}


class Solution {
    public boolean findTargetIn2DPlants(int[][] plants, int target) {
        // 注意数组没有值的情况
        if (plants.length == 0) return false;
        // 找到右上角的值
        int i = 0;
        int j = plants[0].length - 1;
        while (i >= 0 && i < plants.length && j >= 0 && j < plants[0].length) {
            if (plants[i][j] > target) {
                j--;
            } else if (plants[i][j] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}