package day43_constroctors;

public class UsePhone {
    public static void main(String[] args) {
        Phone phone1=new Phone("Iphone 11");
        Phone phone2=new Phone("Apple","Iphone12",13.3);
        Phone phone3=new Phone("Iphone13","Apple",128,13.3);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }
}
