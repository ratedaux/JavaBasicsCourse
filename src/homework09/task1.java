package homework09;

public class task1 {

    public static void main(String[] args) {

        int[] arr = {1, 10, 6, 64, 19, 33, 56, 18};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nМассив в обратном порядке: ");
        reverseArr(arr);
        System.out.println("\nРезультат 1: ");
        reverseArr(arr, 2);
        System.out.println("\nРезультат 2: ");
        reverseArr(arr, false);
    }

    public static void reverseArr(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void reverseArr(int[] arr, int i) {
        for (int k = 0; k < i; k++) {
            System.out.print(arr[k] + ", ");
        }
        for (int k = arr.length - 1; k > i - 1; k--) {
            System.out.print(arr[k] + ", ");
        }
    }

    public static void reverseArr(int[] arr, boolean bool) {
        if (bool == true) {
            System.out.println("Массив в обратном порядке: ");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + ", ");
            }
        } else {
            System.out.println("Массив в прямом порядке: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
