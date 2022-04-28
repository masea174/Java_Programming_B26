package day51_ihneritance.lyft;

public class CarRide {
    public static void main(String[] args) {
        Lyft obj1= new Lyft("JAmes",10);
        System.out.println(obj1.calculateRate(10));
        LyftXL obj2=new LyftXL("James",10);
        System.out.println(obj2.calculateRate(10));
    }
}
