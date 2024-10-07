package lesson18;

public class InitExample {

    private String title = "Hello";
    static String[] colors;
    static int counter = 1;
    private int capacity = 10;

    static {
        System.out.println("Static init block runs.");
        colors = new String[3];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "blue";
        counter = 10;
    }

    public InitExample() {
        System.out.println("Constructor runs!");
        this.title = "Constructor";
    }

    public String toString() {
        return "title: " + title + ", capacity: " + capacity + ", static counter" + counter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
