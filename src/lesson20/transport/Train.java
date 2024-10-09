package lesson20.transport;

public class Train extends Vehicle {

    private int capacity;
    private int countPassengers;

    private int countWagons;
    private final int wagonCapacity;

    public Train(String model, int year, int wagonCapacity, int countWagons) {
        super(model, year);
        this.wagonCapacity = wagonCapacity;
        this.countWagons = countWagons;
        calculateCapacity();
    }

    public void calculateCapacity() {
        this.capacity = countWagons * wagonCapacity;

    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }


}
