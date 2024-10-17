package homework25;

public class MagicArrayGen<T> implements MyList {

    private T[] array;
    private int cursor;

    public MagicArrayGen() {
        array = (T[]) new Object[10];
    }

    public MagicArrayGen(T[] array) {
        if (array == null || array.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
            this.array = (T[]) new Object[array.length * 2];
            add(array);
        }
    }

    @Override
    public void add(Object value) {
        if (cursor == array.length - 1) {
            expandArray();
        }
        array[cursor] = (T) value;
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

    @Override
    public void addAll(Object[] values) {

    }

    public int size() {
        return cursor;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    //возвращает значение по индексу
    public T get(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return null; // no good solution
    }

    @Override
    public void set(int index, Object value) {

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

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int IndexOf(Object value) {
        return 0;
    }

    public T returnByIndex(int index) {
        return array[index];
    }

    @Override
    public int lastIndexOf(Object value) {
        int index = 0;
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) {
                index = i;
            }
        }
        return index;
    }

    public boolean remove(Object value) {
        int index = IndexOf((T) value);
        if (index == -1) return false;

        remove(index);
        return true;
    }

}
