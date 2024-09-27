package homework09;

public class task0 {

    public static void main(String[] args) {

        String str = ("hellooooo");
        System.out.println(str);
        symbolNumber(str);
    }

    public static void symbolNumber(String str) {
        int i = 0;
        int stringLength = 0;
        while (i < str.length()) {
            stringLength += 1;
            i++;
        }
        System.out.println("Длина строки: " + stringLength);
    }

}

