package lesson15;

public class Cat {

    String name;
    String color;
    int age;

    public Cat(String catName, String color){
        name=catName;
        this.color=color;
    }

    public void sleep(){
        System.out.println("I sleep.");
    }

    public void sayMeow(){
        System.out.println("Meow!");
    }
}
