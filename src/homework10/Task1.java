package homework10;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\n");
        arrayCopy(arr, 10);
    }

    public static void arrayCopy(int[] arr, int num) {
        int[] arr1 = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        for (int k = 0; k < arr1.length; k++) {
            System.out.print(arr1[k] + ", ");
        }
    }
}

