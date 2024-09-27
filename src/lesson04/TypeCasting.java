package lesson04;

public class TypeCasting {

    public static void main(String[] args) {

        /* Явное преобразование (кастинг)
        Неявное преобразование (автоматически)
        */

        byte byteVal = 123;
        int intVal;
        intVal = byteVal; //неявное преобразование из меньшего в больший тип данных
        System.out.println(intVal);

        double doubleVal = intVal;
        System.out.println(doubleVal);

        //явное использ когда нужно преобраз из большего типа данных в меньший
        double doubleValue = 42.3;
        int int1= (int) doubleValue;
        System.out.println(int1);
        System.out.println(doubleValue);

        short shortVal = (short)int1;
        System.out.println(shortVal);

        double bigDouble=3_000_000_000_000_000_000.00;

        //преобраз в вычислениях

        System.out.println("=============");

        int x = 20;
        int y = 7;
        double result;
        result=x/y;
        System.out.println(result);

        //когда в ыражении пристутствует несколько типеов данных, то все меньшие типы данных автоматически, неявно, кастируются в больший

        result=(float) x/y;
        System.out.println("result float cast:" + result);
    }
}
