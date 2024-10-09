package homework20.animal;

public class Dog extends Animal {

    private double height;
    private double weight;

    public Dog(String name, int age, double height, double weight) {
        super(name, age);
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void run() {
        System.out.println("I run!");
    }
}
