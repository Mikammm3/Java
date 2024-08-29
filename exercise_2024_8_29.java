

// leetcode LCR 123. 图书整理 I
//class Solution {
//    public int[] reverseBookList(ListNode head) {
//        if (head == null) return new int[0];
//        // 头插法
//        ListNode prev = head;
//        ListNode cur = head.next;
//        prev.next = null;
//        int len = 1;
//        while (cur != null) {
//            ListNode curNext = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//            len++;
//        }
//        int[] ret = new int[len];
//        int i = 0;
//        cur = prev;
//        while (cur != null) {
//            ret[i++] = cur.val;
//            cur = cur.next;
//        }
//        return ret;
//    }
//}
//class Solution {
//    public int[] reverseBookList(ListNode head) {
//        getList(head);
//        int[] ret = new int[arr.size()];
//        for (int i = 0; i < ret.length; i++) {
//            ret[i] = arr.get(i);
//        }
//        return ret;
//
//    }
//
//    public List<Integer> arr = new ArrayList<>();
//
//    public void getList(ListNode cur) {
//        if (cur == null) return;
//        getList(cur.next);
//        arr.add(cur.val);
//    }
//}


// leetcode LCR 192. 把字符串转换成整数 (atoi)
//class Solution {
//    public int myAtoi(String str) {
//        int i = 0;
//        int len = str.length();
//        // 是否是负数
//        boolean flg = false;
//        // 记录正负号数量
//        int flgOp = 0;
//        // 记录数字串
//        StringBuilder num = new StringBuilder();
//
//        // 跳过前导空格
//        while (i < len && str.charAt(i) == ' ') {
//            i++;
//        }
//        // 下一个字符是否是正负号，如果正负号或点号大于等于 2，则返回 0
//        if (i < len && str.charAt(i) == '-') {
//            flgOp++;
//            flg = true;
//            i++;
//        }
//        if (i < len && str.charAt(i) == '+') {
//            flgOp++;
//            i++;
//        }
//
//        // 如果该字符不是数字，则返回 0
//        if (i < len && !isNum(str.charAt(i))) {
//            return 0;
//        }
//        // 记录 从 i 开始一直到非数字的整个数字范围
//        int end = i;
//        while (end < len && isNum(str.charAt(end))) {
//            end++;
//        }
//        String tmp = str.substring(i, end);
//        // 添加进数字字符串中
//        num.append(tmp);
//        // 到这里就是非数字部分，直接退出
//        // 正负号数量大于 1，则说明字符串不合法
//        if (flgOp >= 2) {
//            return 0;
//        }
//
//        double sum = 0;
//        // 用 i 遍历 num 数字串
//        i = 0;
//        // 根据 num 字符串，计算结果
//        // 跳过前导 0
//        while (i < num.length() && num.charAt(i) == '0') {
//            i++;
//        }
//        while (i < num.length()) {
//            int t = num.charAt(i) - '0';
//            sum = (sum * 10 + t);
//            i++;
//        }
//        // 如果是负数
//        if (flg) {
//            sum *= -1;
//        }
//
//        if (sum > Integer.MAX_VALUE - 1) {
//            return Integer.MAX_VALUE;
//        } else if (sum < Integer.MIN_VALUE) {
//            return Integer.MIN_VALUE;
//        } else {
//            return (int) sum;
//        }
//
//    }
//
//    public boolean isNum(char c) {
//        return c >= '0' && c <= '9';
//    }
//}