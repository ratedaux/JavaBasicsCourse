package lesson21;

public class Autopark {

    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("John", "LN-2376473");

        Autobus bus = new Autobus(busDriver, 15);

        BusDriver busDriver1 = new BusDriver("Margo", "LN-12345");
        Autobus bus1 = new Autobus(busDriver1, 24);

        System.out.println("bus " + bus.toString());
        System.out.println("bus1 " + bus1.toString());

        BusDriver peter = new BusDriver("Peter", "LN-534q6");

        bus1.setDriver(peter);
        System.out.println("bus1: " + bus1.toString());


        bus.installNewAutopilot("AG-6538");
        System.out.println(bus.toString());

        busDriver.setName("Sebastian");
        System.out.println(bus.toString());

        System.out.println("=========================");
        System.out.println("Passenger number: " + bus.getCountPassengers());
        bus.showPassengerList();

        Passenger passenger=new Passenger("John");
        Passenger margo=new Passenger("Margo");

        bus.takePassenger(passenger);
        bus.showPassengerList();

        System.out.println("===============");
        bus.takePassenger(margo);
        bus.showPassengerList();
        System.out.println("===============");
        bus.takePassenger(margo);
        bus.showPassengerList();
    }
}
