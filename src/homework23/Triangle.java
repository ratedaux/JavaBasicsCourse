package homework23;

public class Triangle extends Shape {

    private int sideLength;
    private int radius;

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double shapeArea() {
        return radius * ((3 * sideLength) / 2);
    }

    @Override
    public double shapePerimeter() {
        return 3 * sideLength;
    }

    @Override
    public String toString() {
        return "Triangle side: " + sideLength + " radius of the inscribed circle: " + radius + "shape area: " + shapeArea() + " shape perimeter: " + shapePerimeter();
    }
}
