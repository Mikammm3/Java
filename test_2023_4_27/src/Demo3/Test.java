package Demo3;

interface IShape {
    int a = 10;

    void draw();

    default void test() {
        System.out.println("test");
    }

    public static void func() {
        System.out.println("static");
    }
}

class Rect implements IShape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Flower implements IShape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}

public class Test {
    public static void drawMap(IShape ishape) {
        ishape.draw();
    }

    public static void main(String[] args) {
        drawMap(new Rect());
        drawMap(new Flower());
    }
}
