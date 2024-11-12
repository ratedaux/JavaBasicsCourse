package homework44;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {

    /*Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.*/

    public static void main(String[] args) {
        List<String> strings=List.of("Apple", "One", "Ad", "Ableton");
        System.out.println(minLengthString(strings).toString());
    }

    private static String minLengthString(List <String> strings){
        Stream<String> stringStream = strings.stream()
                .min(Comparator.comparing(String::length)).stream();
        String result = stringStream.collect(Collectors.toList()).toString();
        return result;
    }
}
