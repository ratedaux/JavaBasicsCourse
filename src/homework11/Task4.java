package homework11;

public class Task4 {

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 5, 15, 10, 5,};
        print(arr);
        int[] arr1 = deleteElement(arr, 15);
        print(arr1);
    }

    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i != arr.length - 1) ? ", " : "]\n"));
        }
    }

    public static int[] deleteElement(int[] arr, int num) {
        int[] resultArr;
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                size++;
            }
        }
        resultArr = new int[size];
        int i = 0;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] != num) {
                resultArr[i] = arr[k];
                i++;
            }
        }
        return resultArr;
    }
}
