package homework04;

public class task3 {

    public static void main(String[] args) {

        long bigNumber = 15000000000L;
        int smallNumber=(int)bigNumber;
        System.out.println(smallNumber);

        //int меньше размером чем long, поэтому происходит потеря данных
        // правда она отличается от максимально допустимого числа в int(?)
    }
}
