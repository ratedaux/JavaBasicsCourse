package lesson15;

public class Cat {

    public String name;
    public String color;
    public int age;

    public Cat(String catName, String color, int age){
        name=catName;
        this.color=color;
        this.age=age;
    }

    public void sleep(){
        System.out.println("I sleep.");
    }

    public void sayMeow(){
        System.out.println("Meow!");
    }
}
