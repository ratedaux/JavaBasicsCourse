package homework43;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {

    /*Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей,
которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.
Например, старше 25 лет и проживающих в городе "Berlin"*/


    public static void main(String[] args) {
        List<Person> people =List.of(
                new Person("Jack", "Berlin", 26),
                new Person("Tom", "Kyiv", 15),
                new Person("Anna", "Dresden", 30),
                new Person("Lucas", "Munich", 32));
        System.out.println(filteredByAge(people).toString());
        System.out.println(filteredByCity(people).toString());
    }

    private static List<Person> filteredByAge(List<Person> people) {
        Stream<Person> personStream = people.stream()
                .filter(person -> person.getAge() >25);
        List<Person> result=personStream.collect(Collectors.toList());
        return result;
    }

    private static List<Person> filteredByCity(List<Person> people) {
        Stream<Person> personStream = people.stream()
                .filter(person -> person.getCity() == "Berlin");
        List<Person> result=personStream.collect(Collectors.toList());
        return result;
    }


}
