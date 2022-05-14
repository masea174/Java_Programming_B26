package day55_polymorphism.interface_methods;

public class MacBookPro implements Mac{
    @Override
    public void turnOn() {
        System.out.println("Mac is turning on");
    }


}
class Runner{
    public static void main(String[] args) {
        System.out.println(Mac.NAME);
        System.out.println(Mac.SOFTWARE);
//        System.out.println(MacBookPro.NAME);
//        System.out.println(MacBookPro.SOFTWARE);

        //you can access the stattic variables by the child class reference but you should use the interface to access
Mac.company();
//Mac.faceTime();the default methods need s to be called from the objects .


        //Mac.turnOn();not valid ,need an object to call this method

        MacBookPro obj=new MacBookPro();
        obj.turnOn();
        obj.faceTime();

    }
}