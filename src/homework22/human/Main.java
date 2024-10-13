package homework22.human;

public class Main {

    public static void main(String[] args) {

        Human human=new Human();
        System.out.println(human.run());

        AmateurAthlete amateurAthlete=new AmateurAthlete();
        System.out.println(amateurAthlete.run());

        ProfessionalAthlete professionalAthlete=new ProfessionalAthlete();
        System.out.println(professionalAthlete.run());

        Human human1=new Human();
        System.out.println(human1.run());
    }
}
