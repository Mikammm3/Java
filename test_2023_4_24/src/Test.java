

//class Fruit {
//    String shape;
//    String size;
//    String color;
//}
//
//
//class Banana extends Fruit {
//    String type;
//    int price;
//}


//class Base {
//    int a;
//    int b;
//}
//
//class Derived extends Base {
//    int c;
//
//    public void method() {
//        a = 10; // 访问从父类中继承下来的a
//        b = 20; // 访问从父类中继承下来的b
//        c = 30; // 访问子类自己的c
//    }
//}


//class Base {
//    int a;
//    int b;
//    int c;
//}
//
//class Derived extends Base {
//    int a; // 与父类中成员a同名，且类型相同
//    char b; // 与父类中成员b同名，但类型不同
//
//    public void method() {
//        a = 100; // 访问子类自己的a
//        b = 101; // 访问子类自己的b，存的是ASCII码值
//        c = 102; // 子类没有c，访问的肯定是从父类继承下来的c
//        // d = 103; // 编译失败，因为父类和子类都没有定义成员变量b
//        System.out.println(b);
//    }
//}
//
public class Test {
    public static void main(String[] args) {
//        Derived derived = new Derived();
//        derived.method();
    }
}