package homework20.shape;

import homework20.shape.Circle;
import homework20.shape.Rectangle;

public class ShapeMain {

    public static void main(String[] args) {

    Rectangle rectangle=new Rectangle("rectangle");
    rectangle.setDimensions(5,10);

        System.out.println(rectangle.displayInfo());
        System.out.println("Rectangle area: " +
                rectangle.calculateArea(5,10));

        Circle circle=new Circle("circle");

        System.out.println(circle.displayInfo());
        System.out.println("Circle radius = " + circle.getRadius());


    }
}
