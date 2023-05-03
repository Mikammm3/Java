package Demo2;


abstract class Shape {
    public abstract void draw();
    //被abstract修饰的方法叫做抽象方法，抽象方法可以没有具体实现
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("圆");
    }
}

public class Test {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        drawMap(new Rect());
        //new Rect() ->  匿名对象 没有名字的对象
        //匿名对象的缺点是：每次使用都得重新实例化
    }
}

