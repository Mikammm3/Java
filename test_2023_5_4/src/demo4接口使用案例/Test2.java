package demo4接口使用案例;


class Money implements Cloneable {
    public double money = 19.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    public int age;
    public Money m;

    public Person(int age) {
        this.age = age;
        this.m = new Money();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp = (Person) super.clone();
        tmp.m = (Money) this.m.clone();
        return tmp;
    }

    @Override
    public String toString() {
        return "Person{" +
                " age=" + age +
                '}';
    }
}

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person(10);
        Person person2 = (Person) person1.clone();
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
        System.out.println("=============");
        person2.m.money = 99.99;
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }
}
