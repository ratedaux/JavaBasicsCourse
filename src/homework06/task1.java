package homework06;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на выбор: 1, 2 или 3:");
        String str1 = scanner.nextLine();
        if (str1.contains("1")) {
            System.out.println("Один");
        } else if (str1.contains("2")) {
            System.out.println("Два");
        } else if (str1.contains("3")) {
            System.out.println("Три");
        } else {
            System.out.println("Неверный символ!");
        }
    }
}
