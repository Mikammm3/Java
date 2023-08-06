

//LeetCode 1154. 一年中的第几天
//import java.util.*;
//
//class Solution {
//    public int dayOfYear(String date) {
//        int days = 0;
//        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        String[] arr = date.split("-");
//        int y = Integer.valueOf(arr[0]);//年
//        int m = Integer.valueOf(arr[1]);//月
//        int d = Integer.valueOf(arr[2]);//日
//        //闰年
//        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
//            month[1]++;
//        }
//        //每一年的第一天从1月1号开始
//        for (int i = 0; i < m - 1; i++) {
//            days += month[i];
//        }
//        return days + d;
//    }
//}