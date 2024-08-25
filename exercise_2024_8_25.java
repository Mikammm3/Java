

// leetcode LCR 191. 按规则计算统计结果
//class Solution {
//    public int[] statisticalResult(int[] arrayA) {
//        int mul = 1;
//        // 记录数组中 0 的个数
//        int count = 0;
//        int[] arrB = new int[arrayA.length];
//        // 求出数组每个元素的乘积(除 0 外)
//        for (int i = 0; i < arrayA.length; i++) {
//            if (arrayA[i] == 0) {
//                count++;
//                continue;
//            }
//            mul *= arrayA[i];
//        }
//        if (count >= 2) {
//            // 说明数组中有两个及以上的 0 ,则值一定全是 0
//            return new int[arrayA.length];
//        }
//
//        for (int i = 0; i < arrB.length; i++) {
//            if (count > 0) {
//                // 此时说明数组中含有一个 0，则除 0 外所有数组都是 0
//                if (count == 1) {
//                    if (arrayA[i] != 0) {
//                        arrB[i] = 0;
//                    } else {
//                        arrB[i] = mul;
//                    }
//                }
//            } else {
//                // 数组中没 0，正常执行
//                arrB[i] = mul / arrayA[i];
//            }
//        }
//        return arrB;
//    }
//}
//class Solution {
//    public int[] statisticalResult(int[] arrayA) {
//        // 边界情况
//        if (arrayA == null || arrayA.length == 0) return new int[0];
//        int[] left = new int[arrayA.length];
//        left[0] = 1;
//        // 遍历数组初始化 left 的值
//        for (int i = 1; i < arrayA.length; i++) {
//            left[i] = left[i - 1] * arrayA[i - 1];
//        }
//        // 记录右边的元素乘积
//        int right = 1;
//        for (int i = left.length - 1; i >= 0; i--) {
//            left[i] *= right;
//            right *= arrayA[i];
//        }
//        return left;
//    }
//}


// leetcode LCR 122. 路径加密
//class Solution {
//    public String pathEncryption(String path) {
//        StringBuilder str = new StringBuilder();
//        for (int i = 0; i < path.length(); i++) {
//            char ch = path.charAt(i);
//            if (ch != '.') {
//                str.append(ch);
//            } else {
//                str.append(' ');
//            }
//        }
//        return str.toString();
//    }
//}