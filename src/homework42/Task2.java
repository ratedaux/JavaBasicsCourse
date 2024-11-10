package homework42;

import java.util.HashMap;

public class Task2 {

    public static HashMap<Integer, Integer> countWordsByLength(String text) {
        // Создаем HashMap для подсчета слов по длине
        HashMap<Integer, Integer> lengthCountMap = new HashMap<>();

        // Разбиваем текст на слова, используя регулярное выражение для учета разделителей
        String[] words = text.split("\\W+");

        // Обрабатываем каждое слово
        for (String word : words) {
            int length = word.length();

            if (length > 0) { // Игнорируем пустые слова (если будут)
                // Обновляем счетчик для данной длины слова
                lengthCountMap.put(length, lengthCountMap.getOrDefault(length, 0) + 1);
            }
        }

        return lengthCountMap;
    }

    public static void main(String[] args) {
        String text = "This is a simple example. Let's count the word lengths!";

        // Подсчитываем слова по длине
        HashMap<Integer, Integer> wordLengths = countWordsByLength(text);

        // Выводим результаты
        for (Integer length : wordLengths.keySet()) {
            System.out.println("Длина " + length + ": " + wordLengths.get(length) + " слов(а)");
        }
    }
}
