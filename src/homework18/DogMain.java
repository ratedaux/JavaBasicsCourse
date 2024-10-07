package homework18;

public class DogMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Sharik";
        dog.jumpHeight = 10;
        System.out.println("Dog " + dog.name + ", jump Height: " + dog.jumpHeight);
        dog.jumpBarrier(15);

    }
}
