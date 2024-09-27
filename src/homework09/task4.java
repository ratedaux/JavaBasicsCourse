package homework09;

public class task4 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        String str = " ";
        for (int i = 0; i < arr.length; i++) {
            str += Integer.toString(arr[i]);
            System.out.println(str);
        }
    }
}
