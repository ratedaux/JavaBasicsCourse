package homework28;

import homework25.MagicArrayGen;
import homework25.MyList;

import java.util.Objects;

public class Rectangle {

    private double length;
    private double width;


    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.length, length) == 0 && Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    public static void removeDuplicates(MyList<Rectangle> rectangles, Rectangle rectangle) {
        while (rectangles.contains(rectangle)) {
            rectangles.remove(rectangle);
        }
    }

    public static MyList<Rectangle> removeOnlyDuplicates(MyList<Rectangle> rectangles, Rectangle rectangle) {
        MyList<Rectangle> result=new MagicArrayGen<>();

        for(int i=0; i< rectangles.size(); i++) {
            if (!result.contains(rectangles.get(i))) {
                result.add(rectangles.get(i));

            }
        }
        return result;
    }

}
