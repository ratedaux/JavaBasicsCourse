package lesson21;

import java.util.Arrays;

public class Autobus {

    /*
    Для создания связи типа HAS-A мы определяем поле класса,
    которое будет хранить ссылку на объект другого класса

    Ассоциация (в том числе и Агрегация, и Композиция) реализуется через создание ссылок
     на другие объекты внутри класса.
     Отношение, где один класс использует другой класс в качестве одного из своих полей

     Агрегация Autobus и BusDriver. Автобус содержит водителя,
     но водитель может существовать независимо от автобуса (пересесть в другой автобус, остаться дома и т.п)

     Композиция между Autobus и Autopilot. Автопилот является неотъемлемой частью автобуса.
     И не может существовать без автобуса.

     Важные аспекты ассоциации.
     Направленность связи. Однонаправленная или двунаправленная связь.

     Кардинальность связи. Определяет, сколько объектов одного класса может быть ассоциировано с объектом другого класса

     One-to-One (один к одному), One-to-Many (один ко многим), Many-to-Many (многие ко многим)

     1 : 1 -> Автобус и Двигатель
     Каждый автобус может иметь ровно один двигатель и на каждый двигатель приходится ровно один автобус

     1 : Many -> Автобус и Список пассажиров. Один автобус может перевозить множество пассажиров

     Many : Many -> Список Автобусов и список автобусных остановок.
     Каждый автобус останавливается на множестве остановок
     и каждая остановка может обслуживать множество автобусов

     */


    private static int counter = 1;

    private final int id;

    private final int capacity;
    private int countPassengers;

    private BusDriver driver; //агрегация (мягкая связь)
    private Autopilot autopilot; //композиция (жесткая/ неразрывная)

    private final Passenger[] passengers;

    public Autobus(BusDriver busdriver, int capacity) {
        this.id = counter++;
        this.capacity = capacity;
        this.driver = busdriver;
        this.autopilot = new Autopilot("AP=v001");
        //реализуем двунаправленную связь
        this.autopilot.setAutobus(this);
        this.passengers = new Passenger[capacity];
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;

         /*
        1. Надо проверить свободное место
        2. Находится ли этот пассажир уже в нашем автобусе?
        3. Если есть место и пассажир еще не в автобусе - садим на борт:
            3.1. Добавляем его в список пассажиров
            3.2. Увеличиваем кол-во пассажиров в автобусе
            3.3. Возвращаем true
        4. Если что-то пошло не так - выдаем сообщение об ошибке и возвращаем false
         */

        if (countPassengers < capacity) {
            // Место есть
            // Надо проверить, есть ли такой пассажир уже в автобусе
            if (isPassengerInBus(passenger)) {
                System.out.printf("Passenger id %d is in bus with id %d already!",
                        passenger.getId(), this.id);
                return false;
            }
            // Садим на борт пассажира
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Passenger %d got on the bus %d.",
                    passenger.getId(), this.id);
            return true;
        }
        // Сводного места нет
        System.out.printf("There is no free seats in bus %d!", this.id);
        return false;
    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }
        }
        return false;
    }

    public boolean dropPassenger(Passenger passenger) {
        if (passenger == null) {
            return false;
        }
        if (!isPassengerInBus(passenger)) {
            System.out.println("Passenger is not in the bus!");
            return false;
        } else {
            //remove passenger
            return true;
        }
    }

    public void showPassengerList() {
        //System.out.println(Arrays.toString(passengers));
        if (countPassengers == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers - 1) ? ", " : " ]");
        }
        System.out.println(sb.toString());
    }

    public void updateSoftwareVersion(String softwareVersion) {
        this.autopilot.setSoftwareVersion(softwareVersion);
    }

    public void installNewAutopilot(String softwareVersion) {
        //следим за правильностью ссылок с обеих сторон двунаправленной связи
        this.autopilot = new Autopilot(softwareVersion);
    }

    public String toString() {
        StringBuilder sb1 = new StringBuilder("Autobus: ");
        sb1.append("{id ").append(id);
        sb1.append(", capacity ").append(capacity);
        sb1.append("; driver: ").append(driver.toString());
        sb1.append("; autopilot: ").append(autopilot.toString());
        sb1.append("}");

        return sb1.toString();
    }

    public int getId() {
        return id;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public int getCapacity() {
        return capacity;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public static int getCounter() {
        return counter;
    }
}
