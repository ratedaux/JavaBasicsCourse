package homework08;

public class task3 {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 100) {
            if (i % 5 == 0) {
                System.out.println(i);
                i++;
            } else i++;
        }
        System.out.println("===================");
        //task 3.1
        int k = 1;
        int count = 1;
        while (k <= 100) {
            if ((k % 5 == 0) && (count <= 7)) {
                System.out.println(k);
                k++;
                count++;
            }
            k++;
        }
    }
}
