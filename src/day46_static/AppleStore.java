package day46_static;

public class AppleStore {
    public static void main(String[] args) {

        Iphone phone=new Iphone("Iphone10",1000);
        System.out.println(phone);

        Iphone phone2=new Iphone("Iphone12",1200);
        System.out.println(phone2);

        System.out.println(phone.company);
        System.out.println(Iphone.os);
        System.out.println(Iphone.appleDay);
    }
}
