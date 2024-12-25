
// leetcode 208. 实现 Trie (前缀树)
//class Trie {
//
//    Set<String> hash;
//
//    public Trie() {
//        hash = new HashSet<>();
//
//    }
//
//    public void insert(String word) {
//        hash.add(word);
//    }
//
//    public boolean search(String word) {
//        if (!hash.isEmpty() && hash.contains(word)) return true;
//        return false;
//    }
//
//    public boolean startsWith(String prefix) {
//        if (!hash.isEmpty() && hash.contains(prefix)) return true;
//        for (String s : hash) {
//            if (s.length() >= prefix.length() && s.substring(0, prefix.length()).equals(prefix)) {
//                return true;
//            }
//        }
//        return false;
//    }
//}


// leetcode 207. 课程表
//class Solution {
//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        // 先记录对应课程的入度/前提课程数组，
//        // (入度表示有 n 个箭头指向该课程，也就是先要先学习 n 个课程，才能学习该课程)
//        // 需要记录队列，将入度为 0 的课程添加到队列中
//        // 然后取出队首元素 top，看看 top 指向哪些课程，并把指向课程的入度减一
//        // 重复上述过程，如果最后课程数组入度全为1，则说明可以完成所有课程的学习，否则返回 false
//        int[] courses = new int[numCourses];
//        // 队列记录的是可学习的课程
//        Queue<Integer> learnedCourse = new LinkedList<>();
//        // 记录当前 cur 课程指向哪些课程(入度)(指向哪些课程，哪些课程的前置课程是 cur)
//        Map<Integer, List<Integer>> target = new HashMap<>();
//        for (int i = 0; i < prerequisites.length; i++) {
//            int[] arr = prerequisites[i];
//            int result = arr[0];// 当前想完成的课程
//            int condition = arr[1];// 前提
//            // condition -> result, 完成了 condition，就能解锁 result
//            courses[result]++;
//            List<Integer> needUnlock = target.getOrDefault(condition, new ArrayList<>());
//            needUnlock.add(result);
//            target.put(condition, needUnlock);
//        }
//
//        for (int i = 0; i < numCourses; i++) {
//            if (courses[i] == 0) {
//                // 说明该课程已经被解锁，可以学习，则放入队列中
//                learnedCourse.offer(i);
//            }
//        }
//        while (!learnedCourse.isEmpty()) {
//            int cur = learnedCourse.poll();
//            List<Integer> needUnlock = target.getOrDefault(cur, new ArrayList<>());
//            for (int i = 0; i < needUnlock.size(); i++) {
//                // 让对应的入度减 1
//                int now = needUnlock.get(i);
//                courses[now]--;
//                // 如果课程解锁，则入队列
//                if (courses[now] == 0) {
//                    learnedCourse.offer(now);
//                }
//            }
//        }
//
//        // 如果课程全部解锁，入度为 0，则说明可以完成返回 true
//        // 否则完成不了，返回 false
//        for (int i = 0; i < numCourses; i++) {
//            if (courses[i] != 0) {
//                return false;
//            }
//        }
//        return true;
//
//    }
//}