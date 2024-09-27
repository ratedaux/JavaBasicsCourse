package lesson09;

public class MethodExample {

    public static void main(String[] args) {

        sayHello();
        String string="Java";
        saySmth(string);
        char ch='a';
        printDecimalCodeChar(ch);
        int[] array={1, 5, 25, 57, 89, 100};
        printArray(array);
        System.out.println("===========Перезагрузка===========");
        printNumbers(10);
        printNumbers(5,10);
        //ПЕРЕГРУЗКА МЕТОДОВ
        /*
        * в пределах одного класса может существовать два и более методов с одинаковым названием, но разным набором параметров
        * одинаковое имя и одинаковый набор параметров недопустим
        *
        * Сигнатура метода - совокупность метода и набор параметров
        *  */
    }

    public static void printNumbers(int x, int y) {
        int i=x;
        while (i<=y) {
            System.out.print(i++ + ", ");
    }
    }
    public static void printNumbers(int n) {
        int i=1;
        while (i<=n) {
            System.out.print(i++ + ", ");
        }
    }
    public static void printArray(int[] array){
        System.out.print("[");
        int i=0;
        while (i<array.length) {
            System.out.print(array[i] + ((i< array.length - 1) ? ", " : "]\n"));
            i++;
        }
    }

    public static void printDecimalCodeChar(char ch1) {
        System.out.println((int)ch1);
    }
    public static void saySmth(String str) {
        System.out.println(str);
    }
    public static void sayHello() {
        System.out.println("Hello!");
    }
}
