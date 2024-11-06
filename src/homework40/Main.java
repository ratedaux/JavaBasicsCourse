package homework40;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static homework40.Task1.getUniqueSortedWords;
import static homework40.Task2.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("================Task1=================");
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));

        System.out.println("================Task2=================");
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersection(set1, set2));
        System.out.println("Difference: " + difference(set1, set2));
    }
}
