package day51_ihneritance.access.a;

public class Second {
    //same pakage diferent class
    public static void main(String[] args) {
        First obj=new First();
        System.out.println(obj.one);
        System.out.println(obj.three);
        System.out.println(obj.two);
        //System.out.println(obj.four); is not acceseble because is private;
    }
}
