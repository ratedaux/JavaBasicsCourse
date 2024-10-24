package lesson31;

public class AutoApp {

    public static void main(String[] args) {

        Color color = Color.RED;
        System.out.println(color);

        Auto auto = new Auto("Model1", Color.BLUE);
        System.out.println(auto);

        auto.setColor(color);
        System.out.println(auto);

        Color[] colors = Color.values();
        for (Color currentColor : colors) {
            System.out.println(currentColor);
        }


    }
}
