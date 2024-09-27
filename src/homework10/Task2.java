package homework10;

public class Task2 {

    public static void main(String[] args) {

        String[] str = {"One", "Two", "Three", "Four", "Million"};
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + ", ");
        }
        System.out.println("\n");
        newArray(str);
    }

    public static String[] newArray(String[] arr) {
        String longestWord = " ";
        String shortestWord = arr[0];
        int maxLength = 0;
        int minLength = arr[0].length();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLength) {
                maxLength = arr[i].length();
                longestWord = arr[i];
            }
            if (arr[i].length() < minLength) {
                minLength = arr[i].length();
                shortestWord = arr[i];
            }
        }
        String[] arr1 = {shortestWord, longestWord};
        for (int k = 0; k < arr1.length; k++) {
            System.out.print(arr1[k] + ", ");
        }
        return arr1;
    }
}

