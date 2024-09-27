package lesson06;

import java.util.Random;

public class BooleanExample {

    public static void main(String[] args) {

        boolean bol1 = true;
        bol1 = false;

        int x = 10;
        int y = 5;
        boolean b1 = x == y;
        System.out.println(x + " == " + y + " -> " + b1);

        b1 = x!=y;
        System.out.println(x + " != " + y + " -> " + b1);

        b1 = x > y;
        System.out.println(x + " > " + y + " -> " + b1);

        y = 10;
        b1 = x >y;
        System.out.println(x + " > " + y + " -> " + b1);

        b1=x>=y;
        System.out.println(x + " >= " + y + " -> " + b1);

        x=7;
        b1=x<y;
        System.out.println(x + " <= " + y + " -> " + b1);

        String str = "Java is the best";
        boolean contains = str.contains("Java");
        System.out.println("str.contains(\"Java\"):" + contains);

        System.out.println("============= Логические операции ============== \n");
        boolean b2= !false; //true
        System.out.println("!false = " + b2);

        b2=!(4==5);
        System.out.println("!(4==5)" + b2);

        b2=true&true;
        System.out.println("true & true:" +b2);
        b2=(2<5) & (11==10);
        System.out.println("(2<5) & (11==10) -> " + b2);

        int x1=50;
        boolean b3=x1>0 & x1<100;

        //логическое или "|"
        boolean b4= true | false;
        System.out.println("true | false -> " + b4);
        System.out.println("false | false -> " + (false | false));

        //Введи четное число или число которое делится без остатка на 5

        //Генерация случайного числа
        Random random = new Random();
        int rand = random.nextInt(100);
        System.out.println("rand:" + rand);
        boolean isEven = rand %2 ==0;
        boolean isGoodNumber = (rand %2 ==0) | (rand %5 ==0);
        System.out.println("isEven: " + isEven);
        System.out.println("isGoodNumber:" + isGoodNumber);

        //XOR "^" (возвращает тру, если две части выражения разные)
        boolean b5= true^false;
        System.out.println("true^false " + b5);
        b5 = false^true;
        System.out.println("false^true " + b5);
        b5=true^true;
        System.out.println("true^true " + b5);
        b5=false^false;
        System.out.println("false^false " + b5);

        System.out.println("===================\n");

        //&& выдает тру только если обе части вырвжения равны тру
        boolean b6=true &&false;
        System.out.println("true &&false" + b6);
        b6 = true&&true;
        System.out.println("true&&true" + b6);
        b6=(2>5)&&(11==11);
        System.out.println("(2>5)&&(11==11)" + b6);

        int a = 10;
        int b = 2;
        //правая часть НЕ СЧИТАЕТСЯ / не выполняется, так как в левой части у нас false и зн переменной b7 не зависит от правой части
        boolean b7 = (b!=0) &&(a/b >2);
        System.out.println("(a/b)>2" + b7);

        //логическое сокращенное или ||
        boolean b8= true || (a/b>2);
        System.out.println("b8" + b8);
        System.out.println("=========Приоритет лоигческих операций=========");

        System.out.println(true^true&false);

    }
}
