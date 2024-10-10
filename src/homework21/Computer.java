package homework21;

public class Computer {

    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer() {
        processor = new Processor();
        memory = new Memory();
        storage = new Storage();
    }
}
