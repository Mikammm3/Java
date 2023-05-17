import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


/*
import java.util.*;
*/


/*public */class Solution {
    public String setstring(String str) {
        // write code here
        char[] arr = new char[str.length()];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                arr[j++] = ch;
            } else {
                if (Arrays.binarySearch(arr, ch) < 0) {
                    arr[j++] = ch;
                }
            }
        }
        char[] tmp = Arrays.copyOfRange(arr, 0, j + 1);
        String ans = new String(tmp);
        return ans;
    }
}


//    boolean flg = false;
//                for (int k = 0; k < j; k++) {
//        if (arr[k] == ch) {
//        flg = true;
//        break;
//        }
//        }
//        if (flg) {
//        continue;
//        } else {
//        arr[j++] = ch;
//        }