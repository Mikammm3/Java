import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        //使用迭代器遍历从后往前遍历
        ListIterator<Integer> listIterator = list2.listIterator(list2.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();

        System.out.println("======================");

        
        //使用迭代器遍历
        ListIterator<Integer> listIterator2 = list2.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        System.out.println("======================");

        //使用迭代器遍历
        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("======================");
        //使用for each循环
        for (Integer x : list2) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("======================");
        //使用for循环遍历
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();
    }

    public static void main2(String[] args) {
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        //截取list2 的[1,3)位置的值给list3
        List<Integer> list3 = list2.subList(1, 3);
        //将list3的0下标的值更新成188
        list3.set(0, 188);
        System.out.println(list3);
        System.out.println(list2);


        //list2.remove(new Integer(2));
        //list2.set(0, 99);
        //System.out.println(list2);
        //System.out.println(list2.get(1));


        /*//要删除2这个值
        list2.remove(2);
        System.out.println(list2);*/
    }

    public static void main1(String[] args) {
        List<Integer> list1 = new ArrayList<>(99);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(0, 100);
        System.out.println(list2);


        List<Integer> list = new LinkedList<>();
        List<Integer> list3 = new ArrayList<>(list);//可以向上转型

        /*list1.add(1);
        list1.add(2);
        list1.add(3);*/
        //list3.add(1999);//默认是放到数组最后一个位置
        //System.out.println(list3);

    }
}
