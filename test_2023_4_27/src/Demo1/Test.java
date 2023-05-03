package Demo1;


class Shape {
    public void draw() {
        System.out.println("画图形...");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("圆");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}

public class Test {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

//    public static void drawMaps1() {
//        Circle circle = new Circle();
//        Rect rect = new Rect();
//        Flower flower = new Flower();
//        String[] maps = {"Circle", "Rect", "Circle", "Rect", "Flower"};
//        for (int i = 0; i < maps.length; i++) {
//            if (maps[i].equals("Circle")) {
//                circle.draw();
//            } else if (maps[i].equals("Rect")) {
//                rect.draw();
//            } else {
//                flower.draw();
//            }
//        }
//    }

    public static void drawMaps1() {
        Shape[] shape = {new Circle(), new Rect(), new Circle(),
                new Rect(), new Flower()};
        for (int i = 0; i < shape.length; i++) {
            shape[i].draw();
        }
    }

    public static void main(String[] args) {
        drawMaps1();
//        Circle circle = new Circle();
//        Rect rect = new Rect();
//        Flower flower = new Flower();
//        drawMap(circle);
//        drawMap(rect);
//        drawMap(flower);
    }
}
