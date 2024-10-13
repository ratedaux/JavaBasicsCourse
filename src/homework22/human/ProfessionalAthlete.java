package homework22.human;

public class ProfessionalAthlete extends AmateurAthlete {

    ProfessionalAthlete(){
        setVelocity(25);
        setRestTime(5);
    }

    public String run() {
        return toString();
    }

    @Override
    public String toString() {
        return "Rest time for a professional is " + getRestTime();
    }
}
