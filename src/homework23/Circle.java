package homework23;

public class Circle extends Shape {

    private double radius;
    private final double PI = 3.141516;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double shapeArea() {
        return PI * radius * radius;
    }

    @Override
    public double shapePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle radius: " + radius + " shape area: " + shapeArea() + " shape perimenter: " + shapePerimeter();
    }
}
