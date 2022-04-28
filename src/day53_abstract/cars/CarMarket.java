package day53_abstract.cars;

public class CarMarket {

    public static void main(String[] args) {
        Honda car=new Honda();
        car.start();
        System.out.println();
        Toyota car2=new Toyota();
        car2.start();

    //    Car car2=new Car() cant create an object its an abstratct class same thing with ElectricCar that is abstract


        System.out.println();
        Tesla car4=new Tesla();
        car4.charge();
        car4.start();
        //tesla is the concrete class first class to inherit from the abstract clases

}}
