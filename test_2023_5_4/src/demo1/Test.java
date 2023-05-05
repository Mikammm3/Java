package demo1;

public class Test {

    public static void test4(IFlying iFlying) {
        iFlying.fly();
    }

    public static void test3(ISwimming iSwimming) {
        iSwimming.swim();
    }

    public static void test2(IRunning iRunning) {
        iRunning.run();
    }

    public static void test1(Animal animal) {
        animal.eat();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("旺财", 10);
        Bird bird = new Bird("小鸟", 3);
        test1(dog);
        test1(bird);
        System.out.println("==============");
        test2(dog);
        test2(bird);
        System.out.println("==============");
        test3(dog);
        test4(bird);
        System.out.println("==============");
        test2(new Robot());
    }
}

