package lesson09;

public class MethodExample2 {

    public static void main(String[] args) {

        int temp=5;
        System.out.println("1: " + temp);
        changeMe(temp);
        System.out.println("2:" + temp);

    }
    public static void changeMe(String str) {
        str=str+"!!!";
    }
    public static void changeMe(int x) {
        x=100;
    }

}
