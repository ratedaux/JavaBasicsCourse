package lesson12;

import java.util.Arrays;
import java.util.Random;

public class ArraysMain {

    public static void main(String[] args) {

        int[] ints={21, 32, 10, 5, 54, 23, 87, 47, 1, 99};
        System.out.println(ints.length);

        int index = ArrayUtils.linearSearch(ints, 54);
        System.out.println("index: " + index);

        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(ints));

        ArrayUtils.sortSelection(ints);

        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(ints));

        int number=87;
        int idx=ArrayUtils.binarySearch(ints, number);
        System.out.println("Индекс в массиве: "+idx);

        int[] testArray=new int[100_000];
        Random random=new Random();
        for (int i=0; i< testArray.length;i++) {
            testArray[i]=random.nextInt(10_001);
        }
            ArrayUtils.sortSelection(testArray);
            number=9998;
            idx=ArrayUtils.binarySearch(testArray,number);
            System.out.println("Индекс числа в тестовом массиве (бинарный поиск): " + idx);

            idx=ArrayUtils.linearSearch(testArray,number);
            System.out.println("Индекс числа в тестовом массиве (линейный поиск): " + idx);

    }
}
