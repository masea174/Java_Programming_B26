package day52_inheritance.final_example;

public class UseFInalExample {

    public static void main(String[] args) {

        System.out.println(FinalExample.PLANET);
      //  FinalExample.PLANET="Mars"; we cannot reasign because it was final

        FinalExample obj=new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);

        FinalExample obj2= new FinalExample(100);
        System.out.println(obj2.b);
        System.out.println(obj2.a);
        //the final a is hardcoded from the beging in the class but b is asigned in the constructor

    }
}
class Childred extends FinalExample{
    public Childred(int b) {
        super(b);
    }





}