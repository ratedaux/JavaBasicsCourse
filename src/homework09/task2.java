package homework09;

public class task2 {

    public static void main(String[] args) {

        power(5);
    }

    public static void power(int p) {
        int res=1;
        for (int i=0; i<p; i++) {
            res=res*2;
        }
        System.out.print("2 в степени " + p + " = " + res);
    }
}
