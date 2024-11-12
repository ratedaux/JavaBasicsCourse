package homework44;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {

    /*Имеется список целых чисел.
    Необходимо отфильтровать этот список, оставив только чётные числа,
    затем каждое число умножить на 2, и собрать результат в новый список*/

    public static void main(String[] args) {
        List<Integer> integers=List.of(2,5,-10,100,76,-54,60,23,-2);
        System.out.println(filteredList(integers));

    }

    public static List<Integer> filteredList(List<Integer> list) {
        Stream<Integer> integerStream = list.stream()
                .filter(integer -> integer % 2 == 0)
                .map(n -> n * 2);
        List<Integer> result=integerStream.collect(Collectors.toList());
        return result;
    }
}
