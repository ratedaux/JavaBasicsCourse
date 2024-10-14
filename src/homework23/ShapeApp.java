package homework23;

public class ShapeApp {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle();
        rectangle.setSideA(5);
        rectangle.setSideB(10);
        System.out.println(rectangle.toString());

        Triangle triangle = new Triangle();
        triangle.setRadius(2);
        triangle.setSideLength(5);
        System.out.println(triangle.toString());

        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = triangle;

        double sumPerimeter = 0;
        double sumArea = 0;

        for (int i = 0; i < shapes.length; i++) {
            sumPerimeter += shapes[i].shapePerimeter();
            sumArea += shapes[i].shapeArea();
        }

        System.out.println("Perimeter sum = " + sumPerimeter);
        System.out.println("Area sum = " + sumArea);

    }
}
