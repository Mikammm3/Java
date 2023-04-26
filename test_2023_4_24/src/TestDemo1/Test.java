package TestDemo1;

class Animal {
    String name;
    String color;
    int age;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(this.name + " 正在吃饭！");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(this.name + " 正在汪汪叫！");
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void mew() {
        System.out.println(this.name + " 正在喵喵叫！");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财");
        /*dog.name = "旺财";*/
        dog.eat();
        dog.bark();
        System.out.println("=========");
        Cat cat = new Cat("咪咪");
        /*cat.name = "咪咪";*/
        cat.eat();
        cat.mew();
    }
}
