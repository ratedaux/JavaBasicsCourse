package homework11;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int size;
        System.out.println("Введите размер массива: ");
        size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + ((i != arr.length - 1) ? ", " : "]\n"));
        }
        sumArray(arr);
    }

    public static void sumArray(int[] arr) {
        int sum = 0;
        System.out.println("Сумма элементов массива: ");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
