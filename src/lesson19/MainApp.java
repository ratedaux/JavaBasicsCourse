package lesson19;


public class MainApp {

    public static void main(String[] args) {

        FinalDemo finalDemo = new FinalDemo(50);

        FinalDemo finalDemo1 = new FinalDemo();

        System.out.println(FinalDemo.PI);
        // Изменить значение константы не может ни один объект класса
        // FinalDemo.PI = 10.0;

        System.out.println(FinalDemo.COUNTRY.toUpperCase());
        System.out.println("Country: " + FinalDemo.COUNTRY);

        System.out.println("\n ================ \n");
        System.out.println("finalDemo.getPiX(): " + finalDemo.getPiX());


    }
}
