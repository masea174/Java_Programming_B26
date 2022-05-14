package day55_polymorphism.homework;

public class JavaTextBook extends EBook{
    boolean fun;

    @Override
    public void read() {
        System.out.println("Reading the Java Text Book");
    }

    @Override
    public void download() {
        System.out.println("Downloading the book");
    }
    @Override
    public void open() {
        System.out.println("Opening the java text book");
    }
}
