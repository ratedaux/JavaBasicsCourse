package lesson15;

public class MainCats {

    public static void main(String[] args) {
        Cat cat=new Cat("Oscar", "white");
        cat.sayMeow();

        String catName=cat.name;
        System.out.println("Name:" + catName);

    }

}
