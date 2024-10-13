package lesson22;

public class CastingExample {

    public static void main(String[] args) {

        Cat cat = new Cat();

        //восходящее и нисходящее преобразование

        Animal animal = new Cat(); //cat автоматически преобразуется к animal
        animal.voice();

        Animal animal2 = new Dog();
        Animal animal3 = new Hamster();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal2;
        animals[2] = animal3;

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }

        int i1 = 1001;
        double d1 = i1;
        System.out.println(d1);

        Cat catLink;
        Animal animalLink = new Cat();

        catLink = (Cat) animalLink;
        catLink.eat();

        System.out.println("\n=======================");

        for (int i=0; i< animals.length; i++) {
            System.out.println("sout: " + animals[i]);

            System.out.println(animals[i].getClass() + " instanceof Cat: "  + (animals[i] instanceof Cat)); //проверяем что объект может быть приведен к типу Cat
            Animal current=animals[i];
            if(animals[i] instanceof Cat) {
                System.out.println(i+"index can be safely casted to Cat.");
                Cat tempCat=(Cat) current;
                tempCat.eat();
            }

        }

    }
}
