

class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name + " 正在吃...");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void fly() {
        System.out.println(this.name + " 正在飞！");
    }

}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void wangWang() {
        System.out.println(this.name + " 正在汪汪！");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " 正在吃狗粮！");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Bird("小鸟", 10);
        //这就是向下转型
        if (animal instanceof Bird) {
            Bird bird = (Bird) animal;
            bird.fly();
        }
    }

    public static void main2(String[] args) {
        Animal animal = new Dog("旺财", 10);
        animal.eat();
    }


//    public static Animal func() {
//        return new Bird("小鸟", 3);
//    }
//
//    public static void main1(String[] args) {
//        Animal animal = func();
    //向上转型
//        Dog dog = new Dog("旺财", 10);
//        Animal animal = dog;
    //向上转型
    //Animal animal = new Dog("旺财",5);


//        Dog dog = new Dog("旺财",7);
//        func(dog);
//    }
//    public static void func(Animal animal){
//
//    }
}
