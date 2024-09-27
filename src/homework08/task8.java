package homework08;

public class task8 {

    public static void main(String[] args) {

        String[] words = new String[]{"One", "Two", "Three", "Four", "Million" };

        int maxLength = 0;
        String longestWord = " ";
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                longestWord = words[i];
            }
        }
        System.out.println("Longest word: " + longestWord);
    }
}
