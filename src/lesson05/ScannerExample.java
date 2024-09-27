package lesson05;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя: ");
        String name = scanner.nextLine();

        System.out.println("Продолжение программы");

        System.out.println(name);

        //Прочитать целое число
        System.out.println("Возраст:");
        int age = scanner.nextInt(); //считать одно число типа инт
        System.out.println(age);

    }
}
