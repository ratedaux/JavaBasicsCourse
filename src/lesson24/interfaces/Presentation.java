package lesson24.interfaces;

public class Presentation implements ColorPrintable{

    String title;
    String author;
    String theme;
    int pages;

    public Presentation(String title, String author, String theme, int pages) {
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.pages = pages;
    }

    @Override
    public void colorPrint() {
        System.out.println("Sending presentation to typography.");
        System.out.printf("Printing presentation in colors: author %s, title: %s\n", author, title);
    }

    @Override
    public void print() {
        System.out.printf("Presentation by %s title: %s\n", author, title);
    }
}
