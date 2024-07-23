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


