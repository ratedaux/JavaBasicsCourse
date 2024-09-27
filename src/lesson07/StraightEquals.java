package lesson07;

public class StraightEquals {

    public static void main(String[] args) {

        String str1="Java"; //ссылочный тип данных, хранится ссылка на область памяти где находится объект типа стринг
        String str2="Java";
        String str3="JaVa";
        String str4=new String("Java");

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        //сравниваются значения которые хранятся в переменных (ссылки)
        boolean b1= (str1 == str2);
        System.out.println("str1 == str2 " + b1);
        System.out.println("str1 == str3 " + (str1 == str3));
        System.out.println("str1 == str4 " + (str1 == str4));

        //для сравнения строк по их значениям нужно использовать метод equals
        boolean b2 = str1.equals(str2);
        System.out.println("str1.equals(str2) -> " + b2);
        System.out.println("str1.equals(str3) -> " + str1.equals(str3));
        System.out.println("str1.equals(str4) -> " + str1.equals(str4));
        System.out.println("str1.equals(str3) -> " + str1.equalsIgnoreCase(str3));

    }
}
