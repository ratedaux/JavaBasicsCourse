package lesson20.transport;

public class Vehicle {

    private String model;
    private int year;

    public Vehicle(String model, int year){
        this.model=model;
        this.year=year;
    }

    public String toString(){
        return model + ", year of manufacture is " + year;
    }

    public void start(){
        System.out.println(model + " starts moving.");
    }

    public void stop(){
        System.out.println(model + "stops.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
