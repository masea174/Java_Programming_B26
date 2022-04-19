package day33_methods;

public class Car {
    /*
    unlock the car
    open the dor
    sit in the car
    close the door
    put seat belt
    start engine
    put in drive and go
     */
    public static void unlockTheCar(){
        System.out.println("Unlocking the car");
    }
    public static  void openDoor(){
        System.out.println("Openning the door");
    }
    public static void sitInCAr(){
        System.out.println("sit in the car");
    System.out.println("closing the door");
    }
    public static void preDrivingAction(){
        System.out.println("put on seat belt");
        System.out.println("check the mirrirs");
        System.out.println("Put on music");
        System.out.println("Put on navigation");

    }public static void startCar(){
        System.out.println("Starting car");
    }
    public static void driveAndGo(){
        System.out.println("Puting car in drive ");
        System.out.println("going forward");
    }
    public static void inRush(){
        unlockTheCar();
        sitInCAr();
        startCar();
        driveAndGo();


    }

    public static void main(String[] args) {
        unlockTheCar();
        unlockTheCar();
        openDoor();
        sitInCAr();
        preDrivingAction();
        startCar();
        driveAndGo();
        System.out.println();
        inRush();
    }
}
