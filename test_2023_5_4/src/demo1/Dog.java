package demo1;

public class Dog extends Animal implements ISwimming, IRunning {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.name + " 正在吃狗粮！");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " 正在用狗腿游泳！");
    }

    @Override
    public void run() {
        System.out.println(this.name + " 正在用狗腿跑！");
    }
}
