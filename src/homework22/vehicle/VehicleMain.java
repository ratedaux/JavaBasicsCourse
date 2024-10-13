package homework22.vehicle;

public class VehicleMain {

    public static void main(String[] args) {

        Car car=new Car();
        Motorcycle motorcycle=new Motorcycle();
        Bicycle bicycle=new Bicycle();

        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=car;
        vehicles[1]=motorcycle;
        vehicles[2]=bicycle;

        for(int i=0; i< vehicles.length; i++){
            vehicles[i].startEngine();
        }
    }
}
