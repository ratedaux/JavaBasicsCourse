package homework08;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово hello: ");
        String str = ("hello");
        String str1 = scanner.nextLine();
        int i = 0;
        int k = 0;
        int count = 0;
        while ((i <= str1.length()) && (k <= 4)) {
            char ch = str1.charAt(k);
            char ch1 = str.charAt(k);
            if (ch == ch1) {
                i++;
                k++;
            } else {
                System.out.println("Ошибка. Попробуйте еще раз: ");
                str1 = scanner.nextLine();
                count++;
                i = 0;
                k = 0;
            }
            i++;
            k++;
        }
        System.out.println("Спасибо. Количество попыток: " + count);
    }
}
