
// leetcode 20. 有效的括号
//class Solution {
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (ch == '(' || ch == '[' || ch == '{') {
//                stack.push(ch);
//            } else {
//                if (stack.isEmpty()) {
//                    return false;
//                } else {
//                    char top = stack.peek();
//                    if ((ch == ')' && top == '(')
//                            || (ch == ']' && top == '[')
//                            || (ch == '}' && top == '{')) {
//                        stack.pop();
//                    } else {
//                        return false;
//                    }
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
//}


// leetcode 155. 最小栈
//class MinStack {
//
//    Stack<Integer> stack;
//    Stack<Integer> minStack;
//
//    public MinStack() {
//        stack = new Stack<>();
//        minStack = new Stack<>();
//
//    }
//
//    public void push(int val) {
//        stack.push(val);
//        if (minStack.isEmpty()) {
//            minStack.push(val);
//        } else {
//            if (val <= minStack.peek()) {
//                minStack.push(val);
//            }
//        }
//    }
//
//    public void pop() {
//        if (stack.isEmpty())
//            return;
//        int top = stack.pop();
//        if (top == minStack.peek()) {
//            minStack.pop();
//        }
//
//    }
//
//    public int top() {
//        if (stack.isEmpty())
//            return -1;
//        return stack.peek();
//
//    }
//
//    public int getMin() {
//        if (minStack.isEmpty())
//            return -1;
//        return minStack.peek();
//    }
//}

// leetcode 394. 字符串解码
//class Solution {
//    public String decodeString(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == ']') {
//                // 找到最近的 [, 并计算括号里的内容
//                StringBuilder str = new StringBuilder();
//                StringBuilder num = new StringBuilder();
//                while (!stack.isEmpty() && stack.peek() != '[') {
//                    str.insert(0, stack.pop());
//                }
//                // 踢掉 [
//                stack.pop();
//                // 获取完整的正数
//                // ]300
//                while (!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9') {
//                    num.insert(0, stack.pop());
//                }
//                // 追加
//                int n = Integer.valueOf(num.toString()) - 1;
//                String tmp = new String(str);
//                for (int j = 0; j < n; j++) {
//                    str.append(tmp);
//                }
//                // 将字符串放回栈里
//                for (int j = 0; j < str.length(); j++) {
//                    stack.push(str.charAt(j));
//                }
//            } else {
//                stack.push(c);
//            }
//        }
//        // 此时，栈里的字符就是完整的字符串了, 逆序后返回即可。
//        StringBuilder str = new StringBuilder();
//        while (!stack.isEmpty()) {
//            str.append(stack.pop());
//        }
//        return str.reverse().toString();
//    }
//}

// leetcode 739. 每日温度
//class Solution {
//    public int[] dailyTemperatures(int[] temperatures) {
//        // 求右边第一个比当前元素大的数，可以用单调栈来写
//        // 栈里存储的是已经遍历过的元素，并且这些元素是单调递增的
//        Stack<Integer> stack = new Stack<>();
//        int[] ans = new int[temperatures.length];
//        for (int i = 0; i < temperatures.length; i++) {
//            if (stack.isEmpty()) {
//                // 如果栈为空，则入栈
//                stack.push(i);
//            } else {
//                // 栈不为空，则需要判断
//                if (temperatures[i] > temperatures[stack.peek()]) {
//                    // 如果当前元素大于栈顶元素，则计算栈顶元素，并弹出栈顶(保持递增)
//                    // 循环直到栈顶元素大于等于当前元素，然后当前元素入栈
//                    while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
//                        int index = stack.pop();
//                        ans[index] = i - index;
//                    }
//                    stack.push(i);
//                } else {
//                    // 如果当前元素小于等于栈顶元素，则满足单调递增，入栈
//                    stack.push(i);
//                }
//            }
//        }
//        return ans;
//    }
//}


// leetcode 84. 柱状图中最大的矩形
//class Solution {
//    public int largestRectangleArea(int[] heights) {
//        // 思路: 以当前元素的高度 h 为基准，找左边第一个比 h 小的元素 arr[left]
//        // 再找右边第一个比 h 小的元素 arr[right]
//        // 则以 h 高度的面积最大是：(right - left - 1) * h
//
//        // 可以用单调栈来做, 栈里元素是单调递减的
//        List<Integer> heigh = new ArrayList<>();
//        // 给数组头和尾都加上 0 ，防止访问栈为空的情况
//        heigh.add(0);
//        for (int x : heights) {
//            heigh.add(x);
//        }
//        heigh.add(0);
//
//        Stack<Integer> stack = new Stack<>();
//        int maxArea = 0;
//        for (int i = 0; i < heigh.size(); i++) {
//            int cur = heigh.get(i);
//            // 如果当前元素是小于栈顶元素的，不符合单调递减，则栈顶元素出栈
//            // 就相当于以栈顶元素 mid 为基准，在栈顶元素左边 left 是比 mid 要小的
//            // right 为当前元素 i ，就是比栈顶元素要小的
//            // 找到左边和右边第一个比我小的元素之后，就可以计算面积了
//            // 面积 = (right - left - 1) * 栈顶元素的高度
//            while (!stack.isEmpty() && cur < heigh.get(stack.peek())) {
//                int right = i, mid = stack.pop();
//                int left = stack.peek();
//                int area = (right - left - 1) * heigh.get(mid);
//                maxArea = Math.max(maxArea, area);
//            }
//            stack.push(i);
//        }
//        return maxArea;
//    }
//}