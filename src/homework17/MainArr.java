package homework17;

public class MainArr {

    public static void main(String[] args) {

        MagicArray3 magicArr = new MagicArray3();

        magicArr.add(500, 600, 700, 800, 900, 1000, 1100, 1200, 600, 1400, 1500);
        System.out.println(magicArr.toString());
        System.out.println(magicArr.lastIndexOf(600));


    }
}
