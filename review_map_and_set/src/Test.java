import java.util.*;

class Stu {
    public int age;
    public String name;

    public Stu(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stu stu = (Stu) o;
        return age == stu.age && Objects.equals(name, stu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}


public class Test {

    public static void main(String[] args) {
        HashBucket2<Stu, String> hashBucket2 = new HashBucket2<>();
        Stu s1 = new Stu(9, "张三");
        Stu s2 = new Stu(19, "李四");
        Stu s3 = new Stu(29, "四四");

        hashBucket2.put(s1, "张三");
        hashBucket2.put(s2, "李四");

        String val1 = hashBucket2.get(s1);
        System.out.println(val1);

        String val2 = hashBucket2.get(s3);
        System.out.println(val2);


    }

    public static void main4(String[] args) {
        HashBucket hashBucket = new HashBucket();
        hashBucket.put(1, 1);
        hashBucket.put(2, 2);
        hashBucket.put(3, 3);
        hashBucket.put(13, 13);
        System.out.println(hashBucket.get(100));
        hashBucket.put(4, 4);
        hashBucket.put(5, 5);
        hashBucket.put(6, 6);
        hashBucket.put(7, 7);
        hashBucket.put(8, 8);
        System.out.println(hashBucket.get(8));
    }

    public static void main3(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("abc");
        set.add("idol");
        set.add("hello");

        System.out.println(set);

        for (String s : set) {
            System.out.println(s);
        }
    }


    public static void main2(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.put("a", 3);
        System.out.println();
        map2.put("a", 8888);
        map2.put("c", 2);
        map2.put("d", 3);
        System.out.println();

//        int val = map2.get("a");
//        System.out.println(val);
//        int val2 = map2.getOrDefault("y", 8888);
//        System.out.println(val2);
//        // 得到所有 key
//        Set<String> keys = map2.keySet();
//        // 得到所有 value
//        Collection<Integer> values = map2.values();

//        Set<Map.Entry<String, Integer>> entries = map2.entrySet();
//        for (Map.Entry<String, Integer> entry : entries) {
//            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
//        }

    }

    public static void main1(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(70);
        binarySearchTree.insert(59);
        binarySearchTree.insert(90);
        binarySearchTree.insert(37);
        binarySearchTree.insert(63);
        binarySearchTree.insert(83);
        binarySearchTree.insert(120);
        binarySearchTree.insert(85);
        binarySearchTree.insert(84);
        binarySearchTree.remove(90);

        System.out.println();
//        System.out.println(binarySearchTree.search(13));
//        System.out.println(binarySearchTree.search(83));
    }
}

//class Solution {
//    public int singleNumber(int[] nums) {
//        // 创建哈希表
//        Map<Integer, Integer> hash = new HashMap<>();
//        // 统计数组中每个元素出现的次数
//        for (int i = 0; i < nums.length; i++) {
//            int key = nums[i];
//            // 先根据 key 得到 key 的出现次数
//            int count = hash.getOrDefault(key, 0);
//            // 然后再更新 key 的出现次数
//            hash.put(key, count + 1);
//        }
//        // 遍历数组，看看哪个元素出现次数是 1
//        for (int i = 0; i < nums.length; i++) {
//            int key = nums[i];
//            // 先根据 key 得到 key 的出现次数
//            int count = hash.get(key);
//            // 然后再判断 key 的出现次数是否为 1
//            if (count == 1) {
//                // 说明找到了，返回即可。
//                return key;
//            }
//        }
//
//        // 到了这里，说明没有出现次数为 1 的数字，(但是看题得知代码不可能走到这里，随便返回一个数就行)
//        return -1;
//    }
//}


//class Solution {
//    public int singleNumber(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int n : nums) {
//            if (set.contains(n)) {
//                // 如果存在，则从 set 中删除该元素
//                set.remove(n);
//            } else {
//                // 如果不存在，说明该元素是第一次出现，添加进 set 中
//                set.add(n);
//            }
//        }
//        Object[] ans = set.toArray();
//        return (int) ans[0];
//    }
//}


//class Solution {
//    public int numJewelsInStones(String jewels, String stones) {
//        Set<Character> set = new HashSet<>();
//        // 将宝石放入 set 中
//        for (char ch : jewels.toCharArray()) {
//            set.add(ch);
//        }
//        // 记录宝石的数量
//        int count = 0;
//        // 然后遍历石头中的每个元素，看看该元素是否在 set 中存在，如果是，count++
//        for (char ch : stones.toCharArray()) {
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
//        for (char c : stones.toCharArray()) {
//            String str = c + "";
//            // 看看 str 是否是 jewels 的子串
//            if (jewels.contains(str)) {
//                count++;
//            }
//        }
//        return count;
//    }
//}


//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNext()) { // 注意 while 处理多个 case
//            String s1 = in.next();// 原来输入的
//            String s2 = in.next();// 实际输出的
//            print(s1, s2);
//        }
//    }
//
//
//    public static void print(String s1, String s2) {
//        // 将实际输出的字符串的每个元素放入 set1 中
//        // 然后遍历原本输入的字符串的每个元素，
//        // 看看该元素是否在 set1 中存在，如果存在说明该元素键盘没坏
//        // 如果不存在，则存入 set2 中，
//        // 最后遍历原来输出的内容，看看这个元素是否在 set2 中存在
//        // 如果存在，说明是坏键，先把这个坏键从 set2 中删除，然后输出，
//        // 然后判断 set2 是否为空，如果为空，直接返回。
//        Set<Character> set1 = new HashSet<>();
//        Set<Character> set2 = new HashSet<>();
//        for (char ch : s2.toUpperCase().toCharArray()) {
//            set1.add(ch);
//        }
//        for (char ch : s1.toUpperCase().toCharArray()) {
//            if (!set1.contains(ch)) {
//                set2.add(ch);
//            }
//        }
//        for (char ch : s1.toUpperCase().toCharArray()) {
//            if (set2.contains(ch)) {
//                set2.remove(ch);
//                System.out.print(ch);
//                if (set2.isEmpty()) {
//                    System.out.println();
//                    return;
//                }
//            }
//        }
//    }
//}


//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        while (in.hasNext()) { // 注意 while 处理多个 case
//            String s1 = in.next();// 原来输入的
//            String s2 = in.next();// 实际输出的
//            print(s1, s2);
//        }
//    }
//
//
//    public static void print(String s1, String s2) {
//        // 将实际输出的字符串的每个元素放入 set1 中
//        // 然后遍历原本输入的字符串的每个元素，
//        // 看看该元素是否在 set1 中存在，如果存在说明该元素键盘没坏
//        // 如果不存在，则看看这个元素是否在 set2 中存在
//        // 如果不存在，说明是第一次遇见坏键，打印，然后加到 set2 中
//        Set<Character> set1 = new HashSet<>();
//        Set<Character> set2 = new HashSet<>();
//        char[] arr1 = s1.toUpperCase().toCharArray();
//        char[] arr2 = s2.toUpperCase().toCharArray();
//        for (char ch : arr2) {
//            set1.add(ch);
//        }
//        for (char ch : arr1) {
//            // 既是坏键，又是第一次遇到时，才打印该坏键
//            if (!set1.contains(ch) && !set2.contains(ch)) {
//                System.out.print(ch);
//                set2.add(ch);
//            }
//        }
//        System.out.println();
//
//    }
//}