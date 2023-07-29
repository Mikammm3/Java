

//LeetCode 374. 猜数字大小
//public class Solution extends GuessGame {
//    public int guessNumber(int n) {
//        int left = 1;
//        int right = n;
//        //1 2 3 4 5 6 7 8 9 10
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (guess(mid) < 0) {
//                right = mid - 1;
//            } else if (guess(mid) > 0) {
//                left = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return right;
//    }
//}