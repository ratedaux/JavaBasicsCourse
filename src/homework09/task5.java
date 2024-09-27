package homework09;

public class task5 {

    public static void main(String[] args) {

        String[] str = {"One", "Two", "Three", "Four"};
        longestWord(str);
    }

    public static void longestWord(String[] words) {
        int maxLength = 0;
        String longestWord = " ";
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                longestWord = words[i];
            }
        }
        for (int i = 0; i < longestWord.length(); i++) {
            char ch = longestWord.charAt(i);
            System.out.println(ch);
        }
    }
}
