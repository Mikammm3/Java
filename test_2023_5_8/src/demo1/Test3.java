package demo1;

class OutClass2 {
    public int data1 = 1;
    private int data2;
    public static int data3;

    static class InnerClass {
        public int data4 = 4;
        private int data5 = 5;
        public static int data6 = 6;

        public void test() {

            OutClass2 outClass2 = new OutClass2();
            System.out.println(outClass2.data1);

            System.out.println("静态内部类的test方法");
        }
    }
}

public class Test3 {
    public void fun() {
        class Inner {
            public int data1 = 1;
        }
        Inner inner = new Inner();
        System.out.println(inner.data1);
    }

    public static void main(String[] args) {
        OutClass2.InnerClass innerClass = new OutClass2.InnerClass();
        innerClass.test();
    }
}
