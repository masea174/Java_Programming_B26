package day55_polymorphism.cloths;

public class Jacket extends Clothes implements HasHood{
    @Override
    public void wear() {
        System.out.println("Wear Jaket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Put the hood on");
    }
}
