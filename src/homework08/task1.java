package homework08;

public class task1 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        long mult = arr[0];
        int i = 0;
        while (i <= 14) {
            mult *= arr[i];
            i++;
        }
        System.out.println("Произведение всех чисел от 1 до 15 равно " + mult);
    }
}
