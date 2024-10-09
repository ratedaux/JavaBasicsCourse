package homework19;

public class Calculator2 {

    public static final double PI = 3.141519;
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int... ints) {
        int sum = a;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            return Integer.MAX_VALUE;
        }
        return a / b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double circlePerimeter(double radius){
        return 2*PI*radius;
    }

    public static double circleArea(double radius){
        return PI*radius*radius;
    }

}
