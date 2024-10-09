package homework20.shape;

import homework20.shape.Shape;

public class Circle extends Shape {

    private double radius;
    public static final double PI = 3.141519;

    Circle(String name){
        super(name);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void calculateArea(double radius){
    double area=PI*radius*radius;
        System.out.println("Circle area = " + area);
    }
}
