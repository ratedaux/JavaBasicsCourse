package lesson20.transport;

public class Bus extends Vehicle {

    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity) {
        //нужно создать обїект родителя
        super(model, year);
        this.capacity=capacity;

    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }


}
