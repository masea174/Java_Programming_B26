package day54_abstractions.create_interface;

public class Runner {
    public static void main(String[] args) {


        // Create obj = new Create(); cannot make objects of interfaces

        Book obj = new Book(); // Book is a normal (non-abstract) class
        obj.read();
        obj.write();

    }
}