import java.util.*;

public class Test {

    public static void main(String[] args) {

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


