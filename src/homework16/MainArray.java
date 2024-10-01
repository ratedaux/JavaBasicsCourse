package homework16;

import homework16.MagicArray2;
import lesson16.MagicArray;

public class MainArray {

    public static void main(String[] args) {
        MagicArray2 magicArray=new MagicArray2();

        magicArray.add(100);
        magicArray.add(200);
        magicArray.add(300);

        System.out.println(magicArray.toString());

        System.out.println("There are " + magicArray.size() + " elements in array up to now.");

        magicArray.add(500,600,700,800,900,1000,1100,1200,1300,1400,1500);
        System.out.println(magicArray.toString());

        magicArray.remove(5);
        System.out.println("Result array: " + magicArray.toString());

        System.out.println(magicArray.get(5));



    }


}
