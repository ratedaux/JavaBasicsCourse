package lesson05;

public class StringExample {

    public static void main(String[] args) {

        String string = "Java";
        String string1 = new String("Hello"); //старый метод, не рекомендуемый
        System.out.println(string);

        //получить кол-во символов в строке
        int length = string.length();
        System.out.println(length);

        //метод позволяет все символы строки в верхний регистр
        System.out.println(string.toUpperCase());

        //чтобы сохранить результат метода нужно сохранить его в переменную
        String stringUpper = string.toUpperCase();

        String str1="One";
        String str2 = " ";
        String str3 = "Hello";

        //Разл варианты склеивания / объединения строк (конкатенация)

        String concatStr= str1+str2+str3;
        System.out.println(concatStr);

        System.out.println(1+3);
        //сложение + конкатенация
        System.out.println(1 + 3 + " : " + 2 + 3);

        System.out.println(1 + 3 + ":" + (2+3));

        //конкат 2
        String concatStr2 = str1.concat(str2);
        concatStr2 = concatStr2.concat(str3);
        System.out.println(concatStr2);

        //цепочка методов
        String concatStr3 = str1.concat(str2).concat(str3).concat("!");
        System.out.println(concatStr3);

        //конкат 3
        String concatStr4 = str1 + " " + str3 + " " + "java";
        concatStr4 = String.join("===", str1, str3, "java");
        System.out.println(concatStr4);

        //Приведение типов. Когда есть строка = знак плюс это знак конкатенации. Все типы данных преобраз в строки
        int id=1;
        int id2=2;
        String string2 = "Hello" + id + id2;
        System.out.println(string2);
        string2 = "Hello" + (id+id2);
        System.out.println(string2);

        String digits= "0123456789";
        System.out.println(digits.length());
        //взять символ из строки по номеру
        char firstChar = digits.charAt(0);
        System.out.println(firstChar);
        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println(lastChar);

        //Выделдение подстроки
        String subString = digits.substring(2); //выделить подстроку со второго индекса и до конца строки
        System.out.println(subString);

        String subString2 = digits.substring(2, 7); //взять символы с 2 (включительно) до 7 (не включительно)
        System.out.println(subString2);
    }
}
