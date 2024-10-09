package homework19;

import homework18.Calculator;

public class CalcMain2 {

    public static void main(String[] args) {

        int div = Calculator.divide(15, 3);
        System.out.println("div: " + div);

        double divDouble = Calculator.divide(10.0, 4);
        System.out.println("divDouble: " + divDouble);

        int sum = Calculator.add(1, 4, 5, 6, 8, 10);
        System.out.println("sum: " + sum);

        double circleLength=Calculator2.circlePerimeter(2);
        System.out.println("Circle length:" + circleLength);

        double circleArea=Calculator2.circleArea(4);
        System.out.println("Circle area: " + circleArea);

    }
}
