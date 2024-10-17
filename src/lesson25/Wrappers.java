package lesson25;

public class Wrappers {

    //классы-обертки используются для представления примитивных типов данных как объектов
    // Byte -> обертка для byte
    // Integer -> обертка для int
    // Character -> обертка для char

    public static void main(String[] args) {

        //Автоматическое приведение типов
        //Автоупаковка и автораспаковка

        Integer wrapperInt = 5; //автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; //автораспаковка; из типа Integer автоматически преобразов в int

        //сравнение объектов
        //кеширование объектов -128 - 127

        Integer a = 127;
        Integer b = 127;
        //так как это ссылочный тип данных, оператором == сравниваются ссылки
        System.out.println(a == b); //true

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); //false
        System.out.println(c.equals(d));
    }
}
