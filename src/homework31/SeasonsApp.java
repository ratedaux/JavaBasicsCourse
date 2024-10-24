package homework31;

public class SeasonsApp {

    public static void main(String[] args) {

        for (Seasons season : Seasons.values()) {
            System.out.println(season);
            System.out.println(season.getLowestTemperature());
            System.out.println(season.getHighestTemperature());
            System.out.println("Average temperature is: " + season.averageTemperature());
        }

    }
}
