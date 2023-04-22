public class Test2 {
    public static void main(String[] args) {
        //通过new关键字 实例化了一个Dog对象
        Dog dog = new Dog();
        //dog就是一个引用，指向了Dog对象
        dog.name = "小狗";
        dog.age = 10;
        dog.color = "白色";

        dog.eat();
        dog.bark();
    }

}

class ClassName {
    //成员变量/属性/字段

    //成员方法//行为
}


class WashMachine {
    //成员变量
    public String brand; // 品牌
    public String type; // 型号
    public double weight; // 重量
    public double length; // 长
    public double width; // 宽
    public double height; // 高
    public String color; // 颜色

    public void washClothes() {
        System.out.println("洗衣服");
    }

    public void dryClothes() {
        System.out.println("脱水");
    }
}

class Dog {
    public String name;
    public int age;
    public String color;

    public void eat() {
        System.out.println(name + "吃饭");
    }

    public void bark() {
        System.out.println(name + "在狗叫");
    }
}


class Student {
    public String name;
    public String sex;
    public int age;

    public void doHomework() {
        System.out.println(name + "写作业");
    }

    public void doClass() {
        System.out.println(name + "上课");
    }

    public void exam() {
        System.out.println(name + "考试");
    }
}
