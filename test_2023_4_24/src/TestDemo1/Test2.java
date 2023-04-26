package TestDemo1;

class Base {
    public int a = 1;
    public int b = 2;
}

class Derived extends Base {
    public int c = 3;

    public void fun() {
        /*super.a = 10;//这里的a就是父类的a
        b = 20;
        c = 30;*/
        System.out.println(super.a);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.fun();
    }
}
