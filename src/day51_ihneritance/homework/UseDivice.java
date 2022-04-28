package day51_ihneritance.homework;

public class UseDivice {
    public static void main(String[] args) {

        Phone obj1= new Phone("Iphone","X",1000,true);
        obj1.useDevice();
        System.out.println(obj1);

        TV obj2 =new TV("Samsung","LCD",300,false);
        obj2.useDevice();
        System.out.println(obj2);

        Device obj3 =new Device("Apple","MacBook Pro",2000,true);
        obj3.useDevice();
        System.out.println(obj3);
    }
}
