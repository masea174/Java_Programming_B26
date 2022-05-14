package day55_polymorphism.interface_methods;

public interface Mac {
    String NAME="Mac"; // public static final variables
    String SOFTWARE="IOS";

    void turnOn();//public abstract
// how to crwate a method with implemantation in a interface
    // one way is static method:
    static void company(){
        System.out.println("Aplle");
        System.out.println("HQ in LA");
        System.out.println("New release in NOV");
    }

    // one waay is a deafult method:
    public default void faceTime(){
        System.out.println("Opening facetime");
        System.out.println("Calling somebody");
    }
}
