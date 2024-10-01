package homework16;

public class MagicArray2 {

    int[] array;
    int cursor;

    public MagicArray2() {
        array = new int[10];
    }

    void add(int value) {
        if (cursor == array.length - 1) {
        expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    void add(int... numbers){
        //System.out.println("Accepted a few ints. To be precise " + numbers.length);
        //System.out.println("Under index 0 is " + numbers[0]);
        for(int i=0; i<numbers.length; i++) {
            add(numbers[i]);
        }
    }

    void expandArray() {
        System.out.println("Expanding array... Cursor = " + cursor);

        int[] newArray = new int[array.length * 2];
        for (int i=0; i<cursor; i++) {
            newArray[i]=array[i];
        }

        array=newArray;
        System.out.println("Array expanded.");
    }

    public String toString(){
        if(cursor==0){
            return "[]";
        }        String result ="[";
        for(int i=0; i< cursor; i++){
            result=result+array[i]+(i<cursor-1 ? ", " : "]");
        }
        return result;
    }

    int size(){
        return cursor;
    }

    //возвращает значение по индексу
    int get(int index){
        if (index >=0 && index<cursor) {
            return array[index];
        }
        return Integer.MIN_VALUE; // no good solution
    }

    int remove(int index){
        int deleted=array[index];
        if(index>=0){
            for (int i=index; i<array.length; i++) {
                array[i-1] = array[i];
            }
            cursor--;
        }
        return deleted;
    }
}
