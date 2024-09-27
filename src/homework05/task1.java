package homework05;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String str1 = sc1.nextLine();
        int length = str1.length();
        System.out.println("Количество символов в имени пользователя:" + length);

        char sym1 = str1.charAt(0);
        char sym2 = str1.charAt(length - 1);
        int uniValue1 = sym1;
        int uniValue2 = sym2;

        System.out.println("Номер первого символа имени:" + uniValue1);
        System.out.println("Номер последнего символа имени:" + uniValue2);
    }
}
