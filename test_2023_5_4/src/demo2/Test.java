package demo2;

interface A {
    void testA();
}

interface B {
    void testB();
}

//有一个接口C，同时具备A和B的功能，extends 拓展
interface C extends A, B {
    void testC();
}


public class Test implements C {
    @Override
    public void testA() {
        System.out.println("testA()");
    }

    @Override
    public void testB() {
        System.out.println("testB()");
    }

    @Override
    public void testC() {
        System.out.println("testC()");
    }
}
