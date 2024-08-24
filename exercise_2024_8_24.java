
// leetcode LCR 189. 设计机械累加器
//class Solution {
//    public int mechanicalAccumulator(int target) {
//        // 用递归，可以利用短路逻辑来写
//        // 如果 target <= 1，则递归停止，否则返回就相加
//        boolean flg = target > 1 && (target += mechanicalAccumulator(target - 1)) > 0;
//        return target;
//    }
//}


// leetcode LCR 186. 文物朝代判断
//class Solution {
//    public boolean checkDynasty(int[] places) {
//        Arrays.sort(places);
//        System.out.println(Arrays.toString(places));
//        // 0,0,6,7,9
//        int count = 0;
//        int sum = 0;
//        for (int i = 0; i < places.length - 1; i++) {
//            if (places[i] == 0) {
//                count++;
//            } else {
//                // 不能有相同牌
//                if (places[i] == places[i + 1]) return false;
//                if (places[i] + 1 != places[i + 1]) {
//                    sum += places[i + 1] - 1 - places[i];
//                }
//            }
//        }
//        if (count >= sum) return true;
//        else return false;
//    }
//}
//class Solution {
//    public boolean checkDynasty(int[] places) {
//        Set<Integer> set = new HashSet<>();
//        int min = 14;
//        int max = 0;
//        for (int x : places) {
//            if (x == 0) continue;
//            // 重复牌
//            if (set.contains(x)) {
//                return false;
//            }
//            max = Math.max(x, max);
//            min = Math.min(x, min);
//            set.add(x);
//        }
//        return max - min < 5;
//    }
//}