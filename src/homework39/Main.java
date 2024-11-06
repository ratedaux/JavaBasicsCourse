package homework39;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>(); // empty list of 10 elements
        list=new ArrayList<>(50); // empty list of 50 elements
        list =new ArrayList<>(List.of(1, -10, 5, 0, 25, -100));
        //creates list that consists of all elements of the specified collection (copies the elements of another collection)

        list=new LinkedList<>(); //creates empty list
        list =new LinkedList<>(Set.of(1, -10, 5, 0, 25, -100));

        // list methods

        //returns boolean, adds element int the end of the list
        list.add(1000);
        list.add(-100);
        System.out.println("list: " + list);

        //void add(int index, E element) adds element to a specified position
        list.add(2,100);
        System.out.println("list" + list);

        //E get(int index) returns element by index
        int value=list.get(2);
        System.out.println("list.get(2): " + value);

        //E remove(int index) removes element by index, returns old element
        System.out.println(list.remove(2));
        System.out.println(list);

        //deletion by definition (from collection) accepts Object
        list.remove(Integer.valueOf(1000));
        System.out.println(list);

        //search by value
        //int indexOf(Object obj)
        //int lastIndexOf()
        System.out.println("list.indexOf(-100)" + list.indexOf(-100));
        System.out.println("list.lastIndexOf(-100)" + list.lastIndexOf(-100));

        //void sort (Comparator <? super E> comparator sorts the list using specified comparator
        list.sort((i1, i2) -> i2.compareTo(i1));
        System.out.println(list);

        //List<E> subList(int indexFrom, int indexTo) - returns list of elements from indexFrom to indexTo
        List<Integer> sublist=list.subList(1,5);
        System.out.println(sublist);

    }
}
