package homework44;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    /*Из списка целых чисел выделите те значения, которые больше 10;
    отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране*/

    public static void main(String[] args) {
        List<Integer> integers = List.of(10, 34, 2, 7, 56, 43, 98, -10);
        System.out.println(sortedIntegers(integers).toString());
    }

    private static List<Integer> sortedIntegers(List<Integer> list) {
        Stream<Integer> integerStream = list.stream()
                .filter(i -> i > 10)
                //.sorted((a,b) -> Integer.compare(a%10, b%10))
                .sorted(Comparator.comparingInt(a -> a % 10));
        List<Integer> result = integerStream.collect(Collectors.toList());
        return result;
    }


}
