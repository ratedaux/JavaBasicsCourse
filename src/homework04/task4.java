package homework04;

public class task4 {

    public static void main(String[] args) {

        char[] myArray = {'k', 'a', 't', 'j', 'a'};
        for (int i=0; i<5; i++)
        {
            myArray[i]-=32;
            System.out.println(myArray[i]);
        }

    }
}
