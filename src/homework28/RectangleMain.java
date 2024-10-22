package homework28;

import homework25.MagicArrayGen;
import homework25.MyList;

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(3, 3);

        System.out.println(rectangle1.toString());

        System.out.println(rectangle.toString());

        System.out.println("======================");

        Rectangle rectangle2 = new Rectangle(3, 3);
        System.out.println(rectangle2.equals(rectangle1));
        System.out.println(rectangle2.equals(rectangle));

        MyList<Rectangle> rectangles = new MagicArrayGen<>();
        rectangles.add(rectangle);
        rectangles.add(rectangle2);
        rectangles.add(rectangle1);

        System.out.println();


    }
}
