package lesson20.transport;

public class TransportApp {

    public static void main(String[] args) {

        Bus bus=new Bus("Bus-X1", 2020, 10);

        System.out.println(bus.toString());

        bus.start();
        bus.stop();

        System.out.println("bus.getModel(): " + bus.getModel());
        System.out.println(bus.getCapacity());

        System.out.println("======================");

        Train train=new Train("Skoda", 2022, 4, 40);

        System.out.println(train.toString());
        train.start();
        System.out.println(train.getModel());

    }
}
