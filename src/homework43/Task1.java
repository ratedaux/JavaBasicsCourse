package homework43;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    /*Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

    В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям:
    четные, больше 10 и меньше 100

    Для фильтрации используйте Stream API*/

    public static void main(String[] args) {
        List<Integer> integers=List.of(2,5,-10,100,76,-54,60,23,-2);
        System.out.println(filteredList(integers));
    }

    public static List<Integer> filteredList(List<Integer> list) {
        Stream<Integer> integerStream = list.stream()
                .filter(integer -> integer % 2 == 0 && integer > 10 && integer < 100);
        List<Integer> result=integerStream.collect(Collectors.toList());
        return result;
    }
}
