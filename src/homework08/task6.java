package homework08;

import java.util.Random;

public class task6 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rand = new Random();
        int average = 0;
        int sum = 0;
        int i = 0;
        while (i <= 9) {
            arr[i] = rand.nextInt(100) - 50;
            System.out.println(arr[i]);
            i++;
        }
        int min = arr[0];
        int max = 0;
        int k = 0;
        while (k <= 9) {
            if (min > arr[k]) {
                min = arr[k];
            }
            if (max < arr[k]) {
                max = arr[k];
            }
            sum = (sum + arr[k]);
            k++;
        }
        average = sum / arr.length;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);

    }
}
