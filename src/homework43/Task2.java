package homework43;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {

    /*Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву
    (например, "A") и отсортируйте их в алфавитном порядке.
    Результат сохраните в новый список строк.
    Опционально + удалите дубликаты из списка строк*/

    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Banana", "Strawberry", "Ananas", "Avocado", "Apricot");
        System.out.println(filteredStrings(strings));

    }

    public static List<String> filteredStrings(List<String> strings) {
        Stream<String> stringStream = strings.stream()
                .filter(str -> str.startsWith("A"))
                .map(String::toUpperCase)
                .sorted();
        List<String> result = stringStream.collect(Collectors.toList());
        return result;
    }
}
