package homework11;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 5, 15, 10, 5,};
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i != arr.length - 1) ? ", " : "]\n"));
        }
        boolean result = palindrome(arr);
        System.out.println(result);
    }

    public static boolean palindrome(int[] arr) {
        boolean isPalindrome = true;
        for (int i = 0; i < (arr.length / 2); i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
