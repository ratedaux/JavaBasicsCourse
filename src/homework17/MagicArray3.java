package homework17;

public class MagicArray3 {

    private int[] array;
    private int cursor;

    public MagicArray3() {
        array = new int[10];
    }

    public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    public MagicArray3(int[] array) {
        if (array == null || array.length == 0) {
            this.array = new int[10];
        } else {
            this.array = new int[array.length * 2];
            add(array);
        }
    }

    public void add(int value) {
        if (cursor == array.length - 1) {
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    public void add(int... numbers) {
        //System.out.println("Accepted a few ints. To be precise " + numbers.length);
        //System.out.println("Under index 0 is " + numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }

    public void expandArray() {
        System.out.println("Expanding array... Cursor = " + cursor);

        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
        System.out.println("Array expanded.");
    }

    public String toString() {
        if (cursor == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]");
        }
        return result;
    }

    public int size() {
        return cursor;
    }

    //возвращает значение по индексу
    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return Integer.MIN_VALUE; // no good solution
    }

    public int removeByIndex(int index) {
        if (index >= 0 && index < cursor) {
            int deleted = array[index];

            if (index >= 0) {
                for (int i = index; i < cursor - 1; i++) {
                    array[i] = array[i + 1];
                }
            }
            cursor--;
            return deleted;
        }
        return Integer.MIN_VALUE;
    }

    public int searchByIndex(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int returnByIndex(int index) {
        return array[index];
    }

    public int lastIndexOf(int value) {
        int index = 0;
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                index = i;
            }
        }
        return index;
    }

    public boolean removeByValue(int value) {
        int index = searchByIndex(value);
        if (index == -1) return false;

        removeByIndex(index);
        return true;
    }

}
