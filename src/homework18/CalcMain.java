package homework18;

import java.util.Scanner;

public class CalcMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        System.out.println("Sum result: " + calculator.sum(x, y));
        System.out.println("Substraction result: " + calculator.substraction(x, y));
        System.out.println("Multiplication result: " + calculator.multiplication(x, y));
        System.out.println("Division result: " + calculator.division(x, y));

    }
}
