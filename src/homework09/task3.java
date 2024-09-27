package homework09;

import java.util.Random;

public class task3 {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[50];
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        isPrime(arr);
    }

    public static void isPrime(int[] arr) {
        int count = 0;
        System.out.print("Простые числа: ");
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2 != 0) && (arr[i] % 3 != 0) && (arr[i] % 5 != 0)) {
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println("\n");
        System.out.println("Количество простых чисел: " + count);
    }
}
