
// leetcode LCR 180. 文件组合
//class Solution {
//    public int[][] fileCombination(int target) {
//        ArrayList<int[]> ret = new ArrayList<>();
//        for (int i = 1; i < target; i++) {
//            int sum = i;
//
//            for (int j = i + 1; j < target; j++) {
//                if (sum == target) {
//                    int[] arr = new int[j - i];
//                    for (int k = i; k < j; k++) {
//                        arr[k - i] = k;
//                    }
//                    ret.add(arr);
//                    break;
//                } else if (sum > target) {
//                    break;
//                } else {
//                    sum += j;
//                }
//            }
//        }
//        return ret.toArray(new int[ret.size()][]);
//    }
//}
//class Solution {
//    public int[][] fileCombination(int target) {
//        ArrayList<int[]> ret = new ArrayList<>();
//        int left = 1, right = 1;
//        int sum = 0;
//        while (left <= target / 2) {
//            // 说明此时值太小，需要 right 往后挪动
//            while (right < target && sum < target) {
//                sum += right;
//                right++;
//            }
//            if (sum == target) {
//                // 记录结果
//                int[] arr = new int[right - left];
//                for (int i = left; i < right; i++) {
//                    arr[i - left] = i;
//                }
//                ret.add(arr);
//                sum -= left;
//                left++;
//            } else if (sum > target) {
//                // 此时值太大，需要减去一些值，就可以减去 left
//                sum -= left;
//                left++;
//            }
//        }
//        return ret.toArray(new int[ret.size()][]);
//    }
//}


// leetcode LCR 183. 望远镜中最高的海拔
//class Solution {
//    public int[] maxAltitude(int[] heights, int limit) {
//        if (heights.length == 0) return new int[0];
//        int left = 0, right = 0;
//        int count = 0;
//        int[] ret = new int[heights.length - limit + 1];
//        int k = 0;
//        while (left <= heights.length - limit) {
//            if (count < limit) {
//                right++;
//                count++;
//            } else if (count == limit) {
//                int max = Integer.MIN_VALUE;
//                for (int i = left; i < right; i++) {
//                    max = Math.max(max, heights[i]);
//                }
//                ret[k++] = max;
//                left++;
//                count--;
//            } else {
//                left++;
//                count--;
//            }
//        }
//        return ret;
//    }
//}