
// LeetCode 1576. 替换所有的问号
//class Solution {
//    public String modifyString(String s) {
//        char[] arr = s.toCharArray();
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == '?') {
//                for (char ch = 'a'; ch <= 'z'; ch++) {
//                    if ((i == 0 || ch != arr[i - 1]) && (i == n - 1 || ch != arr[i + 1])) {
//                        arr[i] = ch;
//                        break;
//                    }
//                }
//            }
//        }
//        return String.valueOf(arr);
//    }
//}


// LeetCode 495. 提莫攻击
//class Solution {
//    public int findPoisonedDuration(int[] timeSeries, int duration) {
//        int ret = duration;
//        for (int i = 1; i < timeSeries.length; i++) {
//            int x = timeSeries[i] - timeSeries[i - 1];
//            if (x >= duration) ret += duration;
//            else ret += x;
//        }
//        return ret;
//    }
//}