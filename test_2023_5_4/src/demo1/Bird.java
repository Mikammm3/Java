package demo1;

public class Bird extends Animal implements IFlying, IRunning {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.name + " 正在吃鸟粮！");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " 正在用翅膀飞！");
    }

    @Override
    public void run() {
        System.out.println(this.name + " 正在用鸟腿跑！");
    }
}
