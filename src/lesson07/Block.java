package lesson07;

public class Block {

    public static void main(String[] args) {

        int x=10;

        {
            int y=5;
            x=x+y;
            System.out.println("x: " +x);
            System.out.println("y: " +y);
        }
            //переменная у недоступна вне своего блока
        int y = 124;

    }
}
