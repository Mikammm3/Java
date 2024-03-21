

// LeetCode 274. H 指数
//class Solution {
//    public int hIndex(int[] citations) {
//        // 0,1,3,5,6
//        Arrays.sort(citations);
//        int ret = -1;
//        for (int i = 0; i <= citations.length; i++) {
//            int h = i, hcount = 0;
//            for (int k = 0; k < citations.length; k++) {
//                if (citations[k] >= h) {
//                    hcount++;
//                }
//            }
//            if (hcount > ret && hcount >= h) ret = h;
//        }
//        return ret;
//    }
//}