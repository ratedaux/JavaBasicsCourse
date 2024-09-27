package lesson07;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        int y=125;
        if (y>11) {
            System.out.println("Hello!");
        }
        else {
            System.out.println("Bye!");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число от 1 до 10: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number==1) {
            System.out.println("Вы ввели число 1!");
        } else if (number==10) {
            System.out.println("Вы ввели число 10!");
        }
        else {
            System.out.println("Вы ввели неверное число!");
        }

        int x=5;
        switch (x) {
            case 5:
                System.out.println("x= 5");
                break;
            case 7:
                System.out.println("x=7");
                break;
            default:
                System.out.println("x=10");
        }
    }
}
