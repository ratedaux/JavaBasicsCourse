package homework31;

public enum Seasons {
    SUMMER(25.6, 42.5),
    AUTUMN(12.2, 20.0),
    WINTER(0.0, 10.4),
    SPRING(10.8, 22.5);

    private double lowestTemperature;
    private double highestTemperature;

    Seasons(double lowestTemperature, double highestTemperature) {
        this.lowestTemperature = lowestTemperature;
        this.highestTemperature = highestTemperature;
    }

    public double getLowestTemperature() {
        return lowestTemperature;
    }

    public double getHighestTemperature() {
        return highestTemperature;
    }

    public double averageTemperature() {
        double averageTemperature = 0;
        averageTemperature = (this.lowestTemperature + this.highestTemperature) / 2;
        return averageTemperature;
    }
}
