package lesson29.iterators;

import homework25.MagicArrayGen;
import homework25.MyList;

import java.util.Iterator;

public class ForEachExample {

    public static void main(String[] args) {
        MyList<String> list = new MagicArrayGen<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Python");

        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            String s= iterator.next();
            System.out.println(s);
            }

        //for each НЕ должен изменять состояние (добавлять или удалять элементы
        for (String s: list) {
            System.out.println(s);
        }
        }



    }

