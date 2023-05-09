package demo1;

interface A {
    void testA();
}

public class Test {
    public static void main(String[] args) {
        int val = 10;
        //val = 100;
        A a = new A() {
            @Override
            public void testA() {
                //默认在这里能访问的是被final修饰的
                System.out.println("值：" + val);
            }
        };//匿名内部类
        a.testA();
    }
}
