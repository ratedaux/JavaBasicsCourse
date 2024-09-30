package homework15;

public class Teacher {

    String name;
    String subject;

    public Teacher(String name, String subject){
        this.name=name;
        this.subject=subject;
    }

    public static void readLecture(){
        System.out.println("Reading lecture...");
    }

    public static void checkHomework(){
        System.out.println("Checking homework...");
    }
}
