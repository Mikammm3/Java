package demo3;

import java.util.Objects;

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("张三", 10);
        System.out.println(person1);
        Person person2 = new Person("张三", 10);
        System.out.println(person2);
        System.out.println("=============");

        //此时比较的是变量中的值(地址)
        System.out.println(person1 == person2);

        System.out.println(person1.equals(person2));

    }
}
