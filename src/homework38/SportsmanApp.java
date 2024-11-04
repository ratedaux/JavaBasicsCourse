package homework38;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {

    public static void main(String[] args) {

        Sportsman[] sportsmen=new Sportsman[6];
        sportsmen[0]= new Sportsman("John",  20, 100);
        sportsmen[1]= new Sportsman("Tom",  23, 57);
        sportsmen[2]= new Sportsman("Anna",  25, 88);
        sportsmen[3]= new Sportsman("Andrew",  22, 99);
        sportsmen[4]= new Sportsman("Nick",  27, 75);
        sportsmen[5]= new Sportsman("Igor",  20, 94);

        System.out.println("\n ===========Sorted by name=========== \n");
        System.out.println(Arrays.toString(sportsmen));

        Arrays.sort(sportsmen);

        System.out.println(Arrays.toString(sportsmen));

        System.out.println("\n ===========Comparator=========== \n");

        ScoreComparator scoreComparator=new ScoreComparator();
        Arrays.sort(sportsmen, scoreComparator);

        System.out.println(Arrays.toString(sportsmen));

        System.out.println("\n ===========Anonymous class=========== \n");
        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return s1.getAge()-s2.getAge();
            }
        });

        System.out.println(Arrays.toString(sportsmen));

    }
}
