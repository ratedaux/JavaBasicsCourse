package homework24.task1;

public class Triathlete implements Swimmer, Runner {
    @Override
    public void swim() {
        System.out.println("I swim!");
    }

    public void run(){
        System.out.println("I run!");
    }
}
