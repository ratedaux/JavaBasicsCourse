package homework05;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите строку чётной длины с клавиатуры:");
        String str = sc1.nextLine();
        int length = str.length();
        System.out.println("Два средних символа строки:" + str.charAt((length / 2) - 1) + str.charAt((length / 2)));
    }
}
