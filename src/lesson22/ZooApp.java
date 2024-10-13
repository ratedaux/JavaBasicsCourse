package lesson22;

public class ZooApp {

    public static void main(String[] args) {

        Cat cat=new Cat();
        cat.voice();
        System.out.println(cat.toString());
        cat.eat();

        Dog dog=new Dog();
        dog.voice();
        System.out.println(dog.toString());

        Hamster hamster=new Hamster();
        hamster.voice();
        System.out.println(hamster.toString());

        Test test=new Test();
        test.toString();



    }
}
