package lesson24.interfaces;

public class BooksApp {

    public static void main(String[] args) {

        Book book=new Book("Мастер и Маргарита", "Михаил Булгаков");
        book.print();

        Printable book1=new Book("Java Philosophy", "B. Eckkel");

        Journal journal = new Journal("Cosmopolitan", 154);
        System.out.println("===========================");

        Presentation presentation=new Presentation("Inheritance", "Noname", "Inheritance in OOP", 20);
        presentation.print();
    }
}
