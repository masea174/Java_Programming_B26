package day46_static;

public class UseComputer {
    public static void main(String[] args) {
        Computer comp=new Computer(600,"Apple","White");

        Computer comp1=new Computer(900,"Samsung","Black");
        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasMemory);
        System.out.println(Computer.hasScreen);
        System.out.println(comp);
        System.out.println(comp1);
        comp1.hasBattery=false;
        System.out.println(comp.hasBattery);

    }
}
