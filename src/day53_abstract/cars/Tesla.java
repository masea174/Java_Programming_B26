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
//the abstract classes are the classes where you create the abstract methods , and then in the concrete classes the clases that will inherit the abstract clases you have to impliment the methods otherway it will not compile. i the regular classes you cannot have abstract methods.
