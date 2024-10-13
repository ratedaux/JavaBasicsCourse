package homework22.human;

public class AmateurAthlete extends Human {

    AmateurAthlete(){
        setVelocity(15);
        setRestTime(10);
    }

    @Override
    public String run() {
        return toString();
    }

    @Override
    public String toString() {
        return "Rest time for an amateur is " + getRestTime();
    }
}
