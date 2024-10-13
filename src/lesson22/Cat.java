package lesson22;

public class Cat extends Animal {

    public void eat(){
        System.out.println("Cat eats.");
    }

    @Override
    public void voice(){
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "Cat.toString();";
    }
}
