package homework03;

public class HomeWork03 {

    public static void main(String[] args) {

        //task 1
        int age = 24;
        double milk_price = 2.50;
        String name = "Katja";

        //task 2
        int var1=0;
        int var2=1;
        int var3 = 2;
        int var4 = 3;
        int result= (var1+var2+var3+var4) / 4;
        System.out.println("Result:" + result);

        //task 3
        int a_price = 1000;
        int b_price = 500;
        int sum = a_price+b_price;
        double percent= sum/100*10;
        double result1= sum-percent;
        System.out.println("Result:" + result1);
        System.out.println("Скидка: " + percent);

        //task 4
        int do_temp=16;
        int fr_temp=16;
        int sa_temp= 18;
        int so_temp=19;
        int mo_temp= 17;
        int di_temp=22;
        int mi_temp=24;
        double average_temp=(do_temp+fr_temp+sa_temp+so_temp+mo_temp+di_temp+mi_temp) / 7;
        System.out.println("Средняя температура: " + average_temp);

        //task 5
        //четные делятся на 2 без остатка, нечетные с остатком 1
        //целые числа делятся на 3 с остатком 0, 1, 2
    }
}
