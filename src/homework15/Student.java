package homework15;

public class Student {
    String name;
    int age;
    String group;
    int mark;

    public Student(String name, int age, String group, int mark){
        this.name=name;
        this.age=age;
        this.group=group;
        this.mark=mark;
    }

    public static void attendLectures(){
        System.out.println("Attending lectures...");
    }

    public static void skipLectures(){
        System.out.println("I'm staying home.");
    }

    public static void doHomework(){
        System.out.println("Homework is done.");
    }
}
