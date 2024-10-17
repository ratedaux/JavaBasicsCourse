package lesson25;

public class GenericApp {

    public static void main(String[] args) {

        GenericBox<String> stringBox=new GenericBox<>("Hello");

        //GenericBox<String> stringBox2=new GenericBox<>(25);
        //дженерики работают только с объектами, можем юзать только ссылочные типы данных
        //GenericBox<int> box= new GenericBox(20);
    }
}
