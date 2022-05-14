package day54_abstractions.create_interface;

public class Book implements Create {

    @Override
    public void write() {
        System.out.println("writing a book");
    }

    @Override
    public void read() {
        System.out.println("Reading a book");
    }
}
