package lesson16;

public class Dog {

    String name;
    int weight;

    public Dog(String name, int weight){
        this.name=name;
        this.weight=weight;
    }

    String info(){
        return "I am dog " + name+ " my weight is " + weight;
    }

    void eat(){
        System.out.println("Omnomnom");
        weight++;
    }

    void run(){
        while(weight<5){
            System.out.println("I'm too skinny and hungry.");
            System.out.println("I should eat, my current weight is " + weight);
            eat();
        }
            System.out.println("I run!");
            weight -= 2;

    }
}
