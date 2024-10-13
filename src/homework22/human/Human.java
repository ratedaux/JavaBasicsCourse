package homework22.human;

public class Human {

    private int velocity = 10;
    private int restTime = 15;

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getRestTime() {
        return restTime;
    }

    public String run() {
        return toString();
    }

    public String toString() {
        return "Rest time for a human is " + restTime;
    }
}
