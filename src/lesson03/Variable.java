package lesson03;

public class Variable {

    public static void main(String[] args) {

        int myFirstVariable;
        myFirstVariable = 1;
        int mySecondVariable = 5;

        System.out.println(mySecondVariable);

        mySecondVariable = 50;
        System.out.println(mySecondVariable);

        System.out.println("Значение переменной: " + mySecondVariable);

        byte byteVariable = 125;
        byteVariable = 0;
        System.out.println("Значение переменной byteVariable: " + byteVariable);

        short shortVar;
        shortVar=31000;
        System.out.println("Значение переменной shortVar: " +shortVar);

        long longVar= 2100_000_0000L;
        System.out.println("long Variable:"+ longVar);

        float floatVar = 11.05F;
        System.out.println("Значение переменной floatVar: " +floatVar);

    }
}
