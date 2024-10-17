package homework26;

public class PairTest {

    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Hello", "World");

        System.out.println(pair.getFirstValue());
        System.out.println(pair.getSecondValue());

        pair.swap();
        System.out.println(pair.getFirstValue());
        System.out.println(pair.getSecondValue());
    }
}
