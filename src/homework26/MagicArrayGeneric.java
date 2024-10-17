package homework26;

import homework25.MyList;

public class MagicArrayGeneric<T> {

    private T[] array;
    private int cursor;

    public MagicArrayGeneric() {
        array = (T[]) new Object[10];
    }

    public MagicArrayGeneric(T[] array) {
        if (array == null || array.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
            this.array = (T[]) new Object[array.length * 2];
            add(array);
        }
    }

    public void add(T value) {
        if (cursor == array.length - 1) {
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    public void add(T... numbers) {
        //System.out.println("Accepted a few ints. To be precise " + numbers.length);
        //System.out.println("Under index 0 is " + numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }

    public void expandArray() {
        System.out.println("Expanding array... Cursor = " + cursor);

        T[] newArray = (T[]) new Object[array.length * 2];
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
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return null; // no good solution
    }

    public T remove(int index) {
        if (index >= 0 && index < cursor) {
            T deleted = array[index];

            if (index >= 0) {
                for (int i = index; i < cursor - 1; i++) {
                    array[i] = array[i + 1];
                }
            }
            cursor--;
            return deleted;
        }
        return null;
    }

    public int indexOf(Object value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public T returnByIndex(int index) {
        return array[index];
    }

    public int lastIndexOf(Object value) {
        int index = 0;
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                index = i;
            }
        }
        return index;
    }

    public boolean remove(T value) {
        int index = indexOf(value);
        if (index == -1) return false;

        remove(index);
        return true;
    }

}
