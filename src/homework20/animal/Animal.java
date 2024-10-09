package homework20.animal;

public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return "Animal " + name + " age " + age;
    }

    public void eat(){
        System.out.println("I eat! Omnomnom.");
    }


}
