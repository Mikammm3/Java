
// LeetCode 6. N 字形变换
//class Solution {
//    public String convert(String s, int numRows) {
//        if (numRows == 1 || numRows > s.length()) return s;
//        int len = s.length();
//        char[][] ret = new char[numRows][len];
//        int i = 0, j = 0, k = 0;
//        while (i < len) {
//            ret[j++][k] = s.charAt(i++);
//            if (j == numRows) {
//                j -= 2;
//                k++;
//                while (i < len && j != 0) {
//                    ret[j--][k++] = s.charAt(i++);
//                }
//            }
//        }
//        String ans = new String();
//        for (i = 0; i < numRows; i++) {
//            for (j = 0; j < len; j++) {
//                if ((int) ret[i][j] != 0) ans += ret[i][j];
//            }
//        }
//        return ans;
//    }
//}
//class Solution {
//    public String convert(String s, int numRows) {
//        if (numRows == 1) return s;
//        int d = 2 * numRows - 2;
//        StringBuilder ret = new StringBuilder();
//        for (int i = 0, len = s.length(); i < len; i += d) {
//            ret.append(s.charAt(i));
//        }
//        for (int i = 1, len = s.length(); i < numRows - 1; i++) {
//            int tmp = 0;
//            for (int j = i; j + tmp < len; tmp += d) {
//                ret.append(s.charAt(j + tmp));
//                if (d - j + tmp < len) ret.append(s.charAt(d - j + tmp));
//            }
//        }
//        for (int i = numRows - 1, len = s.length(); i < len; i += d) {
//            ret.append(s.charAt(i));
//        }
//        return ret.toString();
//    }
//}


// LeetCode 38. 外观数列
//class Solution {
//    public String countAndSay(int n) {
//        if (n == 1) return "1";
//        StringBuilder ret = new StringBuilder("1");
//        for (int i = 0; i < n - 1; i++) {
//            int left = 0, right = 0;
//            StringBuilder tmp = new StringBuilder();
//            while (right < ret.length()) {
//                while (right < ret.length() && ret.charAt(left) == ret.charAt(right)) {
//                    right++;
//                }
//                tmp.append(right - left);
//                tmp.append(ret.charAt(left));
//                if (right >= ret.length()) {
//                    break;
//                }
//                if (ret.charAt(left) != ret.charAt(right)) {
//                    left = right;
//                }
//            }
//            ret = new StringBuilder(tmp);
//        }
//        return ret.toString();
//    }
//}
//class Solution {
//    public String countAndSay(int n) {
//        if (n == 1) return "1";
//        String ret = "1";
//        for (int i = 1; i < n; i++) {
//            int left = 0, right = 0, len = ret.length();
//            StringBuilder tmp = new StringBuilder();
//            while (right < len) {
//                while (right < len && ret.charAt(left) == ret.charAt(right)) {
//                    right++;
//                }
//                tmp.append(right - left);
//                tmp.append(ret.charAt(left));
//                left = right;
//            }
//            ret = new String(tmp);
//        }
//        return ret;
//    }
//}


// LeetCode 1419. 数青蛙
//class Solution {
//    public int minNumberOfFrogs(String croakOfFrogs) {
//        int[] arr = new int[5];// c r o a k
//        for (int i = 0; i < croakOfFrogs.length(); i++) {
//            char ch = croakOfFrogs.charAt(i);
//            if (ch == 'c') {
//                if (arr[4] > 0) {
//                    arr[4]--;
//                    arr[0]++;
//                } else {
//                    arr[0]++;
//                }
//            } else {
//                switch (ch) {
//                    case 'r':
//                        if (arr[0] != 0) {
//                            arr[0]--;
//                            arr[1]++;
//                        } else {
//                            return -1;
//                        }
//                        break;
//                    case 'o':
//                        if (arr[1] != 0) {
//                            arr[1]--;
//                            arr[2]++;
//                        } else {
//                            return -1;
//                        }
//                        break;
//                    case 'a':
//                        if (arr[2] != 0) {
//                            arr[2]--;
//                            arr[3]++;
//                        } else {
//                            return -1;
//                        }
//                        break;
//                    case 'k':
//                        if (arr[3] != 0) {
//                            arr[3]--;
//                            arr[4]++;
//                        } else {
//                            return -1;
//                        }
//                        break;
//                }
//            }
//        }
//        for (int i = 0; i < 4; i++) {
//            if (arr[i] != 0) return -1;
//        }
//        return arr[4];
//    }
//}
//class Solution {
//    public int minNumberOfFrogs(String croakOfFrogs) {
//        char[] arr = croakOfFrogs.toCharArray();
//        String str = "croak";
//        int n = str.length();
//        int[] num = new int[n];// c r o a k
//        HashMap<Character, Integer> hash = new HashMap<>();
//        for (int i = 0; i < n; i++) hash.put(str.charAt(i), i);
//        for (char ch : arr) {
//            if (ch == str.charAt(0)) {
//                num[0]++;
//                if (num[4] != 0) num[4]--;
//            } else {
//                int index = hash.get(ch);
//                if (num[index - 1] == 0) return -1;
//                num[index - 1]--;
//                num[index]++;
//            }
//        }
//        for (int i = 0; i < n - 1; i++) {
//            if (num[i] != 0) return -1;
//        }
//        return num[4];
//    }
//}