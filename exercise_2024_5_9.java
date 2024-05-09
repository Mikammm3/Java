


//import java.util.*;
//
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * @param param string字符串
//     * @return string字符串
//     */
//    public String compressString(String param) {
//        int i = 0, len = param.length();
//        char[] arr = param.toCharArray();
//        StringBuilder ret = new StringBuilder();
//        // ret.append(arr[0]);
//        while (i < len) {
//            if (i < len - 1 && arr[i] == arr[i + 1]) {
//                ret.append(arr[i]);
//                int count = 1;
//                int index = i;
//                while (i < len - 1 && arr[i] == arr[i + 1]) {
//                    count++;
//                    i++;
//                }
//                i++;
//                if (count != 1)
//                    ret.append(count);
//                if (i >= len) {
//                    break;
//                }
//            } else if (i < len - 1 && arr[i] != arr[i + 1]) {
//                ret.append(arr[i]);
//                i++;
//            } else {
//                ret.append(arr[i]);
//                break;
//            }
//        }
//        return ret.toString();
//    }
//}