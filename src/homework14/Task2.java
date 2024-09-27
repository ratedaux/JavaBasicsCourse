package homework14;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[10];
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + ((i != arr.length - 1) ? ", " : "]\n"));
        }
        int[] res = sortSelection(arr);
        print(res);
        secondMaxInt(res);
    }

    public static void print(int[] arr) {
        System.out.print("Sorted array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i != arr.length - 1) ? ", " : "]\n"));
        }
    }

    public static int minIndex(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int[] sortSelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;
        }
        return array;
    }

    public static void secondMaxInt(int[] arr) {
        System.out.print("Second max value: " + arr[arr.length - 2]);
    }
}
