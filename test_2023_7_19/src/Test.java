import java.util.*;

class Person {
    public String id;

    public Person(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class Test {

    public static void main(String[] args) {
        Person p1 = new Person("123");
        Person p2 = new Person("123");

        HashBucket2<Person, String> hashBucket2 = new HashBucket2<>();
        hashBucket2.put(p1, "zhangsan");
        System.out.println(hashBucket2.get(p1));
    }
}


//class Solution {
//    public int singleNumber(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            if (set.contains(num)) {
//                set.remove(num);
//            } else {
//                set.add(num);
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (set.contains(nums[i])) {
//                return nums[i];
//            }
//        }
//        return -1;
//    }
//}


//class Solution {
//    public int singleNumber(int[] nums) {
//        int ret = 0;
//        for (int i = 0; i < nums.length; i++) {
//            ret ^= nums[i];
//        }
//        return ret;
//    }
//}


//// Definition for a Node.
//class Node {
//    int val;
//    Node next;
//    Node random;
//
//    public Node(int val) {
//        this.val = val;
//        this.next = null;
//        this.random = null;
//    }
//}
//
//class Solution {
//    public Node copyRandomList(Node head) {
//        Map<Node, Node> map = new HashMap<>();
//        //用cur遍历链表
//        Node cur = head;
//        while (cur != null) {
//            Node node = new Node(cur.val);
//            //1.将老节点和新节点存入map中
//            map.put(cur, node);
//            cur = cur.next;
//        }
//        cur = head;
//        while (cur != null) {
//            //2.利用map将新节点的next和random赋值
//            Node node = map.get(cur);
//            node.next = map.get(cur.next);
//            node.random = map.get(cur.random);
//            cur = cur.next;
//        }
//        //返回新的头结点
//        return map.get(head);
//    }
//}


//class Solution {
//    public int numJewelsInStones(String jewels, String stones) {
//        Set<Character> set = new HashSet<>();
//        for (int i = 0; i < jewels.length(); i++) {
//            char ch = jewels.charAt(i);
//            set.add(ch);
//        }
//        int count = 0;
//        for (int i = 0; i < stones.length(); i++) {
//            char ch = stones.charAt(i);
//            if (set.contains(ch)) {
//                count++;
//            }
//        }
//        return count;
//    }
//}

//class Solution {
//    public int numJewelsInStones(String jewels, String stones) {
//        int count = 0;
//        for (int i = 0; i < stones.length(); i++) {
//            char stone = stones.charAt(i);
//            String str = stone + "";
//            if (jewels.contains(str)) {
//                count++;
//            }
//        }
//        return count;
//    }
//}


//class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
//            String input = in.nextLine();
//            String output = in.nextLine();
//            print(input, output);
//        }
//    }
//
//    private static void print(String input, String output) {
//        //set用来存放output的内容
//        Set<Character> set = new HashSet<>();
//        //set用来存放坏键
//        Set<Character> set2 = new HashSet<>();
//        //因为要求输出字母大写，所以先将俩字符串转大写
//        input = input.toUpperCase();
//        output = output.toUpperCase();
//        //1.遍历output，将output内容存入set中
//        for (int i = 0; i < output.length(); i++) {
//            set.add(output.charAt(i));
//        }
//        //2.遍历input，看看input是否在set中存在
//        // 如果不存在，则为坏键，则添加进set2中
//        for (int i = 0; i < input.length(); i++) {
//            if (!set.contains(input.charAt(i))) {
//                set2.add(input.charAt(i));
//            }
//        }
//        //3.遍历input，将坏键内容输出，因为不能输出重复的
//        // 所以输出一个坏键就从set2中删除对应的坏键
//        // 等set2空了，就return走人
//        for (int i = 0; i < input.length(); i++) {
//            if (set2.isEmpty()) {
//                return;
//            }
//            if (set2.contains(input.charAt(i))) {
//                System.out.print(input.charAt(i));
//                set2.remove(input.charAt(i));
//            }
//        }
//    }
//}


//class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
//            String input = in.nextLine();
//            String output = in.nextLine();
//            print(input, output);
//        }
//    }
//
//    private static void print(String input, String output) {
//        //set用来存放output的内容
//        Set<Character> set = new HashSet<>();
//        //set用来存放坏键
//        Set<Character> set2 = new HashSet<>();
//        //因为要求输出字母大写，所以先将俩字符串转大写
//        input = input.toUpperCase();
//        output = output.toUpperCase();
//        //1.遍历output，将output内容存入set中
//        for (int i = 0; i < output.length(); i++) {
//            set.add(output.charAt(i));
//        }
//        //2.遍历input，看看input是否在set中存在
//        // 如果不存在，则为坏键，则添加进set2中
//        for (int i = 0; i < input.length(); i++) {
//            if (!set.contains(input.charAt(i)) && !set2.contains(input.charAt(i))) {
//                System.out.print(input.charAt(i));
//                set2.add(input.charAt(i));
//            }
//        }
//    }
//}


//class Solution {
//    public List<String> topKFrequent(String[] words, int k) {
//        //1.统计每个单词出现的次数
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < words.length; i++) {
//            //第一次碰到
//            if (map.get(words[i]) == null) {
//                map.put(words[i], 1);
//            } else {
//                int val = map.get(words[i]);
//                map.put(words[i], val + 1);
//            }
//        }
//        //2.建立小根堆,指定比较的方式
//        PriorityQueue<Map.Entry<String, Integer>> minHeap
//                = new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//
//                if (o1.getValue().compareTo(o2.getValue()) == 0) {
//                    //按照字母顺序建立大根堆
//                    return o2.getKey().compareTo(o1.getKey());
//                }
//
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });//匿名内部类
//
//        //3.遍历map，调整优先级队列
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//
//            if (minHeap.size() < k) {
//                minHeap.offer(entry);
//            } else {
//                Map.Entry<String, Integer> top = minHeap.peek();
//                //如果当前频率相同
//                if (entry.getValue().compareTo(top.getValue()) == 0) {
//                    //字母顺序小的进来
//                    if (top.getKey().compareTo(entry.getKey()) > 0) {
//                        //出队
//                        minHeap.poll();
//                        minHeap.offer(entry);
//                    }
//                } else {
//                    if (entry.getValue().compareTo(top.getValue()) > 0) {
//                        minHeap.poll();
//                        minHeap.offer(entry);
//                    }
//                }
//            }
//        }
//
//        List<String> ret = new ArrayList<>();
//        for (int i = 0; i < k; i++) {
//            Map.Entry<String, Integer> top = minHeap.poll();
//            ret.add(top.getKey());
//        }
//
//        Collections.reverse(ret);
//
//        return ret;
//    }
//}




