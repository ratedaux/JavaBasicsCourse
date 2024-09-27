package homework06;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        String str1 = scanner.nextLine();
        int i = Integer.parseInt(str1);
        boolean isEven = (i % 2) == 0, divisibleBy3 = (i % 3 == 0), isEvenAndDivisibleBy3 = ((i % 2) == 0 && (i % 3 == 0));
        System.out.println("Число: " + i + " четное: " + isEven + " кратно 3: " + divisibleBy3 + " четное и кратное 3: " + isEvenAndDivisibleBy3);

    }
}
