package day51_ihneritance.homework;

public class Phone extends Device {
    public Phone(String brand, String model, double price, boolean wireless) {
        super(brand, model, price, wireless);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void useDevice() {
        System.out.println("Using phone "+brand);
    }
}
