package homework20.shape;

import homework20.shape.Shape;

public class Rectangle extends Shape {

    double width;
    double height;

    Rectangle(String name){
        super(name);
    }

    public void setDimensions(double width, double height){
        this.width=width;
        this.height=height;
    }

    public double calculateArea(double width, double height){
        return width*height;
    }


}
