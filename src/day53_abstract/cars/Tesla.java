package day53_abstract.cars;

public class Tesla extends ElectricCar{

    @Override
    public void start() {
        System.out.println("Press the button");
    }

    @Override
    public void charge() {
        System.out.println("Plug the cord to charge it");
    }
}
