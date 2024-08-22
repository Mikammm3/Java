
// leetocde LCR 173. 点名
//class Solution {
//    public int takeAttendance(int[] records) {
//        int sum = 0;
//        for (int i = 0; i <= records.length; i++) {
//            sum += i;
//        }
//        for (int i = 0; i < records.length; i++) {
//            sum -= records[i];
//        }
//        return sum;
//    }
//}
//class Solution {
//    public int takeAttendance(int[] records) {
//        int[] hash = new int[records.length + 1];
//        for (int i = 0; i < records.length; i++) {
//            hash[records[i]]++;
//        }
//        for (int i = 0; i < hash.length; i++) {
//            if (hash[i] == 0) return i;
//        }
//        return 0;
//    }
//}
//class Solution {
//    public int takeAttendance(int[] records) {
//        for (int i = 0; i < records.length; i++) {
//            if (i != records[i]) return i;
//        }
//        return records[records.length - 1] + 1;
//    }
//}
//class Solution {
//    public int takeAttendance(int[] records) {
//        int left = 0, right = records.length - 1;
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (mid == records[mid]) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        // 0 1 2 3 4
//        if (records[left] == left) return left + 1;
//        return left;
//    }
//}


// leetcode LCR 179. 查找总价格为目标值的两个商品
//class Solution {
//    public int[] twoSum(int[] price, int target) {
//        int left = 0, right = price.length - 1;
//        while (left < right) {
//            if (left < right && price[left] + price[right] > target) {
//                right--;
//            } else if (left < right && price[left] + price[right] < target) {
//                left++;
//            } else {
//                return new int[]{price[left], price[right]};
//            }
//        }
//        return new int[0];
//    }
//}