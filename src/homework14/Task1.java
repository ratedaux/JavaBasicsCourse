package homework14;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + ((i != arr.length - 1) ? ", " : "]\n"));
        }
        evenSum(arr);
    }

    public static void evenSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.print("Сумма четных чисел: " + sum);
    }
}
