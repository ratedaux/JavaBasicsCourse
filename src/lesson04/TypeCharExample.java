package lesson04;

public class TypeCharExample {

    public static void main(String[] args) {

        char a ='A';
        char a1=65; // перемен будет хранить  букву А соответсв коду 65 в десятичной системе счисл
        char a2=0x41; //присв число в 16-ричном формате
        a2=0x0041; //полн форма записи числа в 16 системе счисления
        char a3='\u0041'; // еще один способ задания значения
        char x='\u15D7';

        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(x);

        char digit0=48;
        System.out.println(digit0);
       // digit0 =  (char) (digit0+5);
        int var=5;
        var+=5;
        System.out.println(var);
        var-=2;
        var*=2;
        var/=2;
        System.out.println(var);
        digit0+=5; // digit0=(char) (digit0+5);
        System.out.println(digit0);

        char letter=97;
        System.out.println(letter);
    }
}
