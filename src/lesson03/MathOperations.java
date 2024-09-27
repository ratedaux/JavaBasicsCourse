package lesson03;

public class MathOperations {

    public static void main(String[] args) {

        int var1=20;
        int var2=7;
        int result;
        result = var1+var2;
        System.out.println("Result:" + result);

        result = var1+5;
        System.out.println("Result:" + result);

        result=result+5;
        System.out.println("Result:" + result);

        result=var1-var2;
        System.out.println("Result:" + result);

        result= var1*var2;
        System.out.println("Result:" + result);

        result=(1+2)*2;
        System.out.println("Result:" + result);

        result=var1/var2;
        System.out.println("Result /:"+ result);

        System.out.println("16 / 5:" + 16 / 5);

        System.out.println("Остаток от деления 4/2: " + 4%2);
        System.out.println("====================");

        double doubleVar1=20.0;
        double doubleVar2=7.0;
        double resultD=doubleVar1/doubleVar2;
        System.out.println("resultD:"+resultD);


    }
}
