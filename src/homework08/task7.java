package homework08;

import java.util.Random;

public class task7 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rand = new Random();
        int i = 0;
        while (i <= 9) {
            arr[i] = rand.nextInt(100) - 50;
            System.out.println(arr[i]);
            i++;
        }
        int min = arr[0];
        int max = 0;
        int minIndex = 0;
        int maxIndex = 0;
        int k = 0;
        while (k <= 9) {
            if (min > arr[k]) {
                min = arr[k];
                minIndex = k;
            } else if (max < arr[k]) {
                max = arr[k];
                maxIndex = k;
            }
            k++;
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        int swap = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = swap;
        System.out.println("Конечный массив: ");
        int p = 0;
        while (p <= 9) {
            System.out.println(arr[p]);
            p++;
        }

    }
}
