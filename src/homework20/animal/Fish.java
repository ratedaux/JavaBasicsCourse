package homework20.animal;

public class Fish extends Animal{

    private double finLength;

    public Fish(String name, int age, double finLength){
        super(name, age);
        this.finLength=finLength;
    }

    public double getFinLength() {
        return finLength;
    }

    public void swim(){
        System.out.println("I swim!");
    }

}
