package lesson18;

public class Test {

    int x;
    static int staticY;

    public void testNonStatic(){
    //у нестатический методов есть доступ КО ВСЕМ членам класса
        x++;
        staticY++;
        //может вызывать статические и НЕстатические методы
        testStatic();
    }

    public static void testStatic(){
    //статические методы видят ТОЛЬКО статические члены класса
        //x++; нет доступа к нестатическому полю х
        staticY++;
        //может вызвать только статические методы
    }

    public static void main(String[] args) {
        testStatic();
        Test test=new Test();
        test.testNonStatic();
    }
}
