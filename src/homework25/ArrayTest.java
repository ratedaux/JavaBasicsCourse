package homework25;

public class ArrayTest {

    public static void main(String[] args) {

        MagicArrayGen<Integer> numbers = new MagicArrayGen<>();

        numbers.addAll(1, 2, 3, 4, 5, 6);

        System.out.println(numbers);

        System.out.println(numbers.IndexOf(4));

        numbers.remove(5);
        System.out.println(numbers);

        MagicArrayGen<String> strings = new MagicArrayGen<>();
        strings.add("Java");
        strings.add("Python");
        System.out.println(strings);
    }
}
