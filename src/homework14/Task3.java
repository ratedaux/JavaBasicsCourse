package homework14;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int vowels = 0;
        int consonants = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        char[] str = scanner.nextLine().toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'a' | str[i] == 'e' | str[i] == 'i' | str[i] == 'o' | str[i] == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.print("Vowels found: " + vowels + "\n");
        System.out.print("Consonants found: " + consonants);
    }
}
