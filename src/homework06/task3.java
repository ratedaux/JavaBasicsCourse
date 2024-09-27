package homework06;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        String str1 = scanner.nextLine();
        int num = Integer.parseInt(str1);
        int num1, num2, sum1, sum2;
        num1 = num / 100;
        num2 = num % 100;
        sum1 = (num1 / 10) + (num1 % 10);
        sum2 = (num2 / 10) + (num2 % 10);
        System.out.println("sum1:" + sum1);
        System.out.println("sum2:" + sum2);
        if (sum1 == sum2) {
            System.out.println("Счастливое число :)");
        } else {
            System.out.println("Несчастливое число :(");
        }
    }
}
