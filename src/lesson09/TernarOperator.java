package lesson09;

public class TernarOperator {

    public static void main(String[] args) {

        int x=5;
        String res= (x>=0) ? "положительное" : "отрицательное";
        System.out.println("Число " + res);
    }
}
