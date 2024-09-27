package homework08;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите произвольное число: ");
        String num = scanner.nextLine();
        int i = 0;
        int sum = 0;
        char ch;
        while (i <= num.length()) {
            //sum+= (num.(i)) - '0';
            i++;
        }
        System.out.println(sum);
    }
}
