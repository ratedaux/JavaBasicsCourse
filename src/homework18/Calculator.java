package homework18;

public class Calculator {

    static int x;
    static int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    static int sum(int x, int y) {
        return (x + y);
    }

    static int substraction(int x, int y) {
        return (x - y);
    }

    static int multiplication(int x, int y) {
        return (x * y);
    }

    static double division(int x, int y) {
        return (x / y);
    }


}
