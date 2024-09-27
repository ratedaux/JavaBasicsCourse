package lesson08;

public class ArraysExample {

    public static void main(String[] args) {

        int[] arr;
        String[] str;
        //int array[]; НЕ РЕКОМЕНДУЕТСЯ
        arr=new int[4];
        str=new String[10];
        int[] arr2=new int [8];
        boolean[] bool= new boolean[3]; //все значения будут фолс
        /* для числовых типов по дефолту 0
        * для boolean - false
        * для всех ссылочных - null
        *  */

        int value=arr[0];
        System.out.println(value);

    }
}
