package lesson12;

public class ArrayUtils {

    public static int linearSearch(int[] arr, int searchValue) {
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            counter++;
            if (arr[i] == searchValue) {
                System.out.println("Надено за " + counter + " шагов.");
                return i;
            }
        }
        System.out.println("Не найдено. Шагов " +counter);
        return -1;
    }

    //ищет минимальное значение
    public static int minIndex(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    //метод ищет минимальное значение от стартового индекса и до конца массива
    public static int minIndex(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void sortSelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;
        }
    }

    //Бинарный поиск значения массива
    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        int count=0;
        //проверка, что часть массива можно разделить пополам
        while (startIndex <= endIndex) { //1. 0<=12
            //вычислить средний индекс
            count++;
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[middleIndex]==searchValue) {
                System.out.println("Надено за " + count + " шагов.");
                return middleIndex;
            }
            //если значения не равны, выбираем какую часть массива мы отбросим
            if (array[middleIndex]>searchValue) {
                endIndex=middleIndex-1;
            } else {
                startIndex=middleIndex+1;
            }
        }
        //если цикл закончен (не осталось частей массива которые можно поделить пополам)
        //значенит значение в массиве отсутствует
        System.out.println("Значение не найдено. Шагов сделано " + count);
        return -1;
    }
}
