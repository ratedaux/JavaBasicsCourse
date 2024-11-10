package homework42;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    /*Напишите программу, которая проверяет, являются ли две заданные строки анаграммами
    (то есть содержат ли они одинаковые буквы в разном порядке).
     */

    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";
        if (areAnagrams(str1, str2)) {
            System.out.println("Строки являются анаграммами.");
        } else {
            System.out.println("Строки не являются анаграммами.");
        }

    }

    private static boolean areAnagrams(String str1, String str2) {
        // Если длины строк не совпадают, они не могут быть анаграммами
        if (str1.length() != str2.length()) {
            return false;
        }

        // Создаем две карты для подсчета символов в каждой строке
        HashMap<Character, Integer> charCountMap1 = new HashMap<>();
        HashMap<Character, Integer> charCountMap2 = new HashMap<>();

        // Заполняем первую карту для str1
        for (char c : str1.toCharArray()) {
            charCountMap1.put(c, charCountMap1.getOrDefault(c, 0) + 1);
        }

        // Заполняем вторую карту для str2
        for (char c : str2.toCharArray()) {
            charCountMap2.put(c, charCountMap2.getOrDefault(c, 0) + 1);
        }

        // Проверяем, равны ли обе карты (если да, то строки анаграммы)
        return charCountMap1.equals(charCountMap2);
    }
}
