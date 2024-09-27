package homework11;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

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
        arithmeticMean(arr);
    }

    public static void arithmeticMean(int[] arr) {
        double average = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;
        System.out.println("Среднее арифметическое массива: " + average);
    }
}
