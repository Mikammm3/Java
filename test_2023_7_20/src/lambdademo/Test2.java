package lambdademo;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("abc", 3);
        map.put("hello", 13);
        map.put("zhangsan", 31);


        /*map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println("key: " + s + " val:" + integer);
            }
        });*/
        map.forEach((x, y) -> System.out.println("key: " + x + " val:" + y));
    }

    public static void main1(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("abc");
        list.add("zhangsan");

        /*list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        list.forEach(s -> System.out.println(s));
        System.out.println("========");
        /*list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/
        list.sort((x, y) -> x.compareTo(y));

        list.forEach(s -> System.out.println(s));

    }
}
