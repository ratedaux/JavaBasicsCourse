package lesson16;

public class MainDog {

    public static void main(String[] args) {

        Dog dog=new Dog("Sharik", 5);
        String info=dog.info();
        System.out.println(info);

        dog.run();
        dog.run();
        dog.run();
        dog.run();
        System.out.println(dog.info());
    }
}
