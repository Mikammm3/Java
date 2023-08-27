package lambdademo;

import java.util.Comparator;
import java.util.PriorityQueue;


//无返回值无参数
@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}

//无返回值一个参数
@FunctionalInterface
interface OneParameterNoReturn {
    void test(int a);
}

//无返回值多个参数
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a, int b);
}


//有返回值无参数
@FunctionalInterface
interface NoParameterReturn {
    int test();
}

//有返回值一个参数
@FunctionalInterface
interface OneParameterReturn {
    int test(int a);
}

//有返回值多参数
@FunctionalInterface
interface MoreParameterReturn {
    int test(int a, int b);
}

public class Test {
    public static void main7(String[] args) {
        /*MoreParameterReturn moreParameterReturn = (x, y) -> {
            return x + y;
        };*/
        MoreParameterReturn moreParameterReturn = (x, y) -> x + y;
        System.out.println(moreParameterReturn.test(666, 666));
    }

    public static void main6(String[] args) {
        /*OneParameterReturn oneParameterReturn = x -> {
            return x;
        };*/
        OneParameterReturn oneParameterReturn = x -> x;
        System.out.println(oneParameterReturn.test(666));
    }

    public static void main5(String[] args) {
        /*NoParameterReturn noParameterReturn = () -> {
            return 10;
        };*/
        NoParameterReturn noParameterReturn = () -> 10;
        System.out.println(noParameterReturn.test());
    }

    public static void main4(String[] args) {
        MoreParameterNoReturn moreParameterNoReturn = (a, b) -> System.out.println(a + b);
        moreParameterNoReturn.test(333, 333);
    }

    public static void main3(String[] args) {
        /*OneParameterNoReturn oneParameterNoReturn = (x) -> {
            System.out.println(x);
        };*/
        OneParameterNoReturn oneParameterNoReturn = x -> System.out.println(x);
        oneParameterNoReturn.test(888);
    }

    public static void main2(String[] args) {
        NoParameterNoReturn noParameterNoReturn = new NoParameterNoReturn() {
            @Override
            public void test() {
                System.out.println("test......");
            }
        };
        noParameterNoReturn.test();

        System.out.println("=========");

        NoParameterNoReturn noParameterNoReturn2 = () -> {
            System.out.println("test......");
        };
        noParameterNoReturn2.test();
    }

    public static void main1(String[] args) {
        //int a = 10;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //a = 20;
                //System.out.println(a);
                return o1 - o2;
            }
        });

        int a = 10;
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>((o1, o2) -> {
            //a = 999;
            System.out.println(a);
            return o1 - o2;
        });
    }
}
