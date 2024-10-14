package homework23;

public class Rectangle extends Shape {

    private int sideA;
    private int sideB;

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideA() {
        return sideA;
    }

    @Override
    public double shapeArea() {
        return sideA * sideB;
    }

    @Override
    public double shapePerimeter() {
        return 2 * (sideB + sideA);
    }

    @Override
    public String toString() {
        return "Rectangle side A: " + sideA + " side B: " + sideB + " shape area: " + shapeArea() + " shape perimenter: " + shapePerimeter();
    }
}
