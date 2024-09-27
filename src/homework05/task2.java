package homework05;

public class task2 {

    public static void main(String[] args) {

        String str1 = "Java ";
        String str2 = "is ";
        String str3 = "a ";
        String str4 = "powerful ";
        String str5 = "language ";
        //метод конкатенации 1
        String concatStr = str1.concat(str2).concat(str3).concat(str4).concat(str5);

        //метод конкатенации 2
        String concatStr2 = str1 + str2 + str3 + str4 + str5;
        System.out.println("Получившаяся строка: " + concatStr);
        System.out.println("Длина строки:" + concatStr.length());

        //task 2.2
        concatStr2 = concatStr2.replace("powerful ", "super ");
        System.out.println(concatStr2);
    }
}
