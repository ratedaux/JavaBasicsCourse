package homework40;

import java.util.*;

public class Task1 {

    /*Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

    Если строки имеют одинаковую длину - сортировать в естественном порядке
    */

    public static LinkedHashSet<String> getUniqueSortedWords(String str) {
        String newString = str.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        System.out.println(newString);

        // Преобразование строки в массив слов
        String[] words = newString.split(" ");
        System.out.println(Arrays.toString(words));

        for(int i = words.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,
             если они имеют неправильный порядок,
             то меняем местами */
                if( words[j].length() > words[j+1].length() ){
                    String tmp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = tmp;
                }
            }
        }

        // Arrays.asList(T[] array) -> преобразует массив в коллекцию
        List<String> list = Arrays.asList(words);
        System.out.println(list);
        LinkedHashSet<String> linkedHashSet
                = new LinkedHashSet<String>(list);
        return linkedHashSet;
    }

}
