package homework20.animal;

public class AnimalMain {

    public static void main(String[] args) {

        Dog dog=new Dog("Sharik", 2, 1, 8);
        System.out.println(dog.toString() + " height " +
                dog.getHeight() + " weight " + dog.getWeight());
        dog.run();

        Fish fish=new Fish("John", 1, 2);
        System.out.println(fish.toString() + " fin length " + fish.getFinLength());
        fish.swim();
    }
}
