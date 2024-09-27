package homework10;

public class Task3 {

    public static void main(String[] args) {

        int[] arr = {10, 13, 23, 25, 29, 32, 56, 78, 99, 3};
        print(arr);
        int[] arr1 = isPrime(arr);
        print(arr1);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\n");
    }

    public static int[] isPrime(int[] arr) {
        int num = 0;
        int[] arr1;
        for (int i = 0; i < arr.length; i++) {
            if (checkPrime(arr[i])) {
                num++;
            }
        }
        arr1 = new int[num];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checkPrime(arr[i])) {
                arr1[j] = arr[i];
                j++;
            }
        }
        return arr1;
    }

    static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
